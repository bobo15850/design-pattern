package 责任链模式;

public class Sales extends PriceHandle {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.imooc.pattern.cor.handler.PriceHandler#processDiscount(float)
	 * 销售人员，可以批准5%以内的折扣
	 */
	public void processDiscount(float discount) {
		if (discount <= 0.05) {
			System.out.println(this.getClass().getName() + "处理了" + discount + "的折扣");
		} else {
			super.successor.processDiscount(discount);
		}
	}
}
