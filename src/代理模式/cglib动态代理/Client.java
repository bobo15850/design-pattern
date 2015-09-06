package 代理模式.cglib动态代理;

public class Client {
	public static void main(String[] args) {
		CglibProxy proxy = new CglibProxy();
		Train t = (Train) proxy.getProxy(Train.class);
		t.move();
	}
}
