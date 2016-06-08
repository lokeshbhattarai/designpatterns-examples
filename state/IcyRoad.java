package state;

public class IcyRoad implements RoadState{

	int maxSpeed = 20;
	int currentSpeed =3;//default acceleration
	
	private CarRacer carRacer;
	
	public IcyRoad(CarRacer carRacer){
		this.carRacer = carRacer;
	}
	
	@Override
	public void turnLeft() {
		//1
		System.out.println("Turning left on"+this.getClass().getSimpleName());
		currentSpeed =1;
		System.out.println("Speed:"+currentSpeed);
		
	}

	@Override
	public void accelerate() {
		//3
		System.out.println("Accelerating on"+this.getClass().getSimpleName());
		System.out.println("Speed:"+currentSpeed);
		
		currentSpeed*=2;
		
		if(currentSpeed>maxSpeed){
			carRacer.completeRace();
		}
	}

	@Override
	public void turnRight() {
		// 1
		System.out.println("Turning right on"+this.getClass().getSimpleName());
		currentSpeed =1;
		System.out.println("Speed:"+currentSpeed);
	}

	@Override
	public void applyBrake() {
		// 2
		System.out.println("Applying brake on"+this.getClass().getSimpleName());
		
		currentSpeed =2;
		System.out.println("Speed:"+currentSpeed);
	}

}
