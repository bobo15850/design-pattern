package ����ģʽ;

import ����ģʽ.Impl.FlyWithWin;

public class RedHeadDuck extends Duck {
	public RedHeadDuck() {
		super();
		super.setFlyingStragety(new FlyWithWin());
	}

	@Override
	public void display() {
		System.out.println("�ҵ�ͷ�Ǻ�ɫ��");
	}

}
