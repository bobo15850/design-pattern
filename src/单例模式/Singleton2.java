package ����ģʽ;

public class Singleton2 {
	private static Singleton2 instance;// ����ģʽ������ʱ������ʵ�����̲߳���ȫ

	private Singleton2() {

	}

	public static Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
}
