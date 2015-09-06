package 观察者模式.WeatherObserver_推模型;

public class ConcreteWeatherSubject extends WeatherSubject {

	private String weatherStr;

	public String getWeatherStr() {
		return weatherStr;
	}

	public void setWeatherStr(String weatherStr) {
		this.weatherStr = weatherStr;
		this.notifyObjects(weatherStr);
	}
}
