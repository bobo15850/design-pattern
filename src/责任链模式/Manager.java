package ������ģʽ;

public class Manager extends PriceHandle {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.imooc.pattern.cor.handler.PriceHandler#processDiscount(float)
	 * ���۾�����30%���µ��ۿ�
	 */
	public void processDiscount(float discount) {
		if (discount <= 0.3) {
			System.out.println(this.getClass().getName() + "������" + discount + "���ۿ�");
		} else {
			super.successor.processDiscount(discount);
		}
	}

}
