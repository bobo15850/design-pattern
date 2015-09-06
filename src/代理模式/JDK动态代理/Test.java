package 代理模式.JDK动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import 代理模式.Car;
import 代理模式.Moveable;

public class Test {
	public static void main(String[] args) {
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Class<?> cls = car.getClass();

		/*
		 * 1.loader:被代理类的类加载器 2.interface:实现的接口 h:代理事件处理类
		 */

		Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
		m.move();
	}
}
