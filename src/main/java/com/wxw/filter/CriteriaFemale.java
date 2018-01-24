package com.wxw.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现过滤标准的实体类
 * @author 王馨苇
 *
 */
public class CriteriaFemale implements Criteria{

	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femalePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getGender().equalsIgnoreCase("FEMALE")){
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}
}
