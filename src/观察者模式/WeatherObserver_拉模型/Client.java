package 观察者模式.WeatherObserver_拉模型;

public class Client {
	public static void main(String[] args) {
		// 创建目标
		ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
		// 创建观察者
		ConcreteObserver observerGirl = new ConcreteObserver();
		observerGirl.setObserverName("女朋友");
		observerGirl.setRemindThing("街心公园，不见不散");

		ConcreteObserver observerMum = new ConcreteObserver();
		observerMum.setObserverName("妈妈");
		observerMum.setRemindThing("天虹，购物");

		// 注册观察者
		weather.attach(observerGirl);
		weather.attach(observerMum);

		// 发布天气
		weather.setWeatherContent("明天天气晴朗");

	}
}
