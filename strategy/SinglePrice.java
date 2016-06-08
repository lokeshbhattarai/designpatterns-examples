package strategy;

import java.util.List;

public class SinglePrice implements Model{
/**
 * SinglePrice will just take the number of passengers, multiply by the constant ticket price
to get a total revenue for a flight, then subtract the fixed cost. It will then total all the
flights and return the revenue total.
 * */
	@Override
	public long getRevenue(List<Flight> flights) {
		long revenue = 0;
		
		for (Flight flight : flights) {
			int passengerCount = flight.getNumberOfPassengers();
			
			float singleFlightRevenue = passengerCount * basePrice - flightCost;
			
			revenue+=singleFlightRevenue;
		}
		
		return revenue;
	}
	
	

}
