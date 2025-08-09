package com.example;

import com.example.appclient.ChatClient;

import java.util.Scanner;

public class MainClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên người dùng: ");
        String name = sc.nextLine().trim();
        if (name.isEmpty()) name = "Anonymous";

        ChatClient client = new ChatClient("localhost", 5555, name);

        try {
            client.openConnection();
            System.out.println("Đã kết nối tới server. Gõ 'exit' để thoát.");
            while (true) {
                String line = sc.nextLine();
                if (line == null) break;
                if (line.equalsIgnoreCase("exit")) break;
                if (line.trim().isEmpty()) continue;
                client.sendChat(line);
            }
            client.closeConnection();
            System.out.println("Đã ngắt kết nối. Thoát chương trình.");
        } catch (Exception e) {
            System.err.println("Lỗi khi kết nối hoặc gửi: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
