package ds.list;

public class LinkedList<E> implements List<E> {
	int cnt;
	private Link<E> head;
	private Link<E> tail;
	protected Link<E> curr;
	
	LinkedList(int size){this();}
	LinkedList(){
		curr=tail=head=new Link<E>(null,null);
		cnt = 0;
	}
	
	
	@Override
	public void clear() {
		head.setNext(null);
		curr=tail=head=new Link<E>(null,null);
	}

	@Override
	public void insert(int pos, E item) {
		moveToPos(pos-1);
		curr.setNext(new Link<E>(item, curr.next()));
		if(tail==curr) tail = curr.next();
		cnt++;
		
	}

	@Override
	public E remove(int pos) {
		moveToPos(pos-1);
		if(curr.next() == null) return null;
		E item = curr.next().getElement();
		if(tail==curr.next()) tail = curr;
		curr.setNext(curr.next().next());		
		cnt--;
		return item;
	}

	@Override
	public int length() {
		return cnt;
	}

	@Override
	public E getValue(int pos) {
		moveToPos(pos);
		E item = curr.getElement();
		return item;
	}
	public void moveToPos(int pos){
		assert (pos>=0) && (pos<=cnt): "position out of range";
		curr = head;
		for(int i =0; i!=pos ; i++){
			curr = curr.next();
		}

		
		
		
	}

}
