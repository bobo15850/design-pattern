package 代理模式.静态代理;

import 代理模式.Car;
import 代理模式.Moveable;

/*
 * 聚合方式实现代理
 */
public class Car3 implements Moveable {
	private Car car;

	public Car3(Car car) {
		this.car = car;
	}

	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行驶。。。");
		this.car.move();
		long finishTime = System.currentTimeMillis();
		System.out.println("汽车结束行驶，行驶时间为：" + (finishTime - startTime) + "毫秒");

	}

}
