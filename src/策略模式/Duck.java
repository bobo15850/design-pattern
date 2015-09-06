package ²ßÂÔÄ£Ê½;

public abstract class Duck {
	private FlyingStragety flyingStragety;

	public void quank() {
		System.out.println("¸Â¸Â¸Â");
	}

	public abstract void display();

	public void setFlyingStragety(FlyingStragety flyingStragety) {
		this.flyingStragety = flyingStragety;
	}

	public void fly() {
		flyingStragety.performFly();
	}
}
