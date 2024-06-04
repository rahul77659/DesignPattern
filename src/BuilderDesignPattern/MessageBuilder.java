package BuilderDesignPattern;

public class MessageBuilder {
    @Override
    public String toString() {
        return "MessageBuilder{" +
                "content='" + content + '\'' +
                ", messageType=" + messageType +
                ", sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", isDelivered=" + isDelivered +
                ", timestamp=" + timestamp +
                '}';
    }

    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;
    private MessageBuilder(Builder builder) {
        this.messageType = builder.messageType;
        this.content = builder.content;
        this.sender = builder.sender;
        this.recipient = builder.recipient;
        this.isDelivered = builder.isDelivered;
        this.timestamp = builder.timestamp;
//        this.messageType = builder.messageType;

    }
    public static Builder builder() {
        return new Builder();
    }

    public String getContent() {
        return content;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSender() {
        return sender;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDelivered(boolean delivered) {
        isDelivered = delivered;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    ///classes Builder
    public  static class  Builder {
        private MessageType messageType;
        private String content;
        private String sender;
        private String recipient;
        private boolean isDelivered;
        private long timestamp;

        public MessageBuilder build(){
            return new MessageBuilder(this);
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setDelivered(boolean delivered) {
            isDelivered = delivered;return this;

        }

        public Builder setMessageType(MessageType messageType) {
            this.messageType = messageType;return this;
        }

        public Builder setRecipient(String recipient) {
            this.recipient = recipient;return this;
        }

        public Builder setSender(String sender) {
            this.sender = sender;return this;
        }

        public Builder setTimestamp(long timestamp) {
            this.timestamp = timestamp;return this;
        }

        public String getContent() {
            return content;
        }

        public boolean isDelivered() {
            return isDelivered;
        }

        public MessageType getMessageType() {
            return messageType;
        }

        public String getRecipient() {
            return recipient;
        }

        public String getSender() {
            return sender;
        }

        public long getTimestamp() {
            return timestamp;
        }
    }
}
