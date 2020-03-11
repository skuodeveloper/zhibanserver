package com.nhga.zhibanserver.entity;

import java.util.List;

public class MachineData {
    /**
     * conversationId : cidZmZqAhb9uZ5ZB4ZEF4Lgcg==
     * atUsers : [{"dingtalkId":"$:LWCP_v1:$Kx1UdzLuu2MjM5ZAPS9UCS8h6h0IsOh8"}]
     * chatbotUserId : $:LWCP_v1:$Kx1UdzLuu2MjM5ZAPS9UCS8h6h0IsOh8
     * msgId : msgnInVPGz9QMJdPkOauPxSSw==
     * senderNick : 吴文奇
     * isAdmin : false
     * sessionWebhookExpiredTime : 1580963486095
     * createAt : 1580958086058
     * conversationType : 2
     * senderId : $:LWCP_v1:$O3m3hYRkDqPUBwGjrA9MjA==
     * conversationTitle : 自动回复机器人-TEST
     * isInAtList : true
     * sessionWebhook : https://oapi.dingtalk.com/robot/sendBySession?session=70200c867cc5bce5bf3de55581aa803e
     * text : {"content":" abcdefg"}
     * msgtype : text
     */

    private String conversationId;
    private String chatbotUserId;
    private String msgId;
    private String senderNick;
    private boolean isAdmin;
    private long sessionWebhookExpiredTime;
    private long createAt;
    private String conversationType;
    private String senderId;
    private String conversationTitle;
    private boolean isInAtList;
    private String sessionWebhook;
    private TextBean text;
    private String msgtype;
    private List<AtUsersBean> atUsers;

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public String getChatbotUserId() {
        return chatbotUserId;
    }

    public void setChatbotUserId(String chatbotUserId) {
        this.chatbotUserId = chatbotUserId;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getSenderNick() {
        return senderNick;
    }

    public void setSenderNick(String senderNick) {
        this.senderNick = senderNick;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public long getSessionWebhookExpiredTime() {
        return sessionWebhookExpiredTime;
    }

    public void setSessionWebhookExpiredTime(long sessionWebhookExpiredTime) {
        this.sessionWebhookExpiredTime = sessionWebhookExpiredTime;
    }

    public long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(long createAt) {
        this.createAt = createAt;
    }

    public String getConversationType() {
        return conversationType;
    }

    public void setConversationType(String conversationType) {
        this.conversationType = conversationType;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getConversationTitle() {
        return conversationTitle;
    }

    public void setConversationTitle(String conversationTitle) {
        this.conversationTitle = conversationTitle;
    }

    public boolean isIsInAtList() {
        return isInAtList;
    }

    public void setIsInAtList(boolean isInAtList) {
        this.isInAtList = isInAtList;
    }

    public String getSessionWebhook() {
        return sessionWebhook;
    }

    public void setSessionWebhook(String sessionWebhook) {
        this.sessionWebhook = sessionWebhook;
    }

    public TextBean getText() {
        return text;
    }

    public void setText(TextBean text) {
        this.text = text;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public List<AtUsersBean> getAtUsers() {
        return atUsers;
    }

    public void setAtUsers(List<AtUsersBean> atUsers) {
        this.atUsers = atUsers;
    }

    public static class TextBean {
        /**
         * content :  abcdefg
         */

        private String content;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

    public static class AtUsersBean {
        /**
         * dingtalkId : $:LWCP_v1:$Kx1UdzLuu2MjM5ZAPS9UCS8h6h0IsOh8
         */

        private String dingtalkId;

        public String getDingtalkId() {
            return dingtalkId;
        }

        public void setDingtalkId(String dingtalkId) {
            this.dingtalkId = dingtalkId;
        }
    }
}
