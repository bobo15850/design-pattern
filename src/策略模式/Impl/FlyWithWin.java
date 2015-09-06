package 策略模式.Impl;

import 策略模式.FlyingStragety;

public class FlyWithWin implements FlyingStragety {

	@Override
	public void performFly() {
		System.out.println("用翅膀飞");
	}
}
