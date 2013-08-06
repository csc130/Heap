
public class HeapDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap <String> aheap = new <String>Heap();
		for(int i=0; i<=4; i++)
			aheap.enqueue(i+" ");
		System.out.println(aheap.preOrder());
	}

}
//9: 0 1 3 7 8 4 9 2 5 6 
