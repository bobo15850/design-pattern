package װ����ģʽ.coffee_example.decorator;

import װ����ģʽ.coffee_example.Drink;

public class Chocolate extends Decorator {

	public Chocolate(Drink Obj) {
		super(Obj);
		super.setDescription("Chocolate");
		super.setPrice(3.0f);
	}

}
