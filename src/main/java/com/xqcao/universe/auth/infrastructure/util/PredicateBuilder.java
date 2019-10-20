package com.xqcao.universe.auth.infrastructure.util;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class PredicateBuilder {
    private final BooleanBuilder builder;

    private PredicateBuilder() {
        builder = new BooleanBuilder();
    }

    public static PredicateBuilder builder() {
        return new PredicateBuilder();
    }

    public <T> PredicateBuilder andNotNull(Function<T, BooleanExpression> generator, T value) {
        if (Objects.nonNull(value)) {
            this.builder.and(generator.apply(value));
        }
        return this;
    }

    public <T> PredicateBuilder andNotEmpty(Function<List<T>, BooleanExpression> generator, List<T> values) {
        if (!CollectionUtils.isEmpty(values)) {
            this.builder.and(generator.apply(values));
        }
        return this;
    }

    public PredicateBuilder andNotEmpty(Function<String, BooleanExpression> generator, String value) {
        if (!StringUtils.isEmpty(value)) {
            this.builder.and(generator.apply(value));
        }
        return this;
    }

    public Predicate build() {
        return this.builder;
    }
}
