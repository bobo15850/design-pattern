package 观察者模式.java中的观察者模式;

import java.util.Observable;

public class ConcreteWeatherSubject extends Observable {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		this.setChanged();// 这句话不可少
		this.notifyObservers(content);// 推模型
		this.notifyObservers();// 拉模型
	}

}
