package com.wxw.filter;

import java.util.List;

/**
 * Ϊ��׼����һ���ӿ�
 * @author ��ܰέ
 *
 */
public interface Criteria {

	public List<Person> meetCriteria(List<Person> persons);
}
