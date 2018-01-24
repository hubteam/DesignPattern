package com.wxw.zerenlian;

public class Husband extends Handler{

	public Husband() {
		super(Handler.HUSBAND_LEVEL);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void response(Iwomen women) {
		System.out.println("妻子向丈夫请示");
		System.out.println(women.getRequest());
		System.out.println("丈夫的答复是：同义");
	}

}
