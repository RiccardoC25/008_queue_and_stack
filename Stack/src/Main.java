import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //initialization of the Stack object and the StopwatchPro object
        Stack s = new Stack();
        StopwatchPro stopwatch = new StopwatchPro("c1");

            //The calls of the methods (Better call one per time)
        //initialization of `q` and `s`
        //exampleStack(s);
        //tryMethods(s);
        //tryVoid(s);
        performanceTest(s, stopwatch);
    }

    private static void exampleStack(Stack s) { // base example
        // 1. Add three strings
        s.push("Alice");
        s.push("Bob");
        s.push("Carol");

        // 2. dequeue one element
        System.out.println(s.pop());

        // 3. Add two more elements and then dequeue one
        s.push("David");
        s.push("Emily");
        System.out.println(s.pop());

        // 4. size and isEmpty
        System.out.println("Size: " + s.size() + " Empty: " + s.isEmpty());

        // 5. empty (works because I know that there are three elements left)
        s.pop();
        s.pop();
        s.pop();

        // 6. size and isEmpty
        System.out.println("Size: " + s.size() + " Empty: " + s.isEmpty());
    }

    private static void tryMethods(Stack s) { // try all the stack methods
        //try the push method
        s.push(true);
        //s.sizeControl();
        s.push(1);
        //s.sizeControl();
        s.push(2.7);
        //s.sizeControl();
        s.push('h');
        //s.sizeControl();
        s.push("Mariangela Fantozzi");
        //s.sizeControl();

        //try the size method
        System.out.println(s.size());

        //try the pop method
        System.out.println(s.pop());
        //s.sizeControl();
        System.out.println(s.size());

        //try the top method
        System.out.println(s.top());

        //try the isEmpty method
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        //s.sizeControl();
        System.out.println(s.pop());
        //s.sizeControl();
        System.out.println(s.pop());
        //s.sizeControl();
        System.out.println(s.pop());
        //s.sizeControl();
        System.out.println(s.isEmpty());
    }

    private static void tryVoid(Stack s) {
        //try methods with null parameters
        //try the size method
        System.out.println(s.size());

        //try the pop method
        System.out.println(s.pop());
        //s.sizeControl();
        System.out.println(s.size());

        //try the top method
        System.out.println(s.top());

        //try the isEmpty method
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        //s.sizeControl();
        System.out.println(s.pop());
        //s.sizeControl();
        System.out.println(s.pop());
        //s.sizeControl();
        System.out.println(s.pop());
        //s.sizeControl();
        System.out.println(s.isEmpty());
    }

    public static void performanceTest(Stack s, StopwatchPro stopwatch) throws InterruptedException {
        //test the performance of the push operation of 100000 elements in an empty stack
        System.out.println("Appending 100000 elements in an empty stack:");
        stopwatch.start();
        System.out.print("\nSTART: ");
        stopwatch.getTime();
        System.out.println();
        for (int i = 0; i < 100000; i++) {
            s.push(i);
        }
        System.out.print("END: ");
        stopwatch.getTime();
        System.out.println();
        stopwatch.stop();
        stopwatch.reset();

        //eliminate 50000 elements for the next test
        for (int i = 0; i < 50000; i++) {
            s.pop();
        }

        //test the performance of the pop operation of 50000 elements in a stack of 50000 elements
        System.out.println("Removing 50000 elements from a stack of 50000 elements: ");
        stopwatch.start();
        System.out.print("\nSTART: ");
        stopwatch.getTime();
        System.out.println();
        for (int i = 0; i < 50000; i++) {
            s.pop();
        }
        System.out.print("END: ");
        stopwatch.getTime();
        System.out.println();
        stopwatch.stop();
        stopwatch.reset();

        //append 50000 elements for the next test
        for (int i = 0; i < 50000; i++) {
            s.push(i);
        }

        //test the performance of the push operation of 50000 elements in a stack of 50000 elements
        System.out.println("Appending 50000 in a stack of 50000 elements: ");
        stopwatch.start();
        System.out.print("\nSTART: ");
        stopwatch.getTime();
        System.out.println();
        for (int i = 0; i < 50000; i++) {
            s.push(i);
        }
        System.out.print("END: ");
        stopwatch.getTime();
        System.out.println();
        stopwatch.stop();
        stopwatch.reset();

        //test the performance of the pop operation of 100000 elements in a stack of 100000 elements
        sleep(2000);
        System.out.println("Removing 100000 elements from a stack of 100000 elements: ");
        stopwatch.start();
        System.out.print("\nSTART: ");
        stopwatch.getTime();
        System.out.println();
        for (int i = 0; i < 100000; i++) {
            s.pop();
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