import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice2 {
    
    public static void main(String args[]) {
        
        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("A");
        ll1.add("B");
        ll1.add("D");
        System.out.println("LinkedList:" + ll1);
        List<String> subList = ll1.subList(1,3);
        System.out.println("subList:" + subList);
        subList.add("C");
        System.out.println("subList after add:" + subList);
        System.out.println("LinkedList after:" + ll1);
        Collections.sort(subList);
        System.out.println("subList after sort:" + subList);
        System.out.println("LinkedList after sort:" + ll1);
        Collections.sort(subList, Collections.reverseOrder());
        System.out.println("subList after reverseOrder:" + subList);
        System.out.println("LinkedList after reverseOrder:" + ll1);
    }
}
