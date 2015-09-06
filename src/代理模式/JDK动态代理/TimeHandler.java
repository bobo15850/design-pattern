package 代理模式.JDK动态代理;

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
	 * proxy:被代理的对象
	 * 
	 * method:被代理对象的方法
	 * 
	 * args：方法的参数
	 * 
	 * 返回值：
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行驶。。。");
		method.invoke(target);
		long finishTime = System.currentTimeMillis();
		System.out.println("汽车结束行驶，行驶时间为：" + (finishTime - startTime) + "毫秒");
		return this;
	}
}
