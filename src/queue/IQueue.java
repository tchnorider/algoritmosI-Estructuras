package queue;

public interface IQueue {

	public void enqueue(NodoL n);
	
	public boolean isEmpty();
	
	public boolean isFull();
	
	public Object front();
	
	public void dequeue(NodoL n);
	
}
