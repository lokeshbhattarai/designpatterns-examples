package strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Flight flight1 = new Flight(240);
		Flight flight2 = new Flight(380);
		Flight flight3 = new Flight(700);
		Flight flight4 = new Flight(350);
		Flight flight5 = new Flight(500);
		Flight flight6 = new Flight(140);
		
		List<Flight> flights = new ArrayList<>();
		flights.add(flight1);
		flights.add(flight2);
		flights.add(flight3);
		flights.add(flight4);
		flights.add(flight5);
		flights.add(flight6);

		RevenueCalculator singleClassStrategy = new RevenueCalculator(new SinglePrice());
		RevenueCalculator twoClassStrategy = new RevenueCalculator(new TwoClasses());
		RevenueCalculator multiClassStrategy = new RevenueCalculator(new MultiClass());
		
		singleClassStrategy.calculateRevenue(flights);
		twoClassStrategy.calculateRevenue(flights);
		multiClassStrategy.calculateRevenue(flights);
		
		
	}

}
