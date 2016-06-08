package lab2.adapter;

public interface Iqueue<T> {

	void enqueue(T item);
	T dequeue();
	boolean isQueueEmpty();
}
