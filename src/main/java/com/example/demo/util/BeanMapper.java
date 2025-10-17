package com.example.demo.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BeanMapper {

    private static final ModelMapper mapper = new ModelMapper();

    public static <S, C> C map(S source, Class<C> clazz) {
        if (source == null) {
            return null;
        }
        return mapper.map(source, clazz);
    }

    public static <S, C> List<C> mapAsList(Collection<S> source, Class<C> clazz) {
        if (source == null) {
            return null;
        }
        return source.stream()
                .map(entity -> map(entity, clazz))
                .collect(Collectors.toList());
    }

}
