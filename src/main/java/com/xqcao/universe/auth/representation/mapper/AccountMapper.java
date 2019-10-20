package com.xqcao.universe.auth.representation.mapper;

import com.xqcao.universe.auth.application.command.AccountCreateCommand;
import com.xqcao.universe.auth.domain.condition.AccountSearchCondition;
import com.xqcao.universe.auth.domain.entity.Account;
import com.xqcao.universe.auth.representation.request.AccountCreateRequest;
import com.xqcao.universe.auth.representation.request.AccountSearchRequest;
import com.xqcao.universe.auth.representation.response.AccountResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Pageable;

@Mapper
public interface AccountMapper {
    AccountMapper MAPPER = Mappers.getMapper(AccountMapper.class);

    AccountResponse toResponse(Account account);

    AccountSearchCondition toCondition(AccountSearchRequest request, Pageable pageable);

    AccountCreateCommand toCommand(AccountCreateRequest request);
}
