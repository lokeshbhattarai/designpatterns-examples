package command;

public class CommandExecutor {

	
	public Square[] squareCollections = new Square[]{
			
			new Square(new Point(0,0),new Point(0,5),new Point(5,5),new Point(5,0)),
			new Square(new Point(1,1),new Point(1,6),new Point(6,6),new Point(6,1))
			
	};
	
	public Square createSquare(){
		
		return squareCollections[0];
		
	}
	
	public Square scaleSquare(Square square){
		
		Point secondPoint = new Point(square.getSecond().getX()*2,square.getSecond().getY()*2);
		Point thirdPoint = new Point(square.getThird().getX()*2,square.getSecond().getY()*2);
		Point fourthPoint = new Point(square.getLast().getX()*2,square.getLast().getY()*2);
				
		return new Square(square.getFirst(),secondPoint,thirdPoint,fourthPoint);//making the first point stationary
		
	}
	
	public Square deScaleSquare(Square square){
		
		Point secondPoint = new Point(square.getSecond().getX()/2,square.getSecond().getY()/2);
		Point thirdPoint = new Point(square.getThird().getX()/2,square.getSecond().getY()/2);
		Point fourthPoint = new Point(square.getLast().getX()/2,square.getLast().getY()/2);
				
		return new Square(square.getFirst(),secondPoint,thirdPoint,fourthPoint);//making the first point stationary
		
	}
	
	//move the position of a square to the right by 3
	public Square moveSquare(Square square){
		Point firstPoint = new Point(square.getFirst().getX()+3,square.getFirst().getY());
		Point secondPoint = new Point(square.getSecond().getX()+3,square.getSecond().getY());
		Point thirdPoint = new Point(square.getThird().getX()+3,square.getSecond().getY());
		Point fourthPoint = new Point(square.getLast().getX()+3,square.getLast().getY());
				
		return new Square(firstPoint,secondPoint,thirdPoint,fourthPoint);
		
	}
	
	
	//move the position of a square to the left by 3
		public Square moveSquareLeft(Square square){
			Point firstPoint = new Point(square.getFirst().getX()-3,square.getFirst().getY());
			Point secondPoint = new Point(square.getSecond().getX()-3,square.getSecond().getY());
			Point thirdPoint = new Point(square.getThird().getX()-3,square.getSecond().getY());
			Point fourthPoint = new Point(square.getLast().getX()-3,square.getLast().getY());
					
			return new Square(firstPoint,secondPoint,thirdPoint,fourthPoint);
			
		}
		
}
