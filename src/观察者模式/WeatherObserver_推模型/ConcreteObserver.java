package �۲���ģʽ.WeatherObserver_��ģ��;

public class ConcreteObserver implements Observer {
	private String observerName;

	public void update(String weatherStr) {
		System.out.println(observerName + "�յ��ˣ�" + weatherStr);
	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

}
