public class TestQueue {
    public static void main(String[] args) {
        Node a = new Node(0, 'a');
        Node b = new Node(1, 'b');
        Node c = new Node(2, 'c');
        Node d = new Node(3, 'd');
        Node e = new Node(4, 'e');

        Queue queue = new Queue();
        queue.enqueue(b);
        queue.enqueue(a);
        queue.enqueue(d);
        queue.enqueue(c);

        System.out.print("Enqueue [b, a, c, d]: ");
        queue.print();
        System.out.println();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.print("Dequeue 3 times: ");
        queue.print();
    }
}
