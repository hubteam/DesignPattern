package com.wxw.zerenlian;

/**
 * Ů���࣬��������
 * @author ��ܰέ
 *
 */
public class Women implements Iwomen{

	private int type = 0;
	private String request = "";
	
	public Women(int type, String request){
		this.type = type;
		switch(this.type){
			case 1:
				this.request = "Ů���������ǣ�" + request;
				break;
			case 2:
				this.request = "���ӵ������ǣ�" + request;
				break;
			case 3:
				this.request = "ĸ�׵������ǣ�" + request;
				break;
		}
	}
	
	public int getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

	public String getRequest() {
		// TODO Auto-generated method stub
		return this.request;
	}

}
