package com.xqcao.universe.auth.infrastructure.persistence.po;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "account")
public class AccountPo {

    @Id
    @GeneratedValue
    private UUID id;
    private String uid;
    private String name;
    private String email;
    private String password;
    private String createdBy;
    private String updatedBy;

    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;
}
