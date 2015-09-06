package 策略模式;

import 策略模式.Impl.FlyNoWay;

public class RubberDuck extends Duck {
	public RubberDuck() {
		super();
		super.setFlyingStragety(new FlyNoWay());
	}

	@Override
	public void display() {
		System.out.println("我是大黄鸭");
	}

}
