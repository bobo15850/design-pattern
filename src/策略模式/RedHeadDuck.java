package 策略模式;

import 策略模式.Impl.FlyWithWin;

public class RedHeadDuck extends Duck {
	public RedHeadDuck() {
		super();
		super.setFlyingStragety(new FlyWithWin());
	}

	@Override
	public void display() {
		System.out.println("我的头是红色的");
	}

}
