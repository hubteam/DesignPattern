package com.wxw.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现接口的实体类
 * @author 王馨苇
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
