package state;

public class WetRoad implements RoadState{

	int maxSpeed = 20;
	int currentSpeed =9;//default acceleration
	
	private CarRacer carRacer;
	
	public WetRoad(CarRacer carRacer){
		this.carRacer = carRacer;
	}
	
	@Override
	public void turnLeft() {
		// 4
		System.out.println("Turning left on"+this.getClass().getSimpleName());
		currentSpeed =4;
		System.out.println("Speed:"+currentSpeed);
		
	}

	@Override
	public void accelerate() {
		// 9
		System.out.println("Accelerating on"+this.getClass().getSimpleName());
		System.out.println("Speed:"+currentSpeed);
		
		currentSpeed*=2;
		
		if(currentSpeed>maxSpeed){
			carRacer.setCurrentRoad(carRacer.getIcyRoad());
		}
	}

	@Override
	public void turnRight() {
		// 4
		System.out.println("Turning right on"+this.getClass().getSimpleName());
		currentSpeed =4;
		System.out.println("Speed:"+currentSpeed);
	}

	@Override
	public void applyBrake() {
		// 7
		System.out.println("Applying brake on"+this.getClass().getSimpleName());
		currentSpeed =7;
		System.out.println("Speed:"+currentSpeed);
	}

}
