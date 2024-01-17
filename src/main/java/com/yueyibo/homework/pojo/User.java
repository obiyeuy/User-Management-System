package com.yueyibo.homework.pojo;

import java.time.LocalDateTime;

/**
 * ClassName:User
 * <p>
 * Package:com.yueyibo.homework.pojo
 * <p>
 * Description:
 * <p>
 *
 * @Author: yyb
 * @Create: 2023/12/24-20:57
 * @Version: v1.0
 */

public class User {
    private Integer id;
    private String username;
    private String password;


    public User() {
    }

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String toString() {
        return "User{id = " + id + ", username = " + username + ", password = " + password +   "}";
    }
}
