package com.fy.travelscritic.background.comment.domain;

import java.util.Date;

public class User {
    private Integer userId;

    private Integer userSex;

    private Integer userAge;

    private String userPhoto;

    private String userPhone;

    private String userIdentity;

    private Date userBir;

    private String userDwell;

    private String userEmail;

    private String userSignature;

    private Integer userCollect;

    private String userPassword;

    private Date comCreate;

    private Date comUpdate;

    private Integer comYn;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto == null ? null : userPhoto.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(String userIdentity) {
        this.userIdentity = userIdentity == null ? null : userIdentity.trim();
    }

    public Date getUserBir() {
        return userBir;
    }

    public void setUserBir(Date userBir) {
        this.userBir = userBir;
    }

    public String getUserDwell() {
        return userDwell;
    }

    public void setUserDwell(String userDwell) {
        this.userDwell = userDwell == null ? null : userDwell.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserSignature() {
        return userSignature;
    }

    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature == null ? null : userSignature.trim();
    }

    public Integer getUserCollect() {
        return userCollect;
    }

    public void setUserCollect(Integer userCollect) {
        this.userCollect = userCollect;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Date getComCreate() {
        return comCreate;
    }

    public void setComCreate(Date comCreate) {
        this.comCreate = comCreate;
    }

    public Date getComUpdate() {
        return comUpdate;
    }

    public void setComUpdate(Date comUpdate) {
        this.comUpdate = comUpdate;
    }

    public Integer getComYn() {
        return comYn;
    }

    public void setComYn(Integer comYn) {
        this.comYn = comYn;
    }
}