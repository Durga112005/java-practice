//Count frequency of elements using HashMap

import java.util.*;
public class Freq {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,10,20,10,50};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num , map.getOrDefault(num , 0)+1);
        }
       System.out.println(map);

    }
    
}
