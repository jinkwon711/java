public void clear()
public insert(E item);
public void append(E item);
public E remove()

public void moveToStart(){
	

}

public static boolean find(List<Integer> L, int k){
	
}

class Alist<E> implements List<E>{
	priviate static final int defualtsize=10;
	private int maxSize;
	private int listSize;
	private int curr;
	private E[] listArray;

	Alist(){this(defualtsize)}
	Alist(int Size){
		MaxSize = Size;
		listSize = 0;
		curr=0;
		//new ListArray[size]
		ListArray = (E[]) new Object[size];

	}

	public void clear(){
		listSize = curr = 0;
	}

	public void moveToStart(){
		curr = 0;
	}

	public void moveToEnd(){
		//curr = listSize-1;
		curr = listSize;
	}

	public void prev(){
		//조건빠짐
		if(curr!=0)	curr--;
	}
	public void next(){
		if(curr<listSize) curr++;
	}
	public int length(){
		return listSize;
	}
	public int currPost(){
		return curr;
	}

	public void moveToPos(pos){
		// assert pos<listSize && pos>=0 : pos out of range;
		assert (pos<=listSize) && (pos>=0) : pos out of range;
		curr = pos;
	}
	public E getvalue(){
		assert (curr<listSize) && (curr>=0) : curr out of range;
		return listArray[curr];
	}
	public void insert(E it){
		assert listSize<maxSize : "List is already full";
		for(int i = listSize-1; i!=curr-1; i--){
			//또는 for (int i = listsize; i!=curr; i--)
			listArray[i+1] = listArray[i];
		}
		listArray[curr] = it;
		//총개수 증가안시켜줌..ㅠ
		listSize++;
	}
	public void append(E it){
		assert listSize<maxSize : "list is already full";
		listArray[listSize] = it;
		listSize++;
	}

	public E remove(){
		//assert로 처리안하네.ㄸ
		if(listSize>0 ||(curr>=listSize)){
			return null;
		}
		E it = listArray[curr]; 
		listsize--;
		for(int i=curr; i!=listSize; i++){
			listArray[curr] = listArray[curr+1];
		}
		return it;
	}
	
	}


	}


}