package com.wxw.zerenlian;

/**
 * 父亲的答复类
 * @author 王馨苇
 *
 */
public class Father extends Handler{

	public Father() {
		super(Handler.FATHER_LEVEL);
	}

	@Override
	public void response(Iwomen women) {
		System.out.println("女儿向父亲请示");
		System.out.println(women.getRequest());
		System.out.println("父亲的答复是：同义");
	}
}
