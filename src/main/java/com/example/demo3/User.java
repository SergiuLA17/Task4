package com.example.demo3;

public class User {
    private String name;
    private String login;
    private String pass;

    public User(String name, String login, String pass) {
        this.name = name;
        this.login = login;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
