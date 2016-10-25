public class MaxHeap<K extends Comparable<? upser K> , E>{
    private E[] Heap;
    private int size;
    private int n;

    public MaxHeap(E[] h, int num, int max){
        Heap = h, n = num; size = max;
    }
    public int heapsize(){
        return n;
    }
    public boolean isLeaf(int pos){
        if pos>=n/2 && pos<n;
    }
    public int leftChild(int pos){
        assert pos<n/2: "posiiton has no child";
        return 2*pos+1;
    }
    public int rightChild(int pos){
        assert pos<(n-1)/2: " pos has no righrchild";
        return 2*pos+2;
    }
    public int parent(int pos){
        assert pos>0; "pos has no parent";
        return (pos-1)/2;
    }

    //how to build maxheap?

    public void buildheap(){
        for(int i=n/2-1; i>=0; i--) shilfdown(i);
    }
    public void shiftdown(int pos){//암기가 꼭필요.
        assert((pos>=0) && (pos<n));
        while(!isLeaf(pos)){
            int j = leftChild(pos);
            if((j<n-1) && Heap[j].compareTo(Heap[j+1]<0)) j++;
            if(Heap[pos].compareTo(Heap[j]>=0)){
                return;
            }
            DSutil.swap(Heap,pos,j)
            pos = j;
        }
    }

    public E removeMax(){
        assert n>0: "no element to remove";
        DSutil.swap(Heap,0,--n);
        if(n!=0) shiftdown(0);
        return Heap[n];//앞에서 --n해서....하아..
    }

    public void insert(E val){
        assert n<size:"heap is full";
        int curr = n++;
        Heap[n]=val;
        while((curr!=0)&& Heap[curr].compareTo(Heap[parent(curr)>0]){
            DSutil.swap(Heap,curr,parent(curr));
            curr = parent(curr);

        }
    }
    }
}

