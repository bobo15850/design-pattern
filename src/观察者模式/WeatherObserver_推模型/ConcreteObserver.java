package 观察者模式.WeatherObserver_推模型;

public class ConcreteObserver implements Observer {
	private String observerName;

	public void update(String weatherStr) {
		System.out.println(observerName + "收到了：" + weatherStr);
	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

}
