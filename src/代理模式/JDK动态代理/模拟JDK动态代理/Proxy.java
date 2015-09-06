package 代理模式.JDK动态代理.模拟JDK动态代理;

public class Proxy {
	public static Object newProxyInstance() {
		String rt = "\r\n";
		String str = "package 代理模式.静态代理;" + rt +

		"import 代理模式.Moveable;" + rt +

		"public class $proxy0 implements Moveable {" + rt +

		"private Moveable car;" + rt +

		"public CarTimeProxy(Moveable car) {" + rt + "this.car = car;" + rt + "}" + rt +

		"@Override" + rt + "public void move() {" + rt + "System.out.println(\"汽车开始行驶\");" + rt + "this.car.move();" + rt + "System.out.println(\"汽车结束行驶\");" + rt + "}" + rt + "}" + rt;
		return str;

	}

}
