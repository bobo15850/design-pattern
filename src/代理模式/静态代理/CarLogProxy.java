package ����ģʽ.��̬����;

import ����ģʽ.Moveable;

public class CarLogProxy implements Moveable {
	private Moveable car;

	public CarLogProxy(Moveable car) {
		this.car = car;
	}

	@Override
	public void move() {
		System.out.println("��ʼ��¼��־");
		this.car.move();
		System.out.println("������¼��־");
	}
}
