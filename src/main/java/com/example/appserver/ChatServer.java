package com.example.appserver;

import com.example.common.Message;
import com.example.ocsf.server.AbstractServer;
import com.example.ocsf.server.ConnectionToClient;

public class ChatServer extends AbstractServer {
    public ChatServer(int port) {
        super(port);
    }

    @Override
    protected void handleMessageFromClient(Object msg, ConnectionToClient client) {
        if (msg instanceof Message) {
            Message m = (Message) msg;
            System.out.println("Server nhận: " + m.toString());

            // Gửi broadcast cho tất cả client
            try {
                sendToAllClients(m);
            } catch (Exception e) {
                System.err.println("Lỗi khi gửi đến clients: " + e.getMessage());
            }
        } else {
            System.out.println("Server nhận object lạ: " + msg);
        }
    }

    @Override
    protected void serverStarted() {
        System.out.println("Server đã khởi động. Lắng nghe cổng " + getPort());
    }

    @Override
    protected void serverStopped() {
        System.out.println("Server đã dừng.");
    }
}
