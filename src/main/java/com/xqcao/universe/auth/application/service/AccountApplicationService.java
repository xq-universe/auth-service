package com.xqcao.universe.auth.application.service;

import com.xqcao.universe.auth.application.command.AccountCreateCommand;
import com.xqcao.universe.auth.application.mapper.AccountMapper;
import com.xqcao.universe.auth.domain.condition.AccountSearchCondition;
import com.xqcao.universe.auth.domain.entity.Account;
import com.xqcao.universe.auth.domain.exception.BaseException;
import com.xqcao.universe.auth.domain.repository.AccountRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class AccountApplicationService {
    private final AccountRepository repository;

    public AccountApplicationService(AccountRepository repository) {
        this.repository = repository;
    }

    public Page<Account> searchAll(AccountSearchCondition condition) {
        return repository.search(condition);
    }

    public Account getOneById(String id) {
        return repository.getOneById(id)
                .orElseThrow(() -> new BaseException("com.universe.auth.account.notFound"));
    }

    public Account create(AccountCreateCommand command) {
        return repository.create(AccountMapper.MAPPER.toDomain(command));
    }
}
