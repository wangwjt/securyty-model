package com.security.demo.dto.vo;

import com.security.demo.dto.entity.User;

import java.util.List;

/**
 * @author wangjiantao
 * @date 2020/4/29 11:31
 */
public class UserVO {

    List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
