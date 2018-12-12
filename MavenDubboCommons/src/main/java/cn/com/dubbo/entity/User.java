package cn.com.dubbo.entity;

import java.io.Serializable;

public class User implements Serializable {
    private int userId;
    private String userUserName;
    private String userName;
    private int userAge;
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserUserName() {
        return userUserName;
    }
    public void setUserUserName(String userUserName) {
        this.userUserName = userUserName;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getUserAge() {
        return userAge;
    }
    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
    @Override
    public String toString() {
        return "User [userId=" + userId + ", userUserName=" + userUserName + ", userName=" + userName + ", userAge="
                + userAge + "]";
    }

}
