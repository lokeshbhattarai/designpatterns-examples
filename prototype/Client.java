package prototype;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee manager = new Employee();
		manager.setFirstName("Manager");
		manager.setSupervisor(null);
		manager.setStaff(null);
		
		Employee manager2 = new Employee();
		manager2.setFirstName("Manager2");
		manager2.setSupervisor(null);
		manager2.setStaff(null);
		
		
		Employee ceo = new Employee();
		ceo.setFirstName("Ceo");
		ceo.setSupervisor(null);
		ceo.setStaff(new Employee[]{manager,manager2});
		
		System.out.println("Original ceo name::"+ceo.getFirstName());
		
		Employee clonedCeo = (Employee)ceo.clone();
		System.out.println("Clonedceo name::"+clonedCeo.getFirstName());
		
		clonedCeo.setFirstName("Cloned ceo");
		System.out.println("After changing attributes on clone");
		System.out.println("Clonedceo name::"+clonedCeo.getFirstName());
		System.out.println("Original ceo name::"+ceo.getFirstName());
		
		System.out.println("Clonedceo staffs::"+Arrays.asList(clonedCeo.getStaff()).toString());
		
		
		
		
	}

}
