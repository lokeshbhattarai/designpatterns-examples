package interpreter;

public class Main {

	public static void main(String[] args) {
		String tokenString = "- + 10 5 - 8 2";//assuming the tokenString is always valid notation

		Context context = new Context(tokenString);
		Expression expression = new ConcreteExpression(context);
		String result = expression.interpret();
		
		System.out.println("result::"+result);	
	}

}
