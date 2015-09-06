package 单例模式;

public class Singleton2 {
	private static Singleton2 instance;// 懒汉模式，加载时不创建实例，线程不安全

	private Singleton2() {

	}

	public static Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
}
