package ������ģʽ;

public class TwoPlugAdapter implements ThreePlugIf {
	/*
	 * ����ת����Ĳ��������� ��Ϸ�ʽʵ�֣�����Ϊ��������ʵ�֣�����������
	 */

	private GBTwoPlug plug;

	public TwoPlugAdapter(GBTwoPlug plug) {
		this.plug = plug;
	}

	@Override
	public void powerWithThree() {
		System.out.println("ͨ��ת��");
		plug.powerWithTwo();
	}

}
