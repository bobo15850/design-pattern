package �۲���ģʽ.WeatherObserver_��ģ��;

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
