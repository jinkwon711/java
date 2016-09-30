package ds.queue;
import ds.list.Link;
import ds.stack.LinkedStack;

public class LinkedQueue<E> implements Queue<E> {
	int cnt;
	private Link<E> head;
	private Link<E> tail;
	protected Link<E> curr;
	
	public LinkedQueue(int size){this();}
	public LinkedQueue(){
		curr=tail=head=new Link<E>(null,null);
		cnt = 0;
	}
	
	
	@Override
	public void clear() {
		head.setNext(null);
		head=tail=curr=new Link<E>(null,null);
		cnt =0;
	}

	@Override
	public void enqueue(E item) {
		curr=tail;
		curr.setNext(new Link<E>(item, null));
		tail = curr.next();
		cnt++;
	}

	@Override
	public E dequeue() {
		if(isEmpty()) return null;
		curr = head.next();
		E item = curr.getElement();
		if(cnt==1) head = tail;
		else head.setNext(curr.next());
		
		cnt--;
		return item;
		
	}

	@Override
	public int length() {
		return cnt;
	}

	@Override
	public boolean isEmpty() {
		if(cnt==0) return true;
		return false;
	}

	@Override
	public void reverse() {
		LinkedStack<E> temp = new LinkedStack<E>();
		while(!this.isEmpty()){
			temp.push(this.dequeue());
		}
		while(!temp.isEmpty()){
			this.enqueue(temp.pop());
		}
		
	}

}
