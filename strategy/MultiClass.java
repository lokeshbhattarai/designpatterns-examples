package strategy;

import java.util.List;

public class MultiClass implements Model{
/*
 * MultiClass will take the number of passengers, and price 1/10 of them as First Class,
where the cost is 4 times the ticket price. 1/5 will be in Business class at 1.5 times the
ticket price. The rest (7/10) will be in Coach at 0.75 times the base ticket price. The fixed
cost will be 1.2 times higher (for the first and business class meals and lost seats).
 * */
	@Override
	public long getRevenue(List<Flight> flights) {
		double revenue=0;
		for (Flight flight : flights) {
			int totalPassenger = flight.getNumberOfPassengers();
			int firstClassPassengers = totalPassenger/3;
			int businessClassPassengers = totalPassenger/5;
			int coachPassengers = totalPassenger-firstClassPassengers-businessClassPassengers;

			double firstClassRevenue = firstClassPassengers* 4* basePrice;
			double businessClassRevenue = businessClassPassengers* 1.5* basePrice;
			double coachClassRevenue = coachPassengers* 0.75* basePrice;
			
			double flightRevenue = firstClassRevenue+businessClassRevenue+coachClassRevenue- 1.2*flightCost;
			revenue+=flightRevenue;
		}
		return (long)revenue;
	}

}
