package ����ģʽ;

import java.util.Random;

public class Car implements Moveable {

	@Override
	public void move() {
		// ʵ�ֿ���
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("����������ʻ�С�����");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
