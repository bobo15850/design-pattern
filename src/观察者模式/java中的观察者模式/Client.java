package 观察者模式.java中的观察者模式;

public class Client {
	public static void main(String[] args) {
		// 创建目标
		ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
		// 创建观察者
		ConcreteObserver observerGirl = new ConcreteObserver();
		observerGirl.setObserverName("女朋友");

		ConcreteObserver observerMum = new ConcreteObserver();
		observerMum.setObserverName("妈妈");

		// 注册观察者
		weather.addObserver(observerGirl);
		weather.addObserver(observerMum);

		// 发布天气
		weather.setContent("明天天气晴朗");
	}
}
