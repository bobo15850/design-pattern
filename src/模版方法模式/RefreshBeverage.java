package 模版方法模式;

/*
 * 抽象基类，为所有子类提供算法框架
 */
public abstract class RefreshBeverage {

	/*
	 * 植被饮料的模版方法，封装了所有子类共同遵守的算法框架
	 */
	public final void prepareBeverageTemplate() {
		boliWater();// 将水煮沸
		brew();// 炮制饮料
		pourInCup();// 倒入杯中
		if (isCustomerWantCondiments()) {
			addCondiments();// 加入调料
		}

	}

	/*
	 * 钩子方函数hook 基类中提供一个默认或者空的实现，具体的子类可以自行决定是否挂钩以及如何挂钩 在此为询问用户是否加入调料
	 */
	protected boolean isCustomerWantCondiments() {
		return true;
	}

	private void boliWater() {
		System.out.println("将水煮沸");
	}

	protected abstract void brew();

	private void pourInCup() {
		System.out.println("将饮料倒入杯中");
	}

	protected abstract void addCondiments();

}
