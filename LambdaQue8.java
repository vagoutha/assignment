import java.lang.*;
import java.util.*;
public class LambdaQue8 {
    public static void main(String args[])
    {
            Thread t1=new Thread(()->{
                List<Integer>list=new ArrayList<Integer>();
                list.add(1);
                list.add(4);
                list.add(3);
                list.add(5);
                System.out.println(list);

            });
            t1.start();
    }
}
