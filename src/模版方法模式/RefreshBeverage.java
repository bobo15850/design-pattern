package ģ�淽��ģʽ;

/*
 * ������࣬Ϊ���������ṩ�㷨���
 */
public abstract class RefreshBeverage {

	/*
	 * ֲ�����ϵ�ģ�淽������װ���������๲ͬ���ص��㷨���
	 */
	public final void prepareBeverageTemplate() {
		boliWater();// ��ˮ���
		brew();// ��������
		pourInCup();// ���뱭��
		if (isCustomerWantCondiments()) {
			addCondiments();// �������
		}

	}

	/*
	 * ���ӷ�����hook �������ṩһ��Ĭ�ϻ��߿յ�ʵ�֣����������������о����Ƿ�ҹ��Լ���ιҹ� �ڴ�Ϊѯ���û��Ƿ�������
	 */
	protected boolean isCustomerWantCondiments() {
		return true;
	}

	private void boliWater() {
		System.out.println("��ˮ���");
	}

	protected abstract void brew();

	private void pourInCup() {
		System.out.println("�����ϵ��뱭��");
	}

	protected abstract void addCondiments();

}
