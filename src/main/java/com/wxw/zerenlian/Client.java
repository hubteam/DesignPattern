package com.wxw.zerenlian;

import java.util.ArrayList;
import java.util.Random;

/**
 * ������
 * [Ҫ��������������һ����ʲô]
 * @author ��ܰέ
 *
 */
public class Client {

	public static void main(String[] args) {
		//�����ѡ������Ů��
		Random rand = new Random();
		ArrayList<Iwomen> list = new ArrayList<Iwomen>();
		for (int i = 0; i < 5; i++) {
			list.add(new Women(rand.nextInt(4),"��Ҫ��ȥ���"));
		}
		Handler father = new Father();
		Handler husband = new Husband();
		Handler son = new Son();
		
		//��������������һ����ʲô
		father.setNext(husband);
		husband.setNext(son);
		
		for (Iwomen women : list) {
			father.HandlerMessage(women);
		}
	}
}
