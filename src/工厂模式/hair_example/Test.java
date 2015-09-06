package 工厂模式.hair_example;

public class Test {
	public static void main(String[] args) {
		HairFactory fatory = new HairFactory();
//		HairInterface left = fatory.getHair("left");
		HairInterface left=fatory.getHairByClass(LeftHair.class.getName());
		left.draw();
	}
}
