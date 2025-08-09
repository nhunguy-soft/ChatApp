package com.example;

import com.example.appserver.ChatServer;

public class MainServer {
    public static void main(String[] args) {
        int port = 5555; // đổi nếu cần
        ChatServer server = new ChatServer(port);
        try {
            server.listen(); // bắt đầu lắng nghe
        } catch (Exception e) {
            System.err.println("Không thể khởi động server: " + e.getMessage());
        }
    }
}
