using freeList.java
이건 다시 외워야 할듯.
static Link freeList = null;

static <E> Link<E> get(E it, Link<E> nextVal){
	//여기부터
	if (freeList ==null){
		return new Link<E>(it,nextVal);
	}
	Link<E> temp = freeList;
	//여기까지 암기.
	freeList = freeList.next();

	temp.setElement(it);
	temp.setnext(nextVal);

	return temp;
}

void release(){
	element = null;
	next = null;
	freeList = this;
}

public void insert(E it){
//인서트는 특정 조건 안해줘도괜찮.
	curr.setNext(get(it,curr.next()));
	if(curr==tail){tail = curr.next();}
	cnt++;
	return;
}
public E remove(){//release해줄 대상은 tempptr로
	if(curr.next()==null){ return null;}
	E it = curr.next().element();
	if(curr.next()==tail){ tail =curr)
	Link<E> tempptr = curr.next();
	curr.setNext(curr.next().next());
	tempptr.release()
	cnt--;
	return it;
}