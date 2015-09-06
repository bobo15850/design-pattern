package 观察者模式.一般模型;

/*
 * 具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 */
public class ConcreteObserver implements Observer {

	private String observerState;

	@Override
	public void update(Subject subject) {
		setObserverState(((ConcreteSubject) subject).getSubjectState());
	}// 获取目标累的状态同步到观察着的状态

	public String getObserverState() {
		return observerState;
	}

	public void setObserverState(String observerState) {
		this.observerState = observerState;
	}

}
