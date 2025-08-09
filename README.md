# Ứng dụng Chat Nhiều Client Dựa Trên OCSF

## 1. Giới thiệu
Đây là ứng dụng chat dạng console (dòng lệnh) sử dụng **OCSF Framework** (Object Client-Server Framework).  
Ứng dụng cho phép nhiều client kết nối đến server và gửi/nhận tin nhắn thời gian thực.

---

## 2. Chức năng
- Kết nối nhiều client tới một server duy nhất.
- Khi một client gửi tin nhắn, server sẽ **phát lại** cho tất cả client đang online.
- Tin nhắn hiển thị kèm tên người gửi.
- Gõ `exit` để ngắt kết nối client.

---

## 3. Cấu trúc thư mục

<img width="300" height="500" alt="image" src="https://github.com/user-attachments/assets/28417822-abea-445d-9fce-ff6f134f2911" />

---

## 4. Yêu cầu môi trường
- Java 8 trở lên.
- Thư mục `ocsf` đầy đủ file gốc (được cung cấp sẵn trong đề bài).
- Máy có thể mở nhiều terminal để chạy nhiều client.

---

## 5. Cách biên dịch và chạy

### Bước 1 — Biên dịch toàn bộ project
### Bước 2 — Chạy server
- Mặc định server chạy ở cổng 5555.
### Bước 3 — Chạy client (mỗi client ở một terminal riêng)
- Nhập tên bất kỳ.
- Gõ tin nhắn để gửi.
- Gõ exit để thoát.

---

## 6 screenshot IDE, mang hình chạy

ChatClient.java
---
<img width="750" alt="image" src="https://github.com/user-attachments/assets/6b089abd-180f-4c19-a61f-6011b7bf2e8a" />

ChatServer.java
---
<img width="750" alt="image" src="https://github.com/user-attachments/assets/e72d5e02-69ba-4132-82d9-e7d446863c68" />
<img width="750" alt="image" src="https://github.com/user-attachments/assets/3bd36ad4-9ab4-4f9a-b8ad-6b70fe297a11" />

Message.java
---
<img width="750" alt="image" src="https://github.com/user-attachments/assets/04c01e07-e437-482e-8ee5-eed73c73e217" />

MainClient.java
---
<img width="750" alt="image" src="https://github.com/user-attachments/assets/f3cf33fe-4fc3-45b4-a362-a32fa76a87a0" />

MainServer.java
---
<img width="750" alt="image" src="https://github.com/user-attachments/assets/a4cdad74-50ec-434f-aefb-4dec5a7551bb" />

Terminal 1 — Server
---
<img width="750" alt="image" src="https://github.com/user-attachments/assets/e7d91acf-f51e-467f-a834-507a35795d8d" />

Terminal 2 — Client A
---
<img width="750" alt="image" src="https://github.com/user-attachments/assets/e0fae7f6-2661-4bf6-abf3-09000f01cb88" />

Terminal 3 — Client B
---
<img width="750" alt="image" src="https://github.com/user-attachments/assets/b8aafe36-17af-4bb1-9e5a-be3052c02234" />

Terminal 1 — Server
---
<img width="750" alt="image" src="https://github.com/user-attachments/assets/b00342bc-21e5-4e56-9c17-d9528a18132d" />
