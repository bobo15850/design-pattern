package ����ģʽ.��̬����;

import ����ģʽ.Car;

public class Client {
	public static void main(String[] args) {
		// Moveable m = new Car2();
		// m.move();

		// Car car = new Car();
		// Moveable m = new Car3(car);
		// m.move();

		Car car = new Car();
		CarTimeProxy ctp = new CarTimeProxy(car);
		CarLogProxy clp = new CarLogProxy(ctp);
		clp.move();
	}
}
