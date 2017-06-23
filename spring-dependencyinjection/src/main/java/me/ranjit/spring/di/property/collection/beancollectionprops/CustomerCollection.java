package me.ranjit.spring.di.property.collection.beancollectionprops;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by suzh on 6/8/2017.
 */
@Data
public class CustomerCollection {
    private List<Object> lists;
    private Set<Object> sets;
    private Map<Object, Object> maps;
    private Properties pros;
}
