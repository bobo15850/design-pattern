package 代理模式;

import java.util.Random;

public class Car implements Moveable {

	@Override
	public void move() {
		// 实现开车
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("汽车正在行驶中。。。");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
