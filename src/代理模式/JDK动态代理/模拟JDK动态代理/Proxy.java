package ����ģʽ.JDK��̬����.ģ��JDK��̬����;

public class Proxy {
	public static Object newProxyInstance() {
		String rt = "\r\n";
		String str = "package ����ģʽ.��̬����;" + rt +

		"import ����ģʽ.Moveable;" + rt +

		"public class $proxy0 implements Moveable {" + rt +

		"private Moveable car;" + rt +

		"public CarTimeProxy(Moveable car) {" + rt + "this.car = car;" + rt + "}" + rt +

		"@Override" + rt + "public void move() {" + rt + "System.out.println(\"������ʼ��ʻ\");" + rt + "this.car.move();" + rt + "System.out.println(\"����������ʻ\");" + rt + "}" + rt + "}" + rt;
		return str;

	}

}
