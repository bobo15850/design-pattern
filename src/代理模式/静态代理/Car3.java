package ����ģʽ.��̬����;

import ����ģʽ.Car;
import ����ģʽ.Moveable;

/*
 * �ۺϷ�ʽʵ�ִ���
 */
public class Car3 implements Moveable {
	private Car car;

	public Car3(Car car) {
		this.car = car;
	}

	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		System.out.println("������ʼ��ʻ������");
		this.car.move();
		long finishTime = System.currentTimeMillis();
		System.out.println("����������ʻ����ʻʱ��Ϊ��" + (finishTime - startTime) + "����");

	}

}
