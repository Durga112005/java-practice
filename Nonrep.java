// Find first non-repeating character (using HashMap)
import java.util.*;
public class Nonrep {
    public static void main(String[] args) {
        String a = "abcdefghasfffgfdb";

        HashMap<Character , Integer> map = new HashMap<>();
 
        // Freq count
        for(char c : a.toCharArray()){
            map.put(c , map.getOrDefault(c , 0)+1);
        }

        //find non-repeating character
        for(char c : a.toCharArray()){
            if(map.get(c) == 1){
                System.out.println("First non-repeating character :" + c);
                return;
            }
        }
        System.out.println("No non-repeating character found");
            
        }
    }
    

