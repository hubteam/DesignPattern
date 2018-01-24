package com.wxw.filter;

import java.util.List;

/**
 * 为标准创建一个接口
 * @author 王馨苇
 *
 */
public interface Criteria {

	public List<Person> meetCriteria(List<Person> persons);
}
