public class BonusSearchOccurrence {
    public static void main(String[] args) {
        Node a = new Node(0, 'K');
        Node b = new Node(1, 'I');
        Node c = new Node(2, 'K');
        Node d = new Node(3, 'I');
        Node e = new Node(4, 'K');
        Node f = new Node(5, 'I');
        Node g = new Node(6, 'K');
        Node h = new Node(7, 'I');

        Queue queue = new Queue();
        queue.enqueue(a);
        queue.enqueue(b);
        queue.enqueue(c);
        queue.enqueue(d);
        queue.enqueue(e);
        queue.enqueue(f);
        queue.enqueue(g);
        queue.enqueue(h);

        queue.print();
        queue.searchOccurrence("KIKI");
    }
}
