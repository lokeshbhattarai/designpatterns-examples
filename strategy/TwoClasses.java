package strategy;

import java.util.List;

public class TwoClasses implements Model{
/*TwoClasses will take the number of passengers, and price 1/3 of them as Business Class,
where the cost is 1.5 times the ticket price. 2/3 will be in Coach at 0.75 times the ticket
price. The fixed cost will be 1.1 times higher (for the business class meals and lost seats).
 * */
	@Override
	public long getRevenue(List<Flight> flights) {
		
		double revenue =0;
		
		for (Flight flight : flights) {
			int totalPassengers = flight.getNumberOfPassengers();
			
			double businessClassIncome = (totalPassengers/3)*(1.5*basePrice);
			double coachClassIncome = (totalPassengers*2/3)*(0.75*basePrice);
			
			double fixedCost = 1.1 * flightCost;
			
			double flightRevenue = businessClassIncome + coachClassIncome - fixedCost;
			revenue+=flightRevenue;
		}
		
		return (long)revenue;
	}

}
