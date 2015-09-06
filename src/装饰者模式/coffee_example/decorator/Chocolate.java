package 装饰者模式.coffee_example.decorator;

import 装饰者模式.coffee_example.Drink;

public class Chocolate extends Decorator {

	public Chocolate(Drink Obj) {
		super(Obj);
		super.setDescription("Chocolate");
		super.setPrice(3.0f);
	}

}
