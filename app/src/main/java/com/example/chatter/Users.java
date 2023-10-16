package com.example.chatter;

import java.io.Serializable;

public class Users implements Serializable {
    String profilepic,mail,userName,password,userId,lastmessage,status;
    public Users() {
        // Default constructor
    }

    public Users(String userId, String userName, String emaill, String password, String profilepic, String status ){
        this.userId = userId;
        this.userName = userName;
        this.mail = emaill;
        this.password = password;
        this.profilepic = profilepic;
        this.status = status;

    }

    public String getProfilepic() {

        return profilepic;
    }

    public void setProfilepic(String profilepic) {

        this.profilepic = profilepic;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLastmessage() {
        return lastmessage;
    }

    public void setLastmessage(String lastmessage) {
        this.lastmessage = lastmessage;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}

