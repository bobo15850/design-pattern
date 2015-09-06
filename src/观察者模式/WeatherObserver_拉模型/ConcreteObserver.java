package 观察者模式.WeatherObserver_拉模型;

/*
 * 具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 */
public class ConcreteObserver implements Observer {

	private String observerName;// 观察者名称（谁收到了消息）

	private String weatherContent;// 天气内容，从目标处获取

	private String remindThing;// 提醒的内容

	@Override
	public void update(WeatherSubject subject) {
		weatherContent = ((ConcreteWeatherSubject) subject).getWeatherContent();
		System.out.println(observerName + "收到了" + weatherContent + "," + remindThing);
	}// 获取目标累的状态同步到观察着的状态

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
