package �۲���ģʽ.WeatherObserver_��ģ��;

public class Client {
	public static void main(String[] args) {
		ConcreteWeatherSubject weatherSubject = new ConcreteWeatherSubject();

		ConcreteObserver mumSubject = new ConcreteObserver();
		mumSubject.setObserverName("����");
		weatherSubject.attach(mumSubject);

		ConcreteObserver girlSubject = new ConcreteObserver();
		girlSubject.setObserverName("Ů��");
		weatherSubject.attach(girlSubject);

		weatherSubject.setWeatherStr("����");
	}
}
