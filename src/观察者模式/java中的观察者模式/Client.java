package �۲���ģʽ.java�еĹ۲���ģʽ;

public class Client {
	public static void main(String[] args) {
		// ����Ŀ��
		ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
		// �����۲���
		ConcreteObserver observerGirl = new ConcreteObserver();
		observerGirl.setObserverName("Ů����");

		ConcreteObserver observerMum = new ConcreteObserver();
		observerMum.setObserverName("����");

		// ע��۲���
		weather.addObserver(observerGirl);
		weather.addObserver(observerMum);

		// ��������
		weather.setContent("������������");
	}
}
