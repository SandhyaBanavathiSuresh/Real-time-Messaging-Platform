package com.realTime.chatApp.chat;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {

    private String content;
    private String sender;
    private MessageType type;

    public String getSender() {
        return sender;
    }

    public static ChatMessageBuilder builder() {
        return new ChatMessageBuilder();
    }
    public static class ChatMessageBuilder {
        private MessageType type;
        private String sender;
        private String content;

        public ChatMessageBuilder type(MessageType type) {
            this.type = type;
            return this;
        }

        public ChatMessageBuilder sender(String sender) {
            this.sender = sender;
            return this;
        }

        public ChatMessageBuilder content(String content) {
            this.content = content;
            return this;
        }

        public ChatMessage build() {
            ChatMessage chatMessage = new ChatMessage();
            chatMessage.type = this.type;
            chatMessage.sender = this.sender;
            chatMessage.content = this.content;
            return chatMessage;
        }
    }
}
