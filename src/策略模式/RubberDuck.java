package ����ģʽ;

import ����ģʽ.Impl.FlyNoWay;

public class RubberDuck extends Duck {
	public RubberDuck() {
		super();
		super.setFlyingStragety(new FlyNoWay());
	}

	@Override
	public void display() {
		System.out.println("���Ǵ��Ѽ");
	}

}
