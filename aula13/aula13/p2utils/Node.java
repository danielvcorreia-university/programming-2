package p2utils;

public class Node<T> {
	
	 final T elem;
	 Node<T> leftChild;
	 Node<T> rightChild;
	 
	 Node<T> (T elem, Node<T> leftChild, Node<T> rightChild) {
		 this.elem = elem;
		 this.leftChild = leftChild;
		 this.rightChild = rightChild;
	 }

}

