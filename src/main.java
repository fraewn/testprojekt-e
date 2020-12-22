import CommandPattern.CommandClient;
import ObserverPattern.ObserverClient;
import ProxyPattern.ProxyClient;
import StrategyPattern.StrategyClient;
import StrategyPattern.StrategyContext;

public class main {
	public static void main(String args[]){
		ObserverClient obs = new ObserverClient();
		obs.executeObserverExample();

		System.out.println("-------------------------------");

		StrategyClient strat = new StrategyClient();
		strat.executeStrategyExample();

		System.out.println("-------------------------------");

		CommandClient cmd = new CommandClient();
		cmd.executeCommandExample();

		System.out.println("-------------------------------");
		ProxyClient proxyClient = new ProxyClient();
		proxyClient.executeProxyExample();
		proxyClient.executeProxyExample();
	}
}
