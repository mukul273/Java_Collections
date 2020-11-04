import java.util.LinkedList;

public class LinkedListPractice5 {
    
    public static void main(String args[]) {
        
        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("A");
        ll1.add("B");
        ll1.add("C");
        ll1.add("D");
        System.out.println("LinkedList:" + ll1);
        System.out.println("LinkedList after peek:" + ll1.peek());
        System.out.println("LinkedList after peekFirst:" + ll1.peekFirst());
        System.out.println("LinkedList after pollLast:" + ll1.peekLast());
        
        System.out.println("LinkedList after pollLast:" + ll1);
        
    }
}
