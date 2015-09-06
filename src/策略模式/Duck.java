package ����ģʽ;

public abstract class Duck {
	private FlyingStragety flyingStragety;

	public void quank() {
		System.out.println("�¸¸�");
	}

	public abstract void display();

	public void setFlyingStragety(FlyingStragety flyingStragety) {
		this.flyingStragety = flyingStragety;
	}

	public void fly() {
		flyingStragety.performFly();
	}
}
