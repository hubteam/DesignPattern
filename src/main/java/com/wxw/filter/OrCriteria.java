package com.wxw.filter;

import java.util.List;

/**
 * 或者的关系
 * @author 王馨苇
 *
 */
public class OrCriteria implements Criteria{

	private Criteria one;
	private Criteria two;
	
	public OrCriteria(Criteria one,Criteria two) {
		this.one = one;
		this.two = two;
	}
	
	/**
	 * 如果标准2在标准1中没有就加入标准1
	 */
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> first = one.meetCriteria(persons);
		List<Person> second = two.meetCriteria(persons);
		for (Person person : second) {
			if(!first.contains(person)){
				first.add(person);
			}
		}
		return first;
	}
}
