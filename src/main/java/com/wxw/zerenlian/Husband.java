package com.wxw.zerenlian;

public class Husband extends Handler{

	public Husband() {
		super(Handler.HUSBAND_LEVEL);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void response(Iwomen women) {
		System.out.println("�������ɷ���ʾ");
		System.out.println(women.getRequest());
		System.out.println("�ɷ�Ĵ��ǣ�ͬ��");
	}

}
