package com.wxw.zerenlian;

/**
 * 按照责任链处理类
 * @author 王馨苇
 *
 */
public abstract class Handler {

	public final static int FATHER_LEVEL = 1;
	public final static int HUSBAND_LEVEL = 2;
	public final static int SON_LEVEL = 3;
	//处理的级别
	private int level = 0;
	//责任传递，下一个责任人是谁
	private Handler nextHandler;
	
	public Handler(int level){
		this.level = level;
	}
	
	/**
	 * 处理请求，给出相应response
	 * @param women
	 */
	public final void HandlerMessage(Iwomen women){
		if(women.getType() == level){//这里的设计是模板模式
			this.response(women);
		}else{
			if(this.nextHandler != null){
				this.nextHandler.HandlerMessage(women);
			}else{
				System.out.println("没地方请示了，按照不同意来处理");
			}
		}
	}
	
	//设置责任链的下一个人是谁
	public void setNext(Handler nextHandler){
		this.nextHandler = nextHandler;
	}
	
	public abstract void response(Iwomen women);
}
