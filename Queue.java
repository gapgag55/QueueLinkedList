public class Queue {
	
	private class Node {
		private char data;
		private Node next;
		public Node(char data) {
			this.data = data;
			next = null;
		}
		public Node getNext() {return this.next;}
		public void setNext(Node next) {this.next = next;}
		public char getChar() {return this.data;}
	}

    private Node head,tail;

    public Queue() {
        head = tail = null;
    }

    public void enqueue(char ch) {
        if(head == null)
        	head = tail = new Node(ch);
        else {
        	tail.setNext(new Node(ch));
        	tail = tail.getNext();
        }
    }

    public void dequeue() {
        if(head != null)
        	head = head.getNext();
    }

    // HELPER METHOD
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	Node node = head;
    	while(node != null) {
    		sb.append(node.getChar());
    		node = node.getNext();
    		if(node != null) sb.append(' ');
    	}
    	return sb.toString();
    }
    
    // IMPLEMENT OCCURRENCE
    public void searchOccurrence(String word) {
    	Node first = head,current = first;
    	int i = 0,n = 0;
    	
    	while(current != null) {
    		if(word.charAt(i) == current.getChar()) {
    			i++;
    			current = current.getNext();
    		}
    		else {
    			i = 0;
    			current = first = first.getNext();
    		}
    		if(i == word.length()) {
    			n++;
    			i = 0;
    			current = first = first.getNext();
    		}
    	}
    	System.out.println("\n" + word + " has occurred: " + n + " time(s)");
    }
}
