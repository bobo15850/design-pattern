package 单例模式;

/*
 * 单例模式
 * 保证应用程序中某个实例有且只有一个
 * 类型：懒汉模式，饿汉模式
 */
public class Singleton {
	// 1.构造方法私有化，不允许外部直接创建对象
	private static Singleton instance = new Singleton();// 饿汉模式，类加载即加载

	private Singleton() {

	}

	public static Singleton getInstance() {
		return instance;
	}
}
