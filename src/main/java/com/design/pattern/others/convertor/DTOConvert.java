package com.design.pattern.others.convertor;

public interface DTOConvert<S,T> {
    T convert(S s);
}
