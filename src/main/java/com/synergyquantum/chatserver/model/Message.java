package com.synergyquantum.chatserver.model;

public class Message {
    private String sender;
    private String content;
    private String timestamp;
    public String topicName;


    public Message() {
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Message(String sender, String content, String topicName) {
        this.sender = sender;
        this.content = content;
        this.topicName = topicName;
    }

    public String getContent() {
        return content;
    }
    public String getTopic() {
        return topicName;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender='" + sender + '\'' +
                ", content='" + content + '\'' +
                "topicName='"+ topicName + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
