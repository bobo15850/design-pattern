package ������ģʽ;

/*
 * �۸����˸�������ͻ����ۿ�����
 */
public abstract class PriceHandle {
	protected PriceHandle successor;// ֱ�Ӻ�����ڴ�������

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public PriceHandle getSuccessor() {
		return successor;
	}

	public void setSuccessor(PriceHandle successor) {
		this.successor = successor;
	}

	public abstract void processDiscount(float discount);// �����ۿ�����
}
