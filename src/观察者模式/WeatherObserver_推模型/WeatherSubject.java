package �۲���ģʽ.WeatherObserver_��ģ��;

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
