package ����ģʽ.��̬����;

import ����ģʽ.Car;

/*
 * �̳з�ʽʵ�ִ���
 */
public class Car2 extends Car {

	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		System.out.println("������ʼ��ʻ������");
		super.move();
		long finishTime = System.currentTimeMillis();
		System.out.println("����������ʻ����ʻʱ��Ϊ��" + (finishTime - startTime) + "����");
	}
}
