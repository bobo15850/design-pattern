package 责任链模式;

public class Manager extends PriceHandle {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.imooc.pattern.cor.handler.PriceHandler#processDiscount(float)
	 * 销售经理处理30%以下的折扣
	 */
	public void processDiscount(float discount) {
		if (discount <= 0.3) {
			System.out.println(this.getClass().getName() + "处理了" + discount + "的折扣");
		} else {
			super.successor.processDiscount(discount);
		}
	}

}
