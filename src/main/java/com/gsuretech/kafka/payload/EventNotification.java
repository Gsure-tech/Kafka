package com.gsuretech.kafka.payload;

import java.util.HashMap;

public class EventNotification {

    private static final long serialVersionUID = 1L;
    private String notificationId = null;
    private String sender = null;
    private String receiver = null;
    private String notificationType = null;
    private String eventName = null;
    private String description = null;
    private String destinationUrl = null;
    private String timeReceived = null;
    private int retentionSecs;
    private String payloadVersion;
    private HashMap<String, Object> payload = null;
    private boolean read;

    public EventNotification() {
    }


    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getDestinationUrl() {
        return destinationUrl;
    }

    public void setDestinationUrl(String destinationUrl) {
        this.destinationUrl = destinationUrl;
    }

    public String getTimeReceived() {
        return timeReceived;
    }

    public void setTimeReceived(String timeReceived) {
        this.timeReceived = timeReceived;
    }

    public int getRetentionSecs() {
        return retentionSecs;
    }

    public void setRetentionSecs(int retentionSecs) {
        this.retentionSecs = retentionSecs;
    }

    public String getPayloadVersion() {
        return payloadVersion;
    }

    public void setPayloadVersion(String payloadVersion) {
        this.payloadVersion = payloadVersion;
    }

    public HashMap<String, Object> getPayload() {
        return payload;
    }

    public void setPayload(HashMap<String, Object> payload) {
        this.payload = payload;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    @Override
    public String  toString() {
        return "EventNotification{" +
                ", notificationId='" + notificationId + '\'' +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", notificationType='" + notificationType + '\'' +
                ", eventName='" + eventName + '\'' +
                ", description='" + description + '\'' +
                ", destinationUrl='" + destinationUrl + '\'' +
                ", timeReceived='" + timeReceived + '\'' +
                ", retentionSecs=" + retentionSecs +
                ", payloadVersion='" + payloadVersion + '\'' +
                ", payload=" + payload +
                ", read=" + read +
                '}';
    }
}
