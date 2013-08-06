

public class Heap<T extends Comparable<T>> implements HeapInterface<T> {
	HeapNode<T> root;

	public Heap() {
		// TODO Auto-generated constructor stub
		root = null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (root == null);
	}
	boolean fullShape =false;
	private boolean isShapeFull(HeapNode<T> tree) {
		
	
		if (tree==null) {
			fullShape = false;
		} else if ((tree.getLeft()==null) && (tree.getRight()==null)) {//both are null
			fullShape = false;
		} else if((tree.getLeft()!=null) && (tree.getRight()!=null)){
			fullShape = true;
		} /*else if((tree.getLeft()!=null) && (tree.getRight()==null)) {//right is null
			fullShape = isShapeFull(tree.getLeft());
		}*/
		return fullShape;
	}
	
	public void enqueue(T element) {
		// TODO Auto-generated method stub
		HeapNode<T> newNode = new HeapNode<T>(element);
		this.root = recEnqueue(this.root, newNode);
	}

	private HeapNode<T> recEnqueue(HeapNode<T> tree, HeapNode<T> newNode) {
		if (tree==null){		//empty heap
			tree = newNode;
		} else if(((tree.getLeft()!=null) && (tree.getRight()==null))) {			//complete (left != null and right == null)	
			tree.setRight(recEnqueue(tree.getRight(),newNode));
		} else if ((isShapeFull(tree.getLeft()))&&(!isShapeFull(tree.getRight()))){
			tree.setRight(recEnqueue(tree.getRight(),newNode));
		} else {
			tree.setLeft(recEnqueue(tree.getLeft(),newNode));
		}
		return tree;
	}

	@Override
	public T dequeue() throws DataNotFoundException {
		// TODO Auto-generated method stub
		T element = null;

		return element;
	}
	
	
	public String inOrder() {
		// TODO Auto-generated method stub
		bstList = "";
		return inOrder(this.root);
	}

	String bstList = "";

	public String inOrder(HeapNode<T> tree) {

		// Left
		if (tree != null) {
			inOrder(tree.getLeft());
			// Root
			bstList += tree.getData();
			// Right
			inOrder(tree.getRight());
		}
		return bstList;
	}

	public String preOrder() {
		return preOrder(this.root);
	}

	public String preOrder(HeapNode<T> branch) {

		String toReturn = "";
		// Root
		toReturn += branch.getData().toString();

		// Left
		if (branch.getLeft() != null) {
			toReturn += preOrder(branch.getLeft());
		}

		// Right
		if (branch.getRight() != null) {
			toReturn += preOrder(branch.getRight());
		}

		return toReturn;

	}


	public String postOrder() {
		return postOrder(this.root);
	}

	public String postOrder(HeapNode<T> branch) {

		String toReturn = "";
		// Left
		if (branch.getLeft() != null) {
			toReturn += postOrder(branch.getLeft());
		}

		// Right
		if (branch.getRight() != null) {
			toReturn += postOrder(branch.getRight());
		}

		// Root
		toReturn += branch.getData().toString();

		return toReturn;

	}

}
