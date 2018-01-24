package com.wxw.filter;

import java.util.List;

/**
 * 满足两种标准[且的关系]
 * @author 王馨苇
 *
 */
public class AndCriteria implements Criteria{

	private Criteria one;
	private Criteria two;
	
	public AndCriteria(Criteria one,Criteria two) {
		this.one = one;
		this.two = two;
	}
	
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> first = one.meetCriteria(persons);
		return two.meetCriteria(first);
	}
}
