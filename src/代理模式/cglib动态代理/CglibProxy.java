package 代理模式.cglib动态代理;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
	private Enhancer enhancer = new Enhancer();

	public Object getProxy(@SuppressWarnings("rawtypes") Class cls) {
		// 设置创建之类的类
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
	 * 拦截所有目标类方法调用 参数： obj:目标类实例 m:目标方法反射对象 args:方法的参数 proxy：代理类实例
	 */
	@Override
	public Object intercept(Object obj, Method m, Object[] args, MethodProxy proxy) throws Throwable {
		// 代理类调用父类方法
		System.out.println("日至开始");
		proxy.invokeSuper(obj, args);
		System.out.println("日至结束");
		return null;
	}

}
