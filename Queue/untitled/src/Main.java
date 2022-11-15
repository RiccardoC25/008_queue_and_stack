import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Queue q = new Queue();
        StopwatchPro stopwatch = new StopwatchPro("c1");
        // initialization of `q`
        //exampleQueue(q);
        performanceTest(q, stopwatch);
    }

    private static void exampleQueue(Queue q) {
        // 1. Add three strings
        //q.sizeControl();
        q.enqueue("Alice");
        //q.sizeControl();
        q.enqueue("Bob");
        //q.sizeControl();
        q.enqueue("Carol");
        //q.sizeControl();

        // 2. dequeue one element
        System.out.println(q.dequeue());
        //q.sizeControl();

        // 3. Add two more elements and then dequeue one
        q.enqueue("David");
        //q.sizeControl();
        q.enqueue("Emily");
        //q.sizeControl();
        System.out.println(q.dequeue());
        //q.sizeControl();

        // 4. size and isEmpty
        System.out.println("Size: " + q.size() + " Empty: " + q.isEmpty());

        // 5. empty (works because I know that there are three elements left)
        System.out.println(q.dequeue());
        //q.sizeControl();
        System.out.println(q.dequeue());
        //q.sizeControl();
        System.out.println(q.dequeue());
        //q.sizeControl();

        // 6. size and isEmpty
        System.out.println("Size: " + q.size() + " Empty: " + q.isEmpty());
    }
    private static void tryMethods(Queue s) { // try all the stack methods
        //try the enqueue method
        s.enqueue(true);
        //s.sizeControl();
        s.enqueue(1);
        //s.sizeControl();
        s.enqueue(2.7);
        //s.sizeControl();
        s.enqueue('h');
        //s.sizeControl();
        s.enqueue("Mariangela Fantozzi");
        //s.sizeControl();

        //try the size method
        System.out.println(s.size());

        //try the dequeue method
        System.out.println(s.dequeue());
        //s.sizeControl();
        System.out.println(s.size());

        //try the top method
        System.out.println(s.front());

        //try the isEmpty method
        System.out.println(s.isEmpty());
        System.out.println(s.dequeue());
        //s.sizeControl();
        System.out.println(s.dequeue());
        //s.sizeControl();
        System.out.println(s.dequeue());
        //s.sizeControl();
        System.out.println(s.dequeue());
        //s.sizeControl();
        System.out.println(s.isEmpty());
    }

    private static void tryVoid(Queue s) {
        //try methods with null parameters
        //try the size method
        System.out.println(s.size());

        //try the dequeue method
        System.out.println(s.dequeue());
        //s.sizeControl();
        System.out.println(s.size());

        //try the front method
        System.out.println(s.front());

        //try the isEmpty method
        System.out.println(s.isEmpty());
        System.out.println(s.dequeue());
        //s.sizeControl();
        System.out.println(s.dequeue());
        //s.sizeControl();
        System.out.println(s.dequeue());
        //s.sizeControl();
        System.out.println(s.dequeue());
        //s.sizeControl();
        System.out.println(s.isEmpty());
    }

    public static void performanceTest(Queue s, StopwatchPro stopwatch) throws InterruptedException {
        //test the performance of the enqueue operation of 100000 elements in an empty stack
        System.out.println("Appending 100000 elements in an empty stack:");
        stopwatch.start();
        System.out.print("\nSTART: ");
        stopwatch.getTime();
        System.out.println();
        for (int i = 0; i < 100000; i++) {
            s.enqueue(i);
        }
        System.out.print("END: ");
        stopwatch.getTime();
        System.out.println();
        stopwatch.stop();
        stopwatch.reset();

        //eliminate 50000 elements for the next test
        for (int i = 0; i < 50000; i++) {
            s.dequeue();
        }

        //test the performance of the dequeue operation of 50000 elements in a stack of 50000 elements
        System.out.println("Removing 50000 elements from a stack of 50000 elements: ");
        stopwatch.start();
        System.out.print("\nSTART: ");
        stopwatch.getTime();
        System.out.println();
        for (int i = 0; i < 50000; i++) {
            s.dequeue();
        }
        System.out.print("END: ");
        stopwatch.getTime();
        System.out.println();
        stopwatch.stop();
        stopwatch.reset();

        //append 50000 elements for the next test
        for (int i = 0; i < 50000; i++) {
            s.enqueue(i);
        }

        //test the performance of the enqueue operation of 50000 elements in a stack of 50000 elements
        System.out.println("Appending 50000 in a stack of 50000 elements: ");
        stopwatch.start();
        System.out.print("\nSTART: ");
        stopwatch.getTime();
        System.out.println();
        for (int i = 0; i < 50000; i++) {
            s.enqueue(i);
        }
        System.out.print("END: ");
        stopwatch.getTime();
        System.out.println();
        stopwatch.stop();
        stopwatch.reset();

        //test the performance of the dequeue operation of 100000 elements in a stack of 100000 elements
        sleep(2000);
        System.out.println("Removing 100000 elements from a stack of 100000 elements: ");
        stopwatch.start();
        System.out.print("\nSTART: ");
        stopwatch.getTime();
        System.out.println();
        for (int i = 0; i < 100000; i++) {
            s.dequeue();
        }
        System.out.print("END: ");
        stopwatch.getTime();
        System.out.println();
        stopwatch.stop();
        stopwatch.reset();

        //See if the stack is empty
        System.out.println("Is Empty: " + s.isEmpty());
    }


}