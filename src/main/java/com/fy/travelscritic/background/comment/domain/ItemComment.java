package com.fy.travelscritic.background.comment.domain;

import java.util.Date;

public class ItemComment {
    private Integer comItemId;

    private Integer userId;

    private Integer itemId;

    private String comItemContent;

    private Date comItemRelease;

    private Date comItemCreate;

    private Date comItemUpdate;

    private Integer comItemYn;

    public Integer getComItemId() {
        return comItemId;
    }

    public void setComItemId(Integer comItemId) {
        this.comItemId = comItemId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getComItemContent() {
        return comItemContent;
    }

    public void setComItemContent(String comItemContent) {
        this.comItemContent = comItemContent == null ? null : comItemContent.trim();
    }

    public Date getComItemRelease() {
        return comItemRelease;
    }

    public void setComItemRelease(Date comItemRelease) {
        this.comItemRelease = comItemRelease;
    }

    public Date getComItemCreate() {
        return comItemCreate;
    }

    public void setComItemCreate(Date comItemCreate) {
        this.comItemCreate = comItemCreate;
    }

    public Date getComItemUpdate() {
        return comItemUpdate;
    }

    public void setComItemUpdate(Date comItemUpdate) {
        this.comItemUpdate = comItemUpdate;
    }

    public Integer getComItemYn() {
        return comItemYn;
    }

    public void setComItemYn(Integer comItemYn) {
        this.comItemYn = comItemYn;
    }
}