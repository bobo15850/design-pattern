package 代理模式.静态代理;

import 代理模式.Car;

/*
 * 继承方式实现代理
 */
public class Car2 extends Car {

	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行驶。。。");
		super.move();
		long finishTime = System.currentTimeMillis();
		System.out.println("汽车结束行驶，行驶时间为：" + (finishTime - startTime) + "毫秒");
	}
}
