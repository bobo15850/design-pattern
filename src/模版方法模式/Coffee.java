package ģ�淽��ģʽ;

public class Coffee extends RefreshBeverage {
	/*
	 * (non-Javadoc)
	 * 
	 * @see ģ�淽��ģʽ.RefreshBeverage#brew() �����Ʊ�
	 */
	@Override
	protected void brew() {
		System.out.println("�÷�ˮ���ݿ���");
	}

	@Override
	protected void addCondiments() {
		System.out.println("�ڿ����м����Ǻ�ţ��");
	}

}
