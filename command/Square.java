package command;

public class Square {

	private Point first;//bottom left
	private Point second;//top left
	private Point third;//top right
	private Point last;//bottom right

	public Square(Point first, Point second, Point third, Point last) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
		this.last = last;
	}

	public Point getFirst() {
		return first;
	}

	public void setFirst(Point first) {
		this.first = first;
	}

	public Point getSecond() {
		return second;
	}

	public void setSecond(Point second) {
		this.second = second;
	}

	public Point getThird() {
		return third;
	}

	public void setThird(Point third) {
		this.third = third;
	}

	public Point getLast() {
		return last;
	}

	public void setLast(Point last) {
		this.last = last;
	}
	
	@Override
	public String toString() {
		return "\nbottom left:"+first.toString()+
				"\ntop left:"+second.toString()+
				"\ntop right:"+third.toString()+
				"\nbottom right:"+last.toString();
	}
	
	
}
