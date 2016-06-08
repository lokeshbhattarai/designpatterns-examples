package state;

public class CarRacer {

	private RoadState regularRoad;
	private RoadState gravelRoad;
	private RoadState wetRoad;
	private RoadState icyRoad;
	private RoadState currentRoad;

	public CarRacer() {
		regularRoad = new RegularRoad(this);
		gravelRoad = new GravelRoad(this);
		wetRoad = new WetRoad(this);
		icyRoad = new IcyRoad(this);

		currentRoad = regularRoad;
	}

	public void turnLeft() {
		currentRoad.turnLeft();

	}

	public void accelerate() {
		currentRoad.accelerate();

	}

	public void turnRight() {
		currentRoad.turnRight();

	}

	public void applyBrake() {
		currentRoad.applyBrake();

	}
	
	public void setCurrentRoad(RoadState road){
		currentRoad = road;
	}

	public RoadState getGravelRoad() {
		return gravelRoad;
	}

	public void setGravelRoad(RoadState gravelRoad) {
		this.gravelRoad = gravelRoad;
	}

	public RoadState getRegularRoad() {
		return regularRoad;
	}

	public RoadState getWetRoad() {
		return wetRoad;
	}

	public RoadState getIcyRoad() {
		return icyRoad;
	}

	public RoadState getCurrentRoad() {
		return currentRoad;
	}
	
	public void completeRace(){
		System.out.println("Race completed");
	}

}
