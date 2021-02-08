import CommandPattern.CommandClient;
import ObserverPattern.ObserverClient;
import ProxyPattern.ProxyClient;
import Singleton.MilkyWay;
import StrategyPattern.StrategyClient;

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

		System.out.println("-------------------------------");
		MilkyWay milkyWay = new MilkyWay();
		milkyWay.milkyWayNews();
		System.out.println("This was the Singleton-Test");
	}
}
