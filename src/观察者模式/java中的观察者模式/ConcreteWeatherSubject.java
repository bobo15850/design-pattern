package �۲���ģʽ.java�еĹ۲���ģʽ;

import java.util.Observable;

public class ConcreteWeatherSubject extends Observable {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		this.setChanged();// ��仰������
		this.notifyObservers(content);// ��ģ��
		this.notifyObservers();// ��ģ��
	}

}
