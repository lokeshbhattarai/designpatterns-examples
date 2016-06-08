package strategy;

import java.util.List;

public class RevenueCalculator {

	private Model revenueModel;
	
	public RevenueCalculator(Model model){
		revenueModel = model;
	}
	
	public void calculateRevenue(List<Flight> flights){
		
		System.out.println("******************Generating revenue with "+revenueModel.getClass().getSimpleName()+" Strategy**********************");
		long revenue = revenueModel.getRevenue(flights);
		
		System.out.println("revenue generated::"+revenue);
	}
	
}
