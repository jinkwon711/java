package structures;
import  java.util.Arrays;
import java.util.Stack;

/**
 * A class of a binary tree.
 */
public class BinaryTree {
    /** Head node for this tree */
    static BinaryNode root;
    static String result="";
    static int removed = 0;
    Stack<String> calResult = new Stack<String>();


    /**
     * A constructor for a binary tree using the expression.
     * You should parse the expression and store them recursively.
     */
    
    
    public BinaryTree(String expression) {
    	String[] arr = expression.split(" ");
    	root = parse(arr);
    }

    /**
     * Returns the result of calculation for the given expression.
     */
    public int calculate() {
    	traversal(root);
    	if(!calResult.isEmpty()){
    		int answer = Integer.parseInt(calResult.pop());
    		return answer;
    	}
        return 0;
    }
    
    

    /**
     * Returns the result of post-order traversal of this tree.
     */
    public String postorder() {
    	result = "";
    	traversal(root);
        return result;
    }
    

    public void traversal(BinaryNode curr){
    	if(curr==null){
    		return;
    	}
    	if(!curr.isLeaf()){
    		traversal(curr.getLeft());
    	}
    	if(!curr.isLeaf()){
    		traversal(curr.getRight());
    	}
    	
    	result += curr.getElement();
    	if(isNumeric(curr.getElement())){
    		calResult.push(curr.getElement());
    	}
    	else if(calResult.size()>1){
    		int number2 = Integer.parseInt(calResult.pop());
    		int number1 = Integer.parseInt(calResult.pop());
    		
    		if(curr.getElement().equals("+")){
    			calResult.push(Integer.toString(number1+number2));
    		}
    		else if(curr.getElement().equals("-")){
    			calResult.push(Integer.toString(number1-number2));
    		}
    		else if(curr.getElement().equals("/")){
    			calResult.push(Integer.toString(number1/number2));
    		}
    		else if(curr.getElement().equals("*")){
    			calResult.push(Integer.toString(number1*number2));
    		}
    	}
    }
    
    public boolean isNumeric(String s) {  
        return s.matches("[-+]?\\d*\\.?\\d+");  
    }  
    public int topNode(String[] arr){
    	int cnt=0;
    	for(int i=0;i!=arr.length; i++){
    		if(arr[i].equals("(")){
    			cnt++;
    		}
    		else if(arr[i].equals(")")){
    			cnt--;
    		}
    		else if((cnt==0)&&(arr[i].equals("+")||arr[i].equals("/")||
    				arr[i].equals("*")||arr[i].equals("-"))){
    			return i;
    		}
    	}
		removed++;

    	return topNode(Arrays.copyOfRange(arr,1,arr.length-1));
    	
    }
    public BinaryNode parse(String[] arr){
    	
    	int i = topNode(arr);
    	
    	while(removed!=0){
    		arr = Arrays.copyOfRange(arr,1,arr.length-1);
    		removed--;
    	}
    	
    	if(i==0){
    		return null;
    	}

    	String op = arr[i];
    	BinaryNode curr = new BinaryNode(op);//set middle.
    	if(arr[i-1].equals(")")){ // set left
    		String[] sliced = Arrays.copyOfRange(arr,1,i-1);
    		if(i==3){
    			curr.setLeft(new BinaryNode(arr[i-2]));
    		}else{
        		curr.setLeft(parse(sliced));//슬라이싱법 찾기.
    		}
    	}else if(isNumeric(arr[i-1])){
    		curr.setLeft(new BinaryNode(arr[i-1]));
    	}
    	
    	if(arr[i+1].equals("(")){ // set right
    		String[] sliced = Arrays.copyOfRange(arr,i+2,arr.length-1);
    		if(i==arr.length-4){
    			curr.setRight(new BinaryNode(arr[i+2]));
    		}
    		else{
        		curr.setRight(parse(sliced));//슬라이싱법 찾기.set with recursive
    		}

    	}else if(isNumeric(arr[i+1])){
    		curr.setRight(new BinaryNode(arr[i+1]));
    	}
    	
    	return curr;
    }

}
