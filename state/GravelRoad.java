package state;

public class GravelRoad implements RoadState{

	
	int maxSpeed = 20;
	int currentSpeed =7;//default acceleration
	
	private CarRacer carRacer;
	
	public GravelRoad(CarRacer carRacer){
		this.carRacer = carRacer;
	}
	
	@Override
	public void turnLeft() {
		//3
		System.out.println("Turning left on"+this.getClass().getSimpleName());
		currentSpeed =3;
		System.out.println("Speed:"+currentSpeed);
	}

	@Override
	public void accelerate() {
		//7
		System.out.println("Accelerating on"+this.getClass().getSimpleName());
		System.out.println("Speed:"+currentSpeed);
		
		currentSpeed*=2;
		
		if(currentSpeed>maxSpeed){
			carRacer.setCurrentRoad(carRacer.getWetRoad());
		}
	}

	@Override
	public void turnRight() {
		// 3
		System.out.println("Turning right on"+this.getClass().getSimpleName());
		currentSpeed =3;
		System.out.println("Speed:"+currentSpeed);
	}

	@Override
	public void applyBrake() {
		// 6
		System.out.println("Applying brake on"+this.getClass().getSimpleName());
		currentSpeed =6;
		System.out.println("Speed:"+currentSpeed);
	}

}
