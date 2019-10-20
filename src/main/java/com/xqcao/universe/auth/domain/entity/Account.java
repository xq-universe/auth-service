package com.xqcao.universe.auth.domain.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Account {
    private String id;
    private String uid;
    private String name;
    private String email;
    private String password;
}
