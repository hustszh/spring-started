package me.ranjit.spring.el.annotation.collection;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by suzh on 6/26/2017.
 */
@Data
@Component("itemBean")
public class Item {
    private Map<String, String> map;
    private List<String> list;

    public Item() {
        map = new HashMap<String, String>();
        map.put("MapA", "This is MapA");
        map.put("MapB", "This is MapB");
        map.put("MapC", "This is MapC");

        list = new ArrayList<String>();
        list.add("List0");
        list.add("List1");
        list.add("List2");

    }
}
