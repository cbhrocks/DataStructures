public class Runner {
    public static void main(String[] args){
        testLinkedList();
        //testQueue();
        //testStack();
    }

    static void testLinkedList(){
        DataStructures.LinkedList ll = new DataStructures.LinkedList();
        ll.add("zero");
        System.out.println(ll);
        ll.add("one");
        System.out.println(ll);
        ll.add("two");
        System.out.println(ll);
        ll.add("three");
        System.out.println(ll);
        ll.add("four");
        System.out.println(ll);
        ll.add("five");
        System.out.println(ll);
        System.out.println("index of zero: " + ll.indexOf("zero"));
        System.out.println("index of one: " + ll.indexOf("one"));
        System.out.println("index of two: " + ll.indexOf("two"));
        System.out.println("index of three: " + ll.indexOf("three"));
        System.out.println("index of four: " + ll.indexOf("four"));
        System.out.println("index of five: " + ll.indexOf("five"));

        System.out.println("obj at index 0: " + ll.get(0));
        System.out.println("obj at index 1: " + ll.get(1));
        System.out.println("obj at index 2: " + ll.get(2));
        System.out.println("obj at index 3: " + ll.get(3));
        System.out.println("obj at index 4: " + ll.get(4));
        System.out.println("obj at index 5: " + ll.get(5));
        ll.remove(4);
        System.out.println(ll);
        ll.remove(0);
        System.out.println(ll);
        ll.remove(3);
        System.out.println(ll);
        ll.remove(0);
        System.out.println(ll);
        ll.remove(0);
        System.out.println(ll);
        ll.remove(0);
        System.out.println(ll);
    }

    static void testQueue(){
        DataStructures.Queue queue = new DataStructures.Queue();

        queue.push("one");
        System.out.println(queue);
        queue.push("two");
        System.out.println(queue);
        queue.push("three");
        System.out.println(queue);
        queue.push("four");
        System.out.println(queue);
        queue.push("five");
        System.out.println(queue);
        queue.push("six");
        System.out.println(queue);
        System.out.println("popping: " + queue.pop());
        System.out.println(queue);
        queue.pop();
        System.out.println(queue);
        queue.pop();
        System.out.println(queue);
        queue.pop();
        System.out.println(queue);
        queue.pop();
        System.out.println(queue);
        queue.pop();
        System.out.println(queue);
    }

    static void testStack(){
        DataStructures.Stack stack = new DataStructures.Stack();

        stack.push("one");
        System.out.println(stack);
        stack.push("two");
        System.out.println(stack);
        stack.push("three");
        System.out.println(stack);
        stack.push("four");
        System.out.println(stack);
        stack.push("five");
        System.out.println(stack);
        stack.push("six");
        System.out.println(stack);
        System.out.println("popping: " + stack.pop());
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
