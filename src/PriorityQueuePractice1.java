import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePractice1 {
    
    public static void main(String args[]) {
        Queue<Integer> q1 = new PriorityQueue<>();
        Queue<Integer> q2 = new PriorityQueue<>();
        
        q1.add(5);
        q1.add(1);
        q1.add(3);
        q1.add(8);
        System.out.println(q1);
        q1.remove();
        System.out.println(q1);
        System.out.println("Peek: " + q1.peek());
        System.out.println(q1);
        System.out.println("Poll: " + q1.poll());
        System.out.println(q1);
        q2.addAll(q1);
        q1.clear();
        System.out.println("Clear: " + q1);
        Iterator<Integer> iterator = q2.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}
