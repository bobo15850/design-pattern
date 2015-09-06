package 观察者模式.WeatherObserver_推模型;

public class Client {
	public static void main(String[] args) {
		ConcreteWeatherSubject weatherSubject = new ConcreteWeatherSubject();

		ConcreteObserver mumSubject = new ConcreteObserver();
		mumSubject.setObserverName("妈妈");
		weatherSubject.attach(mumSubject);

		ConcreteObserver girlSubject = new ConcreteObserver();
		girlSubject.setObserverName("女友");
		weatherSubject.attach(girlSubject);

		weatherSubject.setWeatherStr("多云");
	}
}
