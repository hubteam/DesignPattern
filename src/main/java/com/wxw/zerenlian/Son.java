package com.wxw.zerenlian;

public class Son extends Handler{

	public Son() {
		super(Handler.SON_LEVEL);
	}

	@Override
	public void response(Iwomen women) {
		System.out.println("母亲向儿子请示");
		System.out.println(women.getRequest());
		System.out.println("儿子的答复是：同义");
	}
}
