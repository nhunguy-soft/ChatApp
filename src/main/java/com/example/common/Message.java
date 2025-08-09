package com.example.common;

import java.io.Serializable;

public class Message implements Serializable {
    private static final long serialVersionUID = 1L;

    public String type;    // "CHAT", "REGISTER", ...
    public String sender;
    public String payload;

    public Message(String type, String sender, String payload) {
        this.type = type;
        this.sender = sender;
        this.payload = payload;
    }

    public String getType() { return type; }
    public String getSender() { return sender; }
    public String getPayload() { return payload; }

    @Override
    public String toString() {
        return "[" + type + "] " + sender + ": " + payload;
    }
}
