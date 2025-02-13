import java.util.*;
import java.util.LinkedList;
public class queue1{
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(1);//add =push
        System.out.println(q.isEmpty());
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.size());//get size
        System.out.println(q);
        q.remove();//remove=pop
        System.out.println(q);
        q.poll();//poll=remove=pop  
        System.out.println(q);
        System.out.println(q.element());//element=peek
        System.out.println(q.size());
        q.add(5);
       
        System.out.println(q.poll());
        System.out.println(q);
    }
}