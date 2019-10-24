package com.xqcao.universe.auth.infrastructure.mapper;

import com.xqcao.universe.auth.domain.entity.Account;
import com.xqcao.universe.auth.infrastructure.persistence.po.AccountPo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AccountMapper {
    AccountMapper MAPPER = Mappers.getMapper(AccountMapper.class);

    Account toDomain(AccountPo po);

    AccountPo toPo(Account account);
}
