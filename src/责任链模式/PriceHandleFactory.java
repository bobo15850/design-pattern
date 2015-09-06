package ������ģʽ;

public class PriceHandleFactory {
	public static PriceHandle createPriceHandler() {
		Sales sale = new Sales();
		Manager manager = new Manager();
		CEO ceo = new CEO();
		sale.setSuccessor(manager);
		manager.setSuccessor(ceo);
		return sale;
	}
}
