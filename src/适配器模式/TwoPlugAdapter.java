package 适配器模式;

public class TwoPlugAdapter implements ThreePlugIf {
	/*
	 * 二项转三项的插座适配器 组合方式实现，可以为所有子类实现，对象适配器
	 */

	private GBTwoPlug plug;

	public TwoPlugAdapter(GBTwoPlug plug) {
		this.plug = plug;
	}

	@Override
	public void powerWithThree() {
		System.out.println("通过转化");
		plug.powerWithTwo();
	}

}
