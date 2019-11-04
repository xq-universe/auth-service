package com.xqcao.universe.auth.domain.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class Account {
    private String id;
    private String uid;
    private String tel;
    private String email;
    private String status;
    private String password;
    private LocalDateTime activeDate;
    private LocalDateTime expiryDate;
}
