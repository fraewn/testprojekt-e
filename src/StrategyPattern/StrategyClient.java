package StrategyPattern;

import java.util.HashMap;

public class StrategyClient {

	public void executeStrategyExample(){
		StrategyContext context = new StrategyContext();
		System.out.println("Example of Strategy 1: ");
		context.setStrategy(new ConcStrategy1());
		context.useStrategy();
		System.out.println("Example of Strategy 2: ");
		context.setStrategy(new ConcStrategy1());
		context.useStrategy();
	}

}
