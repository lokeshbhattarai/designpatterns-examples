package lab2.adapter;

public class Adapter<T> implements Istack<T>,Iqueue<T>{

	Adaptee adaptee;
	
	public Adapter(){
		adaptee = new Adaptee();
	}
	
	@Override
	public void enqueue(T item) {
		adaptee.addItemToList(item);
	}

	@Override
	public T dequeue() {
		return (T)adaptee.getItem();
	}

	@Override
	public void push(T item) {
		adaptee.addItemToList(item);
		
	}

	@Override
	public T pop() {
		return (T)adaptee.getItem();
	}

	@Override
	public boolean isStackEmpty() {
		return adaptee.isEmpty();
	}
	
	@Override
	public boolean isQueueEmpty() {
		return adaptee.isEmpty();
	}

}
