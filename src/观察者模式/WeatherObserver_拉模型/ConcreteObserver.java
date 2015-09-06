package �۲���ģʽ.WeatherObserver_��ģ��;

/*
 * ����Ĺ۲��߶���ʵ�ָ��µķ�����ʹ�����״̬��Ŀ���״̬����һ��
 */
public class ConcreteObserver implements Observer {

	private String observerName;// �۲������ƣ�˭�յ�����Ϣ��

	private String weatherContent;// �������ݣ���Ŀ�괦��ȡ

	private String remindThing;// ���ѵ�����

	@Override
	public void update(WeatherSubject subject) {
		weatherContent = ((ConcreteWeatherSubject) subject).getWeatherContent();
		System.out.println(observerName + "�յ���" + weatherContent + "," + remindThing);
	}// ��ȡĿ���۵�״̬ͬ�����۲��ŵ�״̬

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
	}

	public String getRemindThing() {
		return remindThing;
	}

	public void setRemindThing(String remindThing) {
		this.remindThing = remindThing;
	}

}
