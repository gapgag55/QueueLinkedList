public class BonusSearchOccurrence {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue('K');
        queue.enqueue('I');
        queue.enqueue('K');
        queue.enqueue('I');
        queue.enqueue('K');
        queue.enqueue('I');
        queue.enqueue('K');
        queue.enqueue('I');

        System.out.println(queue);
        queue.searchOccurrence("KIKI");
    }
}
