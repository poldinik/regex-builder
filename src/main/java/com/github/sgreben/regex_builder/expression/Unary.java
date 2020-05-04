package com.github.sgreben.regex_builder.expression;

import com.github.sgreben.regex_builder.Expression;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public abstract class Unary extends ExpressionBase {
    private final Expression child;
    private final List<Expression> children;

    public Unary(Expression child) {
        this.child = child;
        List<Expression> childrenList = new LinkedList<>();
        childrenList.add(child);
        this.children = Collections.unmodifiableList(childrenList);
    }

    @Override
    public Iterable<Expression> children() {
        return children;
    }

    public Expression child() {
        return child;
    }
}
