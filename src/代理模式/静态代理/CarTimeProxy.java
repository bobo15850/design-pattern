package 代理模式.静态代理;

import 代理模式.Moveable;

public class CarTimeProxy implements Moveable {

	private Moveable car;

	public CarTimeProxy(Moveable car) {
		this.car = car;
	}

	@Override
	public void move() {
		System.out.println("汽车开始行驶");
		this.car.move();
		System.out.println("汽车结束行驶");
	}
}
