package �۲���ģʽ.java�еĹ۲���ģʽ;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {
	private String observerName;

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(observerName + "�յ�����Ϣ��Ŀ�����͹�������" + arg);// ��ģ��
		System.out.println(observerName + "�յ�����Ϣ��������ȡ������Ϊ��" + ((ConcreteWeatherSubject) o).getContent());
	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

}
