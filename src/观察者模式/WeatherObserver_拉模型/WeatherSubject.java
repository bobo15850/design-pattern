package 观察者模式.WeatherObserver_拉模型;

import java.util.ArrayList;
import java.util.List;

/*
 * 目标对象，知道观察他的观察者，并提供注册和删除接口
 */
public class WeatherSubject {
	private List<Observer> observers = new ArrayList<Observer>();

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void detach(Observer observer) {
		observers.remove(observer);
	}

	protected void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}
}
