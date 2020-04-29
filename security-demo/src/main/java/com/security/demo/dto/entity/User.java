package com.security.demo.dto.entity;

/**
 * @author wangjiantao
 * @date 2020/4/29 11:31
 */
public class User {

    private String username;
    private String passeord;

    public User(String username, String passeord) {
        this.username = username;
        this.passeord = passeord;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasseord() {
        return passeord;
    }

    public void setPasseord(String passeord) {
        this.passeord = passeord;
    }
}
