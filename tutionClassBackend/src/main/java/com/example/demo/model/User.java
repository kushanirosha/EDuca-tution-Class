package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID", updatable = false, nullable = false)
    private Integer userId;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "STATUS")
    private String status;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
