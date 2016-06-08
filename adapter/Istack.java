package lab2.adapter;

public interface Istack<T> {

	void push(T item);
	T pop();
	boolean isStackEmpty();
}
