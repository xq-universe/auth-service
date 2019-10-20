package com.xqcao.universe.auth.application.mapper;

import com.xqcao.universe.auth.application.command.AccountCreateCommand;
import com.xqcao.universe.auth.domain.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {
    AccountMapper MAPPER = Mappers.getMapper(AccountMapper.class);

    Account toDomain(AccountCreateCommand command);
}
