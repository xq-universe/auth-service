package com.xqcao.universe.auth.infrastructure.persistence.po;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "account")
public class AccountPo extends BasePo {
    private String uid;
    private String tel;
    private String email;
    private String status;
    private String password;
    private LocalDateTime activeDate;
    private LocalDateTime expiryDate;
}
