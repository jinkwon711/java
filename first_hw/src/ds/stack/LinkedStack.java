package ds.stack;
import ds.list.Link;

public class LinkedStack<E> implements Stack<E> {
	int cnt;
	private Link<E> head;
	private Link<E> tail;
	protected Link<E> curr;
	
	LinkedStack(int size){this();}
	public LinkedStack(){
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
	public void push(E item) {
		curr=tail;
		curr.setNext(new Link<E>(item, null));
		tail = curr.next();
		cnt++;
		
	}

	@Override
	public E pop() {
		if(isEmpty()) return null;
		curr=head;
		while(curr.next()!=tail) curr=curr.next();
		E item = curr.next().getElement();
		curr.setNext(null);
		tail = curr;
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

}
