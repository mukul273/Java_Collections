import java.util.LinkedList;

public class LinkedListPractice3 {
    
    public static void main(String args[]) {
    
        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("A");
        ll1.add("B");
        ll1.add("D");
        System.out.println("LinkedList:" + ll1);
        ll1.push("Z");
        System.out.println("LinkedList after push:" + ll1);
        String popped = ll1.pop();
        System.out.println("LinkedList after pop:" + ll1 + " popped element:"+popped);
    }
}
