package com.roakee.practice04.entity;

public class User {
    private int id;
    private String name;
    private String username;
    private String pwd;
    private int age;
    private int numOfDevices = 8;
    String loginResult = "";

    public String getLoginResult() {
        return loginResult;
    }

    public void setLoginResult(String loginResult) {
        this.loginResult = loginResult;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumOfDevices() {
        return numOfDevices;
    }

    public void setNumOfDevices(int numOfDevices) {
        this.numOfDevices = numOfDevices;
    }
}
