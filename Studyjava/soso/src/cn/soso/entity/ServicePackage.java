package cn.soso.entity;
/**
 * ���ƶ����ײ�
 *
 */
public abstract class ServicePackage {	
	protected double price;  //�ײ����ʷ�(Ԫ)
     
    public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	//��ʾ�ײ�����
    public abstract void showInfo();
}
