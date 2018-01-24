package com.wxw.filter;

/**
 * 创建一个类，之后再该类上应用标准
 * @author 王馨苇
 *
 */
public class Person {

	private String name;
	private String gender;
	private String maritalstatus;
	
	public Person(String name,String gender,String maritalStatus){
	      this.name = name;
	      this.gender = gender;
	      this.maritalstatus = maritalStatus;        
	   }

	   public String getName() {
	      return name;
	   }
	   public String getGender() {
	      return gender;
	   }
	   public String getMaritalStatus() {
	      return maritalstatus;
	   } 
}
