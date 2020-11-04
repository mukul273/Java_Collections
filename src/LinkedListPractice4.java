import java.util.LinkedList;

public class LinkedListPractice4 {
    
    public static void main(String args[]) {
        
        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("A");
        ll1.add("B");
        ll1.add("C");
        ll1.add("D");
        System.out.println("LinkedList:" + ll1);
        ll1.poll();
        System.out.println("LinkedList after poll:" + ll1);
        ll1.pollFirst();
        System.out.println("LinkedList after pollFirst:" + ll1);
        ll1.pollLast();
        System.out.println("LinkedList after pollLast:" + ll1);
        ll1.clear();
        System.out.println("LinkedList after clear:" + ll1);
        ll1.poll();
        System.out.println("LinkedList after poll:" + ll1);
        ll1.pollFirst();
        System.out.println("LinkedList after pollFirst:" + ll1);
        ll1.pollLast();
        System.out.println("LinkedList after pollLast:" + ll1);
        
    }
}
