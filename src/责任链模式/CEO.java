package ������ģʽ;

public class CEO extends PriceHandle {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.imooc.pattern.cor.handler.PriceHandler#processDiscount(float)
	 * CEO�������е��ۿ�
	 */
	public void processDiscount(float discount) {
		if (discount <= 0.5) {
			System.out.println(this.getClass().getName() + "������" + discount + "���ۿ�");
		} else {
			System.out.println(this.getClass().getName() + "�ܾ����ۿ�");
		}
	}
}
