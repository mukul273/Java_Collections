import java.util.LinkedList;

public class LinkedListPractice {
    
    public static void main(String args[]) {
        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("A");
        ll1.add("B");
        ll1.add("C");
        ll1.add(1, "a");
        System.out.println(ll1);
        ll1.addFirst("F");
        System.out.println(ll1);
        ll1.addLast("e");
        System.out.println(ll1);
        LinkedList<String> ll2 = new LinkedList<>();
        ll2.addAll(ll1);
        System.out.println("AddAll:" + ll2);
        ll2.remove();
        System.out.println("remove():"+ ll2);
        ll2.remove(2);
        System.out.println("remove(index):" + ll2);
        ll2.remove("A");
        System.out.println("remove(value)" + ll2);
        ll2.removeFirst();
        System.out.println("removeFirst:" + ll2);
        ll2.removeLast();
        System.out.println("removeLast:"+ ll2);
        ll2.clear();
        System.out.println("clear:"+ ll2);
        ll1.set(1, "D");
        System.out.println("set:"+ ll1);
        String value  = ll1.get(2);
        System.out.println("get:"+ value);
        System.out.println("getFirst:"+ ll1.getFirst());
        System.out.println("getLast:"+ ll1.getLast());
    }
}
