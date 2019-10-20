package com.xqcao.universe.auth.infrastructure.repository;

import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.xqcao.universe.auth.domain.condition.AccountSearchCondition;
import com.xqcao.universe.auth.domain.entity.Account;
import com.xqcao.universe.auth.domain.repository.AccountRepository;
import com.xqcao.universe.auth.infrastructure.mapper.AccountMapper;
import com.xqcao.universe.auth.infrastructure.persistence.repo.AccountRepo;
import com.xqcao.universe.auth.infrastructure.util.PredicateBuilder;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;

import java.util.Optional;

import static com.xqcao.universe.auth.infrastructure.persistence.po.QAccountPo.accountPo;

@Component
public class AccountRepositoryImpl implements AccountRepository {
    private final AccountRepo repo;
    private final JPAQueryFactory queryFactory;

    public AccountRepositoryImpl(EntityManager entityManager, AccountRepo repo) {
        this.repo = repo;
        this.queryFactory = new JPAQueryFactory(entityManager);
    }

    @Override
    public Page<Account> search(AccountSearchCondition condition) {
        Predicate predicate = PredicateBuilder.builder()
                .andNotEmpty(accountPo.uid::like, condition.getUid())
                .andNotEmpty(accountPo.name::like, condition.getName())
                .andNotEmpty(accountPo.email::like, condition.getEmail())
                .build();
        return repo.findAll(predicate, condition.getPageable())
                .map(AccountMapper.MAPPER::toDomain);
    }

    @Override
    public Optional<Account> getOneById(String id) {
        return repo.findById(id).map(AccountMapper.MAPPER::toDomain);
    }

    @Override
    public Account create(Account account) {
        return AccountMapper.MAPPER.toDomain(repo.save(AccountMapper.MAPPER.toPo(account)));
    }
}
