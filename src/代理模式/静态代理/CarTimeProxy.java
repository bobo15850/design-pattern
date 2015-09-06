package ����ģʽ.��̬����;

import ����ģʽ.Moveable;

public class CarTimeProxy implements Moveable {

	private Moveable car;

	public CarTimeProxy(Moveable car) {
		this.car = car;
	}

	@Override
	public void move() {
		System.out.println("������ʼ��ʻ");
		this.car.move();
		System.out.println("����������ʻ");
	}
}
