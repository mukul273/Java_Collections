import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequePractice {
    
    public static void main(String args[]) {
        Deque<Integer> dq1 = new ArrayDeque<>();
        dq1.add(3);
        dq1.add(5);
        dq1.add(1);
        dq1.add(8);
        System.out.println(dq1);
        dq1.addFirst(2);
        System.out.println(dq1);
        dq1.addLast(4);
        System.out.println(dq1);
        
    }
}
