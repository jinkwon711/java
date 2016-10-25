BinarySearch.java

Class BSTNode<K,E> implements BinNode<E>{
    private K key;
    private E element;
    private BSTNode<K,E> left;
    private BSTNode<K,E> right;

    public BSTNode(){left = right = null;}
    public BSTNode(K k, E val){ left = right = null; key = k, element = val}
    public BSTNode(K k, E val, BSTNode<K,E> l, BSTNode<K,E> r)
    {key = k; element = val; left = l; right = r}

    public K key(){return key};
    public K setKey(K k){return key=k};
    public E element(){return val};
    public E setElement(E val){return element = val};

    public BSTNode<K,E> left(){return left;}
    public BSTNode<K,E> right(){return right;}
    public BSTNode<K,E> setLeft(BSTNode<K,E> l){return left =l;)
    public BSTNode<K,E> setRight(BSTNode<K,E> r){return righr = r;}

    public boolean isLeaf(){
        if(right==null&&left==null)return true;
        else false;
}

class BST<K extends comparable<? super K>, E>
    implements Dictionaty<K,E>
{
    private BSTNode<K,E> root;
    private int nodecount;

    BST(){ root =null; nodecount = 0;}
    public void clear(){
        root=null; nodecount = 0;
    }

    public void insert(K k, E e ){
        root = inserthelp(root,k,e);
        nodecount++;
    }
    public void remove(K k, E e){
        E temp = findHelp(root,k);
        if(temp !=null){
            root = removehelp(root,k,e);
            nodecount--;
        }
        return temp;
    }


}