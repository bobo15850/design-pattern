package �۲���ģʽ.һ��ģ��;

/*
 * ����Ĺ۲��߶���ʵ�ָ��µķ�����ʹ�����״̬��Ŀ���״̬����һ��
 */
public class ConcreteObserver implements Observer {

	private String observerState;

	@Override
	public void update(Subject subject) {
		setObserverState(((ConcreteSubject) subject).getSubjectState());
	}// ��ȡĿ���۵�״̬ͬ�����۲��ŵ�״̬

	public String getObserverState() {
		return observerState;
	}

	public void setObserverState(String observerState) {
		this.observerState = observerState;
	}

}
