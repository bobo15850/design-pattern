package 代理模式.静态代理;

import 代理模式.Moveable;

public class CarLogProxy implements Moveable {
	private Moveable car;

	public CarLogProxy(Moveable car) {
		this.car = car;
	}

	@Override
	public void move() {
		System.out.println("开始记录日志");
		this.car.move();
		System.out.println("结束记录日志");
	}
}
