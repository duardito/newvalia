package com.nva.support.dozer;

import org.dozer.Mapper;

import java.util.List;

/**
 * Created by edu on 07/12/2014.
 */
public interface DozerConversionInterface<T> {

    public  <M> M map (final Object sourceObject, final Class<M> destType);
    public <T, U> List<U> map(final Mapper mapper, final List<T> source, final Class<U> destType);
}
