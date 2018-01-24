package com.wxw.zerenlian;

/**
 * ����������������
 * @author ��ܰέ
 *
 */
public abstract class Handler {

	public final static int FATHER_LEVEL = 1;
	public final static int HUSBAND_LEVEL = 2;
	public final static int SON_LEVEL = 3;
	//����ļ���
	private int level = 0;
	//���δ��ݣ���һ����������˭
	private Handler nextHandler;
	
	public Handler(int level){
		this.level = level;
	}
	
	/**
	 * �������󣬸�����Ӧresponse
	 * @param women
	 */
	public final void HandlerMessage(Iwomen women){
		if(women.getType() == level){//����������ģ��ģʽ
			this.response(women);
		}else{
			if(this.nextHandler != null){
				this.nextHandler.HandlerMessage(women);
			}else{
				System.out.println("û�ط���ʾ�ˣ����ղ�ͬ��������");
			}
		}
	}
	
	//��������������һ������˭
	public void setNext(Handler nextHandler){
		this.nextHandler = nextHandler;
	}
	
	public abstract void response(Iwomen women);
}
