package by.htp.listExample;

public class ListExample {
	public static void main (String[] args ) {
		MyList list = new MyList ();
		list.addElement("a");
		list.addElement("b");
		list.addElement("c");
		/*
		Node a = list.getNode();
		while (a.getPrev()!=null){
			System.out.println(a);
			a=a.getPrev();
		}*/
		Node a = list.getFirstNode();
		System.out.println(a);
		do {
			a=a.getNext();
			System.out.println(a);
		} while (a.getNext()!=null);
			
	}
}
