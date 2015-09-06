package 观察者模式.java中的观察者模式;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {
	private String observerName;

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(observerName + "收到了消息，目标推送过来的是" + arg);// 推模型
		System.out.println(observerName + "收到了消息，主动拉取的内容为：" + ((ConcreteWeatherSubject) o).getContent());
	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

}
