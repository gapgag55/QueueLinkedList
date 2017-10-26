public class TestQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue('b');
        queue.enqueue('a');
        queue.enqueue('d');
        queue.enqueue('c');

        System.out.print("Enqueue [b, a, c, d]: ");
        System.out.println(queue);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.print("Dequeue 3 times: ");
        System.out.println(queue);
    }
}
