package interpreter;

public class ConcreteExpression extends Expression {

	public ConcreteExpression(Context context) {
		super(context);

	}

	private boolean isOperator(String str) {
		return str.equals("*") || str.equals("+") || str.equals("-") || str.equals("/");
	}
	@Override
	public boolean isNumber(String str) {
		return !isOperator(str);
	}
	
	@Override
	public int apply(int op1, int op2, String operator) {

		if (operator.equals("+")) {
			return op1 + op2;
		} else if (operator.equals("-")) {
			return op1 - op2;
		} else if (operator.equals("*")) {
			return op1 * op2;
		} else if (operator.equals("/")) {
			return op1 / op2;
		}

		return 1;
	}
}
