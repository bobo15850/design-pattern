package 责任链模式;

/*
 * 价格处理人负责吃力客户的折扣申请
 */
public abstract class PriceHandle {
	protected PriceHandle successor;// 直接后继用于传递申请

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public PriceHandle getSuccessor() {
		return successor;
	}

	public void setSuccessor(PriceHandle successor) {
		this.successor = successor;
	}

	public abstract void processDiscount(float discount);// 处理折扣申请
}
