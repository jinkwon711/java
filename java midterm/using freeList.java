using freeList.java

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

public void insert(E it){
	
}
}