package com.xqcao.universe.auth.representation.controller;

import com.xqcao.universe.auth.application.service.AccountApplicationService;
import com.xqcao.universe.auth.domain.entity.Account;
import com.xqcao.universe.auth.representation.mapper.AccountMapper;
import com.xqcao.universe.auth.representation.request.AccountCreateRequest;
import com.xqcao.universe.auth.representation.request.AccountSearchRequest;
import com.xqcao.universe.auth.representation.response.AccountCreatedResponse;
import com.xqcao.universe.auth.representation.response.AccountResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    private final AccountApplicationService service;

    public AccountController(AccountApplicationService service) {
        this.service = service;
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public AccountCreatedResponse create(@RequestBody AccountCreateRequest request) {
        Account account = service.create(AccountMapper.MAPPER.toCommand(request));
        return new AccountCreatedResponse(account.getId());
    }

    @GetMapping("/")
    public Page<AccountResponse> searchAll(AccountSearchRequest request, Pageable pageable) {
        return service.searchAll(AccountMapper.MAPPER.toCondition(request, pageable))
                .map(AccountMapper.MAPPER::toResponse);
    }

    @GetMapping("/{id}")
    public AccountResponse getOneById(@PathVariable String id) {
        return AccountMapper.MAPPER.toResponse(service.getOneById(id));
    }
}
