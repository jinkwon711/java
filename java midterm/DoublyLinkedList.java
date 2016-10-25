DoublyLinkedList.java

Class Dlink<E> {
private E element;
private Dlink<E> next;
private Dlink<E> prev;

Dlink(E it, Dlink<E> p, Dlink<E> n){
    element = it;next = n; prev = p;
}
Dlink(Dlink<E> p ,Dlink<E> n){
    next = n; prev = p;
}

Dlink<E> next(){return next;}
Dlink<E> setNext(Dlink<E> n){
    return next = n;
}
Dlink<E> prev(){return prev;}
Dlink<E> setPrev(Dlink<E> p){
    return prev = p;
}
E element(){return element}
E setElement(E eval){return element = eval;}

public void insert(E it){
    //헤드테일 fixed라 예외처리 불필요
    curr.setNext(new Dlink<E>(it,curr,curr.next()));
    curr.next().next().setPrev(curr.next());
    cnt++;
}

public E remove(){//여긴 예외처리 필요..?!
    if(curr.next()==tail){return null;}
    E it = curr.next().element();
    curr.setNext(curr.next().next());
    curr.next().setPrev(curr);
    cnt--
    return it;
}
