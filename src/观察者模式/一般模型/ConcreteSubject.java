package 观察者模式.一般模型;

/*
 * 具体的目标对象，负责把有关对象存储到观察者对象中
 */
public class ConcreteSubject extends Subject {
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
		this.notifyObservers();
	}
}
