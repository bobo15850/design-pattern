package ģ�淽��ģʽ;

public class Milk extends RefreshBeverage {

	@Override
	protected void brew() {
		System.out.println("�ÿ�ˮ����");
	}

	@Override
	protected void addCondiments() {

	}

	protected boolean isCustomerWantCondiments() {
		return false;
	}
}
