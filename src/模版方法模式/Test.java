package ģ�淽��ģʽ;

public class Test {
	public static void main(String[] args) {
		System.out.println("�Ʊ����� ");
		RefreshBeverage coffee = new Coffee();
		coffee.prepareBeverageTemplate();
		System.out.println("���Ⱥ���");

		System.out.println("**********************************");

		System.out.println("�Ʊ��� ");
		RefreshBeverage tea = new Tea();
		tea.prepareBeverageTemplate();
		System.out.println("�����");

		System.out.println("**********************************");

		System.out.println("�Ʊ�ţ�� ");
		RefreshBeverage milk = new Milk();
		milk.prepareBeverageTemplate();
		System.out.println("ţ�̺���");
	}

}
