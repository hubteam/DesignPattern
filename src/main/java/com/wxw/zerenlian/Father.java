package com.wxw.zerenlian;

/**
 * ���׵Ĵ���
 * @author ��ܰέ
 *
 */
public class Father extends Handler{

	public Father() {
		super(Handler.FATHER_LEVEL);
	}

	@Override
	public void response(Iwomen women) {
		System.out.println("Ů��������ʾ");
		System.out.println(women.getRequest());
		System.out.println("���׵Ĵ��ǣ�ͬ��");
	}
}
