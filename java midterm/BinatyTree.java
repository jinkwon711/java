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





