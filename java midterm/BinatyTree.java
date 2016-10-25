Base CLass

public inteface VarBinNode{
    public boolean isleaf();
}

Class VarLeafNode implements VarBinNode{
    private String operand
    public VarLeafNode (string val){
        operand = val;
    }
    public boolean isleaf(){
        return true;
    }
    public String value(){
        return operand;
    }
};

Class VarIntNode implements VarBinNode{
    private Character operator;
    private VarBinNode left;
    private VarBinNode right;

    public VarIntNode(String val, VarBinNode l, VarBinNode r){
        operator  =val;
        left = l; right = r;
    }

    public VarBinNode leftchild(){ return left}
    public VarBinNode rightchild(){return right}
    public Character value(){ return operator;}
};

public static void traverse(VarBinNode rt){
    if(rt ==null) return;

    if(rt.isleaf()){
        visitLeafNode(((VarLeafNode)rt).value());
    }//캐스팅 조심
    else{
        visitIntNode(((VarIntNode)rt).value());
        traverse((VarIntNode)rt.leftchild());
        traverse((VarIntNode)rt.rightchild());
    }
}
private E findhelp(BSTNode<K,E> rt,K k){
    if(rt==null)return null;
    if(rt.key().compareTo(k)>0){
        return findhelp(rt.left(),k);
    }
    else if(rt.key().compareTo(k)<0){
        return findhelp(rt.right(),k);
    }
    else{
        return rt.element();
    }
}

private boolean checkBST(BSTNode<Integer> rt, Integer low, Integer high){
    if(rt==null) return true;
    Integer rootkey = rt.key();
    if((rootkey<low)|| rootkey>high){
        return false;
    }
    if(!checkBST(rt.left(),low,rootkey-1)){return false}
    return checkBST(rt.right(),rootkey,high);
}

private inserthlep(BSTNode<K,E> rt, K k, E e){
    if(rt==null) return new BSTNode<K,E>(k,e);
    if(rt.key().compareTo(k)<0){
        rt.setRight(inserthlep(rt.right(),k,e))
    }
    else if(rt.key().compareTo(k)>0){
        rt.setLeft(inserthlep(rt.left(),k,e))
    }
    return rt;
}

private removehelp(BSTNode<K,E> rt,K k){
    if(rt==null) return null;
    if(rt.key().compareTo(k)<0){
        rt.setRight(removehelp(rt.right(),k))
    }else if(rt.key().compareTo(k)>0){
        rt.setLeft(removehelp(rt.left(),k))
    }
    else{
        if(rt.left()==null){
            return rt.right();
        }
        if(rt.right()==null){
            return rt.left();
        }
        else{//two child
            BSTNode<K,E> temp = getMin(rt.right);
            rt.setElement(temp.element())
            rt.serKey(temp.key());
            rt.setRight(deleteMin(rt.right());

        }
    }

private deleteMin(BSTNode<K,E> rt, K k){
    if(rt.left() ==null) return rt.right();
    else{
        rt.setLeft(deleteMin(rt.left()));
        return rt;
    }
}









