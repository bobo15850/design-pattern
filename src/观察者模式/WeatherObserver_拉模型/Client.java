package �۲���ģʽ.WeatherObserver_��ģ��;

public class Client {
	public static void main(String[] args) {
		// ����Ŀ��
		ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
		// �����۲���
		ConcreteObserver observerGirl = new ConcreteObserver();
		observerGirl.setObserverName("Ů����");
		observerGirl.setRemindThing("���Ĺ�԰��������ɢ");

		ConcreteObserver observerMum = new ConcreteObserver();
		observerMum.setObserverName("����");
		observerMum.setRemindThing("��磬����");

		// ע��۲���
		weather.attach(observerGirl);
		weather.attach(observerMum);

		// ��������
		weather.setWeatherContent("������������");

	}
}
