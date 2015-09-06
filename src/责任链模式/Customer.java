package 责任链模式;


public class Customer {
	PriceHandle priceHandler;

	public void setPriceHandler(PriceHandle priceHandler) {
		this.priceHandler = priceHandler;
	}

	public void requestDiscount(float discount) {
		priceHandler.processDiscount(discount);
	}

	public static void main(String[] args) {
		Customer cus = new Customer();
		cus.setPriceHandler(PriceHandleFactory.createPriceHandler());
		cus.requestDiscount((float) 0.24);
	}
}
