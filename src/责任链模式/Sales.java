package ������ģʽ;

public class Sales extends PriceHandle {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.imooc.pattern.cor.handler.PriceHandler#processDiscount(float)
	 * ������Ա��������׼5%���ڵ��ۿ�
	 */
	public void processDiscount(float discount) {
		if (discount <= 0.05) {
			System.out.println(this.getClass().getName() + "������" + discount + "���ۿ�");
		} else {
			super.successor.processDiscount(discount);
		}
	}
}
