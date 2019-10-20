package com.xqcao.universe.auth.domain.repository;

import com.xqcao.universe.auth.domain.condition.AccountSearchCondition;
import com.xqcao.universe.auth.domain.entity.Account;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface AccountRepository {
    Page<Account> search(AccountSearchCondition condition);

    Optional<Account> getOneById(String id);

    Account create(Account toDomain);
}
