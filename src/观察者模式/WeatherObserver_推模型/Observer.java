package 观察者模式.WeatherObserver_推模型;

public interface Observer {
	public void update(String weatherStr);// 只传递需要的数据
}
