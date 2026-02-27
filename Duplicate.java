import java.util.*;
public class Duplicate {

    public static void main(String[] args) {
        
    ArrayList<Integer> list = new ArrayList<>();
    list.add(11);
    list.add(12);
    list.add(13);
    list.add(11);
    list.add(15);

    list.sort(null);

    for(int i=0 ; i<list.size()-1 ; i++){
        if(list.get(i).equals(list.get(i+1))){
            list.remove(i+1);
            i--;
        }
    }

    System.out.println(list);
}
}
