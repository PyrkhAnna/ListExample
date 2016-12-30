package by.htp.listExample;

public class Node {
	private Object element;
	private Node next;
	private Node prev;
		
	public Node (){
		
	}
	public Node (Node prev, Object element, Node next){
		this.next= next;
		this.prev=prev;
		this.element= element;
	}
	
	public Node getNext(){
		return this.next;
	}
	public void setNext(Node n){
		this.next=n;
	}
	public Node getPrev(){
		return this.prev;
	}
	public String toString() {
		return "Node [element=" + element + "]";
	}
	
}
