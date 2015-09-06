package ����ģʽ.JDK��̬����;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import ����ģʽ.Car;
import ����ģʽ.Moveable;

public class Test {
	public static void main(String[] args) {
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Class<?> cls = car.getClass();

		/*
		 * 1.loader:���������������� 2.interface:ʵ�ֵĽӿ� h:�����¼�������
		 */

		Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
		m.move();
	}
}
