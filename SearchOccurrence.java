import java.util.Random;

public class SearchOccurrence {
    public static void main(String[] args) {
        // TEST CASE: "KAP", ANS: 2
        test("KAP", 2);
        // TEST CASE: "KIKI", ANS: 1
        test("KIKI", 1);
    }

    public static void test(String test, int times) {
        Queue queue = new Queue();
        Random r = new Random();
        char c;

        for(int i = 0; i < 20; i++) {

            if (i == 10) {
                for(int j = 0; j < times; j++) {
                    for(int k = 0; k < test.length(); k++) {
                        Node x = new Node(i, test.charAt(k));
                        queue.enqueue(x);
                        i++;
                    }
                }
            } else {
                c = (char) (r.nextInt(26) + 'A');
                Node x = new Node(i, c);
                queue.enqueue(x);
            }
        }

        queue.print();
        queue.searchOccurrence(test);
    }
}
