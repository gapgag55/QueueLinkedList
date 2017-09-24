public class Queue {

    Node first;

    public Queue() {
        first = null;
    }

    public void enqueue(Node x) {
        Node T;
        if (first == null) {
            first = x;
        }  else {
            T = first;
            while(T.next != null ) {
                T = T.next;
            }
            T.next = x;
        }
    }

    public void dequeue() {
        if (first != null) {
            first = first.next;
        }
    }

    // HELPER METHOD
    public void print() {
        Node T;
        T = first;

        while(T != null) {
            System.out.print(T.character + " ");
            T = T.next;
        }
    }

    // IMPLEMENT OCCURRENCE
    public void searchOccurrence(String word) {
        Node T; // Current
        Node B; // Previous
        int i = 0, occurs = 0;
        T = first;
        B = first;

        /*
         * IN CASE: "P"
         * WHEN WORD IS SINGLE CHARACTER
         */
        if (word.length() > 1) {

            /*
             * LOOP CHARACTER IN LINKED LIST
             */
            while (T != null) {

                /*
                 * LOOP CHARACTER FROM WORD PARAMETER
                 */
                if (i < word.length() - 1) {

                    /*
                     * CHECK WHETHER LINK LIST CHARACTER
                     * MATCHES WITH WORD ARGUMENT
                     *
                     * IF SO, INCREMENT i
                     * AND PREPARE FOR CHECKING NEXT CHARACTER
                     */
                    if (T.character != word.charAt(i)) {
                        i = 0;
                    } else {
                        i++;
                    }

                } else {
                    /*
                     * IF, i MORE THAN WORD LENGTH
                     * IT MEANS WE ARE FOUND THE WORD(S)
                     */
                    occurs += 1;
                    i = 0;

                    /* SET TO PREVIOUS CHARACTER IF WORD LENGTH > 2,
                     * SECURITY CHECKING
                     * BECAUSE USERS CAN FIND ONLY A SINGLE CHARACTER
                     */
                    if (word.length() > 2) {
                        T = B;
                        continue;
                    }
                }

                B = T;
                T = T.next;
            }
        } else {
            occurs += 1;
        }

        System.out.println("\n" + word + " has occurred: " + occurs + " time(s)");
    }
}
