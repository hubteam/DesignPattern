package com.wxw.zerenlian;

/**
 * 女性类，发出请求
 * @author 王馨苇
 *
 */
public class Women implements Iwomen{

	private int type = 0;
	private String request = "";
	
	public Women(int type, String request){
		this.type = type;
		switch(this.type){
			case 1:
				this.request = "女儿的请求是：" + request;
				break;
			case 2:
				this.request = "妻子的请求是：" + request;
				break;
			case 3:
				this.request = "母亲的请求是：" + request;
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
