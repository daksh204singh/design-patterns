package com.daksh.designpatterns.strategy;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new Duck(new FlyWithWings(), new Quack());
		mallard.performFly();
		mallard.performQuack();
		mallard.swim();
		
		Duck toy = new Duck(new FlyNoWay(), new Squeak());
		toy.performFly();
		toy.performQuack();
		toy.swim();
	}

}
