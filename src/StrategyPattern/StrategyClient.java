package StrategyPattern;

import java.util.HashMap;

public class StrategyClient {

	public void executeStrategyExample(){
		StrategyContext context = new StrategyContext();
		StrategyInterface strategy1 = new ConcStrategy1();
		System.out.println("Example of Strategy 1: ");
		context.setStrategy(strategy1);
		context.useStrategy();
		System.out.println("Example of Strategy 2: ");
		StrategyInterface strategy2 = new ConcStrategy2();
		context.setStrategy(strategy2);
		context.useStrategy();
	}

}
