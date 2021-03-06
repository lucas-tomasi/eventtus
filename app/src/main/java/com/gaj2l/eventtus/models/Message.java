package com.gaj2l.eventtus.models;

import com.gaj2l.eventtus.lib.Entity;

import org.threeten.bp.OffsetDateTime;

import java.sql.Timestamp;

/**
 * Created by Jackson Majolo on 24/03/2017.
 */

public class Message extends Entity {
    private String content;
    private OffsetDateTime dtStore;
    private OffsetDateTime dtSend;
    private int userId;
    private int activityId;

    public Message() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public OffsetDateTime getDtStore() {
        return dtStore;
    }

    public void setDtStore(OffsetDateTime dtStore) {
        this.dtStore = dtStore;
    }

    public OffsetDateTime getDtSend() {
        return dtSend;
    }

    public void setDtSend(OffsetDateTime dtSend) {
        this.dtSend = dtSend;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    @Override
    public String toString() {
        return this.content;
    }
}
