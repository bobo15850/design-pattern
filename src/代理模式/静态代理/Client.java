package 代理模式.静态代理;

import 代理模式.Car;

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
