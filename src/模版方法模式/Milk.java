package 模版方法模式;

public class Milk extends RefreshBeverage {

	@Override
	protected void brew() {
		System.out.println("用开水冲泡");
	}

	@Override
	protected void addCondiments() {

	}

	protected boolean isCustomerWantCondiments() {
		return false;
	}
}
