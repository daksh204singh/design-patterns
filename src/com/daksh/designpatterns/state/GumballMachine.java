package com.daksh.designpatterns.state;

public class GumballMachine {
	private static final String[] states = {"SOLD_OUT", "NO_QUARTER", "HAS_QUARTER", "SOLD" };
	private static final int SOLD_OUT = 0;
	private static final int NO_QUARTER = 1;
	private static final int HAS_QUARTER = 2;
	private static final int SOLD = 3;
	
	private int state = SOLD_OUT; 
	private int count = 0;
	
	public GumballMachine(int count) {
		if (count <= 0)
			throw new IllegalArgumentException();
		this.count = count;
		state = NO_QUARTER;
	}
	
	public void insertQuarter() {
		if (state == SOLD_OUT) {
			System.out.println("You can't insert a quarter, machine is sold out");
		} else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("Quarter inserted");
		} else if (state == HAS_QUARTER) {
			System.out.println("Quarter is already inserted, you cannot insert another Quarter");
		} else if (state == SOLD) {
			System.out.println("Please wait, we already rolling out a gumball");
		}
	}
	
	public void ejectQuarter() {
		if (state == NO_QUARTER || state == SOLD_OUT) {
			System.out.println("You can't eject, you haven't inserted a QUARTER yet!");
		} else if (state == SOLD) {
			System.out.println("Sorry, you already turned the crank");
		} else if (state == HAS_QUARTER) {
			System.out.println("Quarter returned");
			state = NO_QUARTER;
		}
	}
	
	public void turnCrank() {
		if (state == HAS_QUARTER) {
			System.out.println("You turned");
			state = SOLD;
			dispense();
		} else if (state == SOLD) {
			System.out.println("Turning multiple times will not give you another gumball!");
		} else if (state == SOLD_OUT) {
			System.out.println("You turned, but there are no gumballs");
		} else if (state == NO_QUARTER) {
			System.out.println("You turned, but there is no Quarter");
		}
	}
	
	public void dispense() {
		if (state == SOLD) {
			System.out.println("Gumball is rolling out...");
			count--;
			if (count == 0) {
				System.out.println("Out of gumballs now!");
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		} else if (state == NO_QUARTER) {
			System.out.println("You need to pay first");
		} else if (state ==  SOLD_OUT) {
			System.out.println("No gumball dispensed, out of gumballs");
		} else if (state == HAS_QUARTER) {
			System.out.println("Turn the crack to dispense a gumball");
		}
	}

	@Override
	public String toString() {
		return "GumballMachine [state=" + states[state] + ", count=" + count + "]";
	}
	
	
}

