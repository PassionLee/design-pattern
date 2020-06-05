package com.passion.filter;

import java.util.List;

/**
 * @author lsl
 * @date 2020/6/4
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
