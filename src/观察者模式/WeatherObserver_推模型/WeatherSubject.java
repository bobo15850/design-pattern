package 观察者模式.WeatherObserver_推模型;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject {
	private List<Observer> observers = new ArrayList<Observer>();

	public void attach(Observer observer) {
		this.observers.add(observer);
	}

	public void detach(Observer observer) {
		this.observers.add(observer);
	}

	public void notifyObjects(String weatherStr) {
		for (Observer observer : observers) {
			observer.update(weatherStr);
		}
	}
}
