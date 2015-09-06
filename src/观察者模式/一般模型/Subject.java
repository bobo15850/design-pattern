package �۲���ģʽ.һ��ģ��;

import java.util.ArrayList;
import java.util.List;

/*
 * Ŀ�����֪���۲����Ĺ۲��ߣ����ṩע���ɾ���ӿ�
 */
public class Subject {
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
