package com.xqcao.universe.auth.representation.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AccountCreateRequest {
    private String uid;
    private String name;
    private String email;
    private String password;
}
