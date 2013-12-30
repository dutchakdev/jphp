package ru.regenix.jphp.tokenizer.token.expr.operator.cast;

import ru.regenix.jphp.runtime.memory.LongMemory;
import ru.regenix.jphp.runtime.memory.support.Memory;
import ru.regenix.jphp.tokenizer.TokenMeta;
import ru.regenix.jphp.tokenizer.TokenType;

public class IntCastExprToken extends CastExprToken {
    public IntCastExprToken(TokenMeta meta) {
        super(meta, TokenType.T_INT_CAST);
    }

    @Override
    public Class<?> getResultClass() {
        return Long.TYPE;
    }

    @Override
    public Memory calc(Memory o1, Memory o2) {
        return LongMemory.valueOf(o1.toLong());
    }

    @Override
    public String getCode() {
        return "toLong";
    }
}
