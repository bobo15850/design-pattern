package װ����ģʽ.coffee_example.decorator;

import װ����ģʽ.coffee_example.Drink;

public class Soy extends Decorator {

	public Soy(Drink Obj) {
		super(Obj);
		super.setDescription("Soy");
		super.setPrice(1.5f);
	}

}
