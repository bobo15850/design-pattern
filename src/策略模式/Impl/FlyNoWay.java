package 策略模式.Impl;

import 策略模式.FlyingStragety;

public class FlyNoWay implements FlyingStragety {

	@Override
	public void performFly() {
		System.out.println("我不会飞");
	}
}
