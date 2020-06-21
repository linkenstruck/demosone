package com.example.demos.vo.res;

import lombok.Data;

import java.time.LocalDate;

@Data
public class LoginRes {
    private int id;
    private String account;
    private String name;
    private LocalDate birth;
    private int sex;
}
