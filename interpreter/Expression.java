package interpreter;

public abstract class Expression {

	private Context context;
	
	public Expression(Context context){
		this.context = context;
	}
	
	public String interpret(){
		
		String[] strArray = context.getTokenString().split(" ");
		for (int i = strArray.length-1; i >=0; i--) {
			
			String str = strArray[i];
						
			if(isNumber(str)){
				context.getStack().push(str);
			}else{
				int operand1 = Integer.parseInt(context.getStack().pop());//for prefix first element popped is first operand.. which is opposite in post-fix 
				int operand2 = Integer.parseInt(context.getStack().pop());
				
				int temp = apply(operand1, operand2, str);
				context.getStack().push(String.valueOf(temp));
			}
						
		}
		
		return context.getStack().pop();
	}
	
	public abstract boolean isNumber(String str);
	public abstract int apply(int operand1,int operand2,String operator);
	
}
