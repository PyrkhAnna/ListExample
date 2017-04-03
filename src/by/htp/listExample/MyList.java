package by.htp.listExample;

public class MyList {
	private Node node;
	private Node linkPrev;
	private Node first;
	private Node last;
	private int size;
	
	public MyList (){
		this.node = new Node();
		this.size = 0;
	}
	public void addElement(Object o){
		this.size++;
		this.linkPrev= node;
		Node current = new Node (node, o, null);
		node.setNext(current);
		node= current;
		if (this.size == 1) this.first = node;
		
	}
	public Node getPrev(){
		return linkPrev;
	}
	public Node getNode(){
		return node;
	}
	public Node getFirstNode(){
		return first;
	}
	public Node getLastNode(){
		return last;
	}
	public int getSize(){
		return this.size;
	}
}
