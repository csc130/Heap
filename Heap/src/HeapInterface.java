
public interface HeapInterface <T extends Comparable<T>>{
	//public boolean isFull();
	public boolean isEmpty();
	public void enqueue(T element);
	public T dequeue() throws DataNotFoundException;
}
