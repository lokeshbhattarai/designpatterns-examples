package strategy;

import java.util.List;

public interface Model {
	float basePrice = 300;
	float flightCost = 50000;
	
	long getRevenue(List<Flight> flights);
}
