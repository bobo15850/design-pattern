package 观察者模式.WeatherObserver_拉模型;

/*
 * 观察者接口，定义一个更新的接口给那些在目标发生改变时被通知的对象
 */
public interface Observer {
	public void update(WeatherSubject subject);// 更新的接口 方便获取目标对象的状态
	// 传递整个目标对象
}
