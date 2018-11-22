package com.design.pattern.others.convertor;

import com.google.common.base.Function;

public abstract class Converter<A, B> implements Function<A, B> {
    
    protected abstract B doForward(A a);
    
    protected abstract A doBackward(B b);
    
}
