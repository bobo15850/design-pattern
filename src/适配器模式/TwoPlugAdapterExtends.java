package ������ģʽ;

public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf {
	/*
	 * �̳з�ʽʵ��������ģʽ����һΪ�̳�����������������������
	 * 
	 * @see ������ģʽ.ThreePlugIf#powerWithThree()
	 */
	@Override
	public void powerWithThree() {
		this.powerWithTwo();
	}

}
