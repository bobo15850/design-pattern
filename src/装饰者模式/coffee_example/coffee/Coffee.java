package 装饰者模式.coffee_example.coffee;

import 装饰者模式.coffee_example.Drink;

public class Coffee extends Drink {

	@Override
	public float cost() {
		return super.getPrice();
	}
}
