package ����ģʽ.JDK��̬����;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {

	private Object target;

	public TimeHandler(Object target) {
		this.target = target;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object,
	 * java.lang.reflect.Method, java.lang.Object[])
	 * 
	 * proxy:������Ķ���
	 * 
	 * method:���������ķ���
	 * 
	 * args�������Ĳ���
	 * 
	 * ����ֵ��
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long startTime = System.currentTimeMillis();
		System.out.println("������ʼ��ʻ������");
		method.invoke(target);
		long finishTime = System.currentTimeMillis();
		System.out.println("����������ʻ����ʻʱ��Ϊ��" + (finishTime - startTime) + "����");
		return this;
	}
}
