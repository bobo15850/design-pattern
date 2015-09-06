package 责任链模式;

public class CEO extends PriceHandle {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.imooc.pattern.cor.handler.PriceHandler#processDiscount(float)
	 * CEO处理所有的折扣
	 */
	public void processDiscount(float discount) {
		if (discount <= 0.5) {
			System.out.println(this.getClass().getName() + "处理了" + discount + "的折扣");
		} else {
			System.out.println(this.getClass().getName() + "拒绝了折扣");
		}
	}
}
