package ����ģʽ.human_example;

public class Test {
	public static void main(String[] args) {
		PersonFactory factory = new HNFactory();
		Boy boy = factory.getBoy();
		boy.drawMan();
	}
}
