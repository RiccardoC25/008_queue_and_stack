public class Main {
    public static void main(String[] args) {
        Stack s =  new Stack();
        // initialization of `q` and `s`
        exampleStack(s);
    }

    private static void exampleStack(Stack s) {
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
}