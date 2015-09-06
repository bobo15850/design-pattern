package ����ģʽ.cglib��̬����;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
	private Enhancer enhancer = new Enhancer();

	public Object getProxy(@SuppressWarnings("rawtypes") Class cls) {
		// ���ô���֮�����
		enhancer.setSuperclass(cls);
		enhancer.setCallback(this);
		return enhancer.create();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sf.cglib.proxy.MethodInterceptor#intercept(java.lang.Object,
	 * java.lang.reflect.Method, java.lang.Object[],
	 * net.sf.cglib.proxy.MethodProxy)
	 * 
	 * ��������Ŀ���෽������ ������ obj:Ŀ����ʵ�� m:Ŀ�귽��������� args:�����Ĳ��� proxy��������ʵ��
	 */
	@Override
	public Object intercept(Object obj, Method m, Object[] args, MethodProxy proxy) throws Throwable {
		// ��������ø��෽��
		System.out.println("������ʼ");
		proxy.invokeSuper(obj, args);
		System.out.println("��������");
		return null;
	}

}
