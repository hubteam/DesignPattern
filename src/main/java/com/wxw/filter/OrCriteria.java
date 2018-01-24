package com.wxw.filter;

import java.util.List;

/**
 * ���ߵĹ�ϵ
 * @author ��ܰέ
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
	 * �����׼2�ڱ�׼1��û�оͼ����׼1
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
