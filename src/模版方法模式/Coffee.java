package 模版方法模式;

public class Coffee extends RefreshBeverage {
	/*
	 * (non-Javadoc)
	 * 
	 * @see 模版方法模式.RefreshBeverage#brew() 咖啡制备
	 */
	@Override
	protected void brew() {
		System.out.println("用沸水冲泡咖啡");
	}

	@Override
	protected void addCondiments() {
		System.out.println("在咖啡中加入糖和牛奶");
	}

}
