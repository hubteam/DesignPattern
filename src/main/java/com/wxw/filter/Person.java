package com.wxw.filter;

/**
 * ����һ���֮࣬���ٸ�����Ӧ�ñ�׼
 * @author ��ܰέ
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
