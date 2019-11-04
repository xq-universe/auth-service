package com.xqcao.universe.auth.domain.condition;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Pageable;

@Setter
@Getter
public class AccountSearchCondition {
    private String uid;
    private String tel;
    private String email;

    private Pageable pageable;
}
