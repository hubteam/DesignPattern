package com.wxw.zerenlian;

public class Son extends Handler{

	public Son() {
		super(Handler.SON_LEVEL);
	}

	@Override
	public void response(Iwomen women) {
		System.out.println("ĸ���������ʾ");
		System.out.println(women.getRequest());
		System.out.println("���ӵĴ��ǣ�ͬ��");
	}
}
