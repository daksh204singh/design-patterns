package com.daksh.designpatterns.strategy;

public class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(FlyBehavior flyBehavior, QuackBehavior quakBehavior) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quakBehavior;
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuakBehavior() {
		return quackBehavior;
	}

	public void setQuakBehavior(QuackBehavior quakBehavior) {
		this.quackBehavior = quakBehavior;
	}
	
	public void performFly() {
		// Delegate to flyBehavior
		flyBehavior.fly();
	}
	
	public void performQuack() {
		// Delegate to quackBehavior
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
}
