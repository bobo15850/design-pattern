package װ����ģʽ.coffee_example.decorator;

import װ����ģʽ.coffee_example.Drink;

public class Milk extends Decorator {

	public Milk(Drink Obj) {
		super(Obj);
		super.setDescription("Milk");
		super.setPrice(2.0f);
	}
}
