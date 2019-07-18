package com.fy.travelscritic.background.comment.domain;

import java.util.Date;

public class SpotsComment {
    private Integer comSpotsId;

    private Integer userId;

    private Integer spotsId;

    private String comSpotsContent;

    private Date comSpotsRelease;

    private Date comSpotsCreate;

    private Date comSpotsUpdate;

    private Integer comSpotsYn;

    public Integer getComSpotsId() {
        return comSpotsId;
    }

    public void setComSpotsId(Integer comSpotsId) {
        this.comSpotsId = comSpotsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSpotsId() {
        return spotsId;
    }

    public void setSpotsId(Integer spotsId) {
        this.spotsId = spotsId;
    }

    public String getComSpotsContent() {
        return comSpotsContent;
    }

    public void setComSpotsContent(String comSpotsContent) {
        this.comSpotsContent = comSpotsContent == null ? null : comSpotsContent.trim();
    }

    public Date getComSpotsRelease() {
        return comSpotsRelease;
    }

    public void setComSpotsRelease(Date comSpotsRelease) {
        this.comSpotsRelease = comSpotsRelease;
    }

    public Date getComSpotsCreate() {
        return comSpotsCreate;
    }

    public void setComSpotsCreate(Date comSpotsCreate) {
        this.comSpotsCreate = comSpotsCreate;
    }

    public Date getComSpotsUpdate() {
        return comSpotsUpdate;
    }

    public void setComSpotsUpdate(Date comSpotsUpdate) {
        this.comSpotsUpdate = comSpotsUpdate;
    }

    public Integer getComSpotsYn() {
        return comSpotsYn;
    }

    public void setComSpotsYn(Integer comSpotsYn) {
        this.comSpotsYn = comSpotsYn;
    }
}