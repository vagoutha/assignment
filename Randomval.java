import java.util.*;
public class Randomval {
    public static void main(String[] args){
        HashMap<Integer,Double> map = new HashMap<Integer,Double>();
        map.put(1,7.008);
        map.put(2,8.008);
        map.put(3,9.008);
        map.put(4,10.008);
        map.put(5,11.008);
        map.put(6,12.008);
        map.put(7,13.008);
        map.put(8,14.008);
        map.put(9,15.008);
        map.put(10,16.008);
        System.out.println("Iterating HashMap...");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println("key"+m.getKey()+"Values="+m.getValue());
        }
    }
}

