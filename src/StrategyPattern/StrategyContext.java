package StrategyPattern;

public class StrategyContext {
	private StrategyInterface stratInt;

	public void setStrategy(StrategyInterface strategy){
		this.stratInt = strategy;
	}

	public void useStrategy(){
		stratInt.execute();
	}
}
