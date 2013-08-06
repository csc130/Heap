

public class HeapNode <T extends Comparable<T>>{
	T data;
	HeapNode <T> left;
	HeapNode <T> right;
	
	public HeapNode(T data) {
		this.data = data;
		left = null;
		right = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public HeapNode<T> getLeft() {
		return left;
	}

	public void setLeft(HeapNode<T> left) {
		this.left = left;
	}

	public HeapNode<T> getRight() {
		return right;
	}

	public void setRight(HeapNode<T> right) {
		this.right = right;
	}
	
}
