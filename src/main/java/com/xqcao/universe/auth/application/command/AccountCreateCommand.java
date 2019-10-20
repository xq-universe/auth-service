package com.xqcao.universe.auth.application.command;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AccountCreateCommand {
    private String uid;
    private String name;
    private String email;
    private String password;
}
