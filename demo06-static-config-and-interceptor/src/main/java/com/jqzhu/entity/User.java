package com.jqzhu.entity;

import lombok.Data;

/**
 * Created by zhujq18 on 2018/3/29.
 */

@Data
public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
