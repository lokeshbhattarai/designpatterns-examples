package interpreter;

import java.util.Stack;

public class Context {

	protected Stack<String> stack = new Stack<>();
	private String tokenString;
	
	public Context(String tokenString){
		this.tokenString = tokenString;
	}

	public Stack<String> getStack() {
		return stack;
	}

	public String getTokenString() {
		return tokenString;
	}
	
	
	
}
