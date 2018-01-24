package com.wxw.zerenlian;

import java.util.ArrayList;
import java.util.Random;

/**
 * 运行类
 * [要设置责任链的下一方是什么]
 * @author 王馨苇
 *
 */
public class Client {

	public static void main(String[] args) {
		//随便挑选出几个女性
		Random rand = new Random();
		ArrayList<Iwomen> list = new ArrayList<Iwomen>();
		for (int i = 0; i < 5; i++) {
			list.add(new Women(rand.nextInt(4),"我要出去逛街"));
		}
		Handler father = new Father();
		Handler husband = new Husband();
		Handler son = new Son();
		
		//设置责任链的下一方是什么
		father.setNext(husband);
		husband.setNext(son);
		
		for (Iwomen women : list) {
			father.HandlerMessage(women);
		}
	}
}
