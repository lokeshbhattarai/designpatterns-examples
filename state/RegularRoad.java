package state;

public class RegularRoad implements RoadState{

	int maxSpeed = 20;
	int currentSpeed =9;//default acceleration
	
	private CarRacer carRacer;
	
	public RegularRoad(CarRacer carRacer){
		this.carRacer = carRacer;
	}
	
	@Override
	public void turnLeft() {
		//5
		System.out.println("Turning left on"+this.getClass().getSimpleName());
		currentSpeed =5;
		System.out.println("Speed:"+currentSpeed);
	}

	@Override
	public void accelerate() {
		//9
		System.out.println("Accelerating on"+this.getClass().getSimpleName());
		System.out.println("Speed:"+currentSpeed);
	
		currentSpeed+=9;
		if(currentSpeed>maxSpeed){
			carRacer.setCurrentRoad(carRacer.getGravelRoad());
		}
		
		
	}

	@Override
	public void turnRight() {
		//5
		System.out.println("Turning right on"+this.getClass().getSimpleName());
		currentSpeed =5;
		System.out.println("Speed:"+currentSpeed);
	}

	@Override
	public void applyBrake() {
		//8
		System.out.println("Applying brake on"+this.getClass().getSimpleName());
		currentSpeed =8;
		System.out.println("Speed:"+currentSpeed);
	}

}
