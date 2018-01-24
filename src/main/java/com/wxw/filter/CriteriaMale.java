package com.wxw.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * ʵ�ֽӿڵ�ʵ����
 * @author ��ܰέ
 *
 */
public class CriteriaMale implements Criteria{

	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getGender().equalsIgnoreCase("MALE")){
				malePersons.add(person);
			}
		}
		return malePersons;
	}
}
