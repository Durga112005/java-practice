import java.util.*;
public class Hash{
    public static void main(String[] args) {
        
        HashMap<Integer , String> map = new HashMap<>();

        map.put(11 , "Durga");
        map.put(12 , "Goki");
        map.put(13 , "Hari");
        map.put(14 , "Hema");

        //System.out.println(map);

        /* for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }    */

            map.remove(14);

            System.out.println(map);
            System.out.println(map.get(15));
            System.out.println(map.containsKey(14));
            System.out.println(map.size());

            map.put(11,"Durgadevi");
            System.out.println(map.get(11));

            for(Map.Entry<Integer,String> entry : map.entrySet()){
                System.out.println("Rollno :" + " " + entry.getKey() + " " + "Name :" + " " + entry.getValue());
            }


    }
}