package 适配器模式;

public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf {
	/*
	 * 继承方式实现适配器模式，单一为继承类服务的适配器，类适配器
	 * 
	 * @see 适配器模式.ThreePlugIf#powerWithThree()
	 */
	@Override
	public void powerWithThree() {
		this.powerWithTwo();
	}

}
