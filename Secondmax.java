// second largest element

import java.util.*;
public class Secondmax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        if(n<2){
            System.out.println("can't possible to find second maximum element");
            return;
        }
        int[] arr = new int[n];
        
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
         int max = arr[0];
         int secondmax = Integer.MIN_VALUE;
         for(int i=1 ; i<n ; i++){
             if(arr[i]>max){
                 secondmax = max;
                 max = arr[i];
             }else if(arr[i]<max && arr[i]>secondmax){
                 arr[i] = secondmax;
             }
         }
         if(secondmax == Integer.MIN_VALUE){
         System.out.println("Secondmax not found");
    }else{
        System.out.println("Second maximum element is :" + secondmax);
    }
    }
}
