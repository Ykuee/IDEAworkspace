package com.ssh.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Ykue on 2017/6/28.
 */
@Data
@Entity
@Table(name = "test_mvc")
public class Person {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "created")
    private long created = System.currentTimeMillis();

    @Column(name = "username")
    private String username;

    @Column(name = "addr")
    private String addr;

    @Column(name = "phone")
    private String phone;

    @Column(name = "remark")
    private String remark;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


}
