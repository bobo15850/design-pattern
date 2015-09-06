package 模版方法模式;

public class Tea extends RefreshBeverage {

	@Override
	protected void brew() {
		System.out.println("用80度的水泡茶");
	}

	@Override
	protected void addCondiments() {
		System.out.println("加入柠檬");
	}
}
