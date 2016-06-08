package lab2.adapter;

public class Client {

	public static void main(String[] args){
		Istack<Integer> stack = new Adapter<Integer>();
		stack.push(5);
		
		Iqueue<Integer> queue = new Adapter<Integer>();
		queue.enqueue(10);
		
	}
}
