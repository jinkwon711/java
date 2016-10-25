linked List.java



class Link<E> {
	private element;
	private link<E> next;
	//이런거 없고 그냥 넥스트 val연결되는 링크만있다.
	// Link<E>(E val){
	// 	element = val; 
	// }
	Link<E>(link<E> nextItem){
		next = nextTiem;
	}
	Link<E>(E val, link<E> nextItem){
		element = val; next = nextItem;
	}
	link<E> next(){
		return next;
	}
	link<E> setNext(link <E> nextItem){
		return next = nextItem;	
	}
	link<E> element(){
		return element;
	}
	link<E> setElement(E it){
		return element = it;
	}

}

class LList<E> {
	private Link<E> head;
	private Link<E> tail;
	protected Link<E> curr;
	int cnt;
//	아래 intSize들어가는 생성자가 뭐하는애인지 모르겠다.
	LList(int Size){ this();} 
	LList(){
		head = tail = curr = new Link<E> (null);
		cnt = 0;
	}

	public void clear(){
		head = tail = curr = new Lnk<E> (null);
		cnt =0;
	}

	public void moveToStart(){
		curr = head;
	}
	public void moveToEnd(){
		curr = tail;
	}
	public int length(){
		return cnt;
	}
	public void next(){
		(if curr!=tail){ curr = curr.next();	}
	}
	public E getValue(){
		//imporved 는 curr이 실제로 가르키는 포인터보다 하나앞에
		//있어서 원하는 값 가져오려면 curr.next().getValue();
		assert curr.next()!=null
		return curr.next().element();

	}
	public void insert(E it){
		curr.setNext(new link<E>(it,curr.next()));
		cnt ++;
		//예외케이스
		if(curr==tail){
			tail = curr.next();
		}
	}
	public void append(E it){
		//tail 에는 setNext 에서 나온 다음 인자값으로 바꿔주기
		tail =tail.setNext(new Link<E>(it,null);
		cnt++;
	}

	public E remove(){
		//when curr = tail빼먹음 ㅋㅋ
		if(curr.next()==null){ return null;}
		E it = curr.next().element();
		if(curr.next().next()==null){//이거는 curr.next() == tail과 동치.
			//curr.setNext(null); 이거나 아래에있는 curr.setNext 나 동일
			tail = curr;
		}
		curr.setNext(curr.next().next());
		cnt--;
		return E;
	}

	public void prev(){
		//array based 아니므로 포문 하지말자.
		if(curr = head){ return; }
		E it = curr.element();
		curr = head;
		while(it!=curr.next().element()){
			curr = curr.next();
		}//temp로 하는거랑 그냥 curr 로하는것이랑 무슨차이?
	}

	public int currPos(){//다시하기 1번째 element pos는 0;
		link<E> temp = head;
		int i;
		for(i=0;curr!=temp;i++){
			temp = temp.next();
			
		}
		return i;//이거 무조건 포문 바깥에있어야하고 미리 선언해둬야함.
	}
	public void moveToPos(int pos){
		//assert 로 인풋확인 pos<=cnt이다 !!! 포함이다!!
		assert pos>=0 && pos<=cnt;
		curr = head;
		for(int i=0; i!=pos;i++);
			curr = curr.next()
	}

	array based는 insert remove에서 O(n); move 및 randomaccess에서 O(1);
	linked list는 정반대.
	array based는 pre-allocated한 공간이 필요, 하지만 linked based는 개별공간이 포인터만큼 더 차지.
	


}
