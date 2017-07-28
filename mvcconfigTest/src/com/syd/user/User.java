package com.syd.user;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by 278725692@qq.com on 2017/7/27.
 */
@Entity
@Table(name="user")
public class User {
    @Id
    @GenericGenerator(name="system-uuid", strategy="uuid")
    @GeneratedValue(generator="system-uuid")
    @Column(length=32)
    private String id;

    @Column(length=32)
    private String username;

    @Column(length=32)
    private String password;

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
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
    }



}
