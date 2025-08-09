package com.example.appclient;

import com.example.common.Message;
import com.example.ocsf.client.AbstractClient;

public class ChatClient extends AbstractClient {
    private final String username;

    public ChatClient(String host, int port, String username) {
        super(host, port);
        this.username = username;
    }

    @Override
    protected void handleMessageFromServer(Object msg) {
        if (msg instanceof Message) {
            Message m = (Message) msg;
            // Hiển thị tin nhắn đến
            // Nếu muốn tránh echo (nhận lại tin nhắn mình gửi) thì có thể kiểm tra sender
            System.out.println(m.toString());
        } else {
            System.out.println("Nhận từ server (không phải Message): " + msg);
        }
    }

    public void sendChat(String text) {
        try {
            Message m = new Message("CHAT", username, text);
            sendToServer(m);
        } catch (Exception e) {
            System.err.println("Không thể gửi message: " + e.getMessage());
        }
    }
}
