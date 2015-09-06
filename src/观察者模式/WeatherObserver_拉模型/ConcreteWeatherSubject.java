package 观察者模式.WeatherObserver_拉模型;

/*
 * 具体的目标对象，负责把有关对象存储到观察者对象中
 */
public class ConcreteWeatherSubject extends WeatherSubject {
	private String weatherContent;

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		this.notifyObservers();
	}
}
