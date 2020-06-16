package com.example.demos.entity;


import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * @author dingsong
 */
@Data
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String account;
    private String password;
    private String name;
    private LocalDate birth;
    private LocalDateTime createTime;
    private int sex;

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", createTime=" + createTime +
                ", sex=" + sex +
                '}';
    }
}
