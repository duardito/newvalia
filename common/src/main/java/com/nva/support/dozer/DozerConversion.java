package com.nva.support.dozer;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edu on 07/12/2014.
 */
@Configuration
public class DozerConversion<M> implements DozerConversionInterface <M>{

    public <M> M map (final Object sourceObject, final Class<M> destType){
        final Mapper mapper = new DozerBeanMapper();
        final M destObject = mapper.map(sourceObject , destType);
        return destObject;
    }

    public <T, U> List<U> map(final Mapper mapper, final List<T> source, final Class<U> destType) {

        final List<U> dest = new ArrayList<>();

        for (final T element : source) {
            dest.add(mapper.map(element, destType));
        }

        return dest;
    }
}
