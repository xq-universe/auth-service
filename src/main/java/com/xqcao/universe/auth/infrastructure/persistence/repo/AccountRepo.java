package com.xqcao.universe.auth.infrastructure.persistence.repo;

import com.xqcao.universe.auth.infrastructure.persistence.po.AccountPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<AccountPo, String>, QuerydslPredicateExecutor<AccountPo> {
}
