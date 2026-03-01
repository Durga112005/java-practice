import java.util.*;
public class Arrex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,6};

        try{
            int n = sc.nextInt();
            System.out.println(arr[n]);
        }
    
        catch(InputMismatchException e){
            System.out.println("Input mismatch exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayOutofBoundException");
        }
finally{
      sc.close();
}
    }
}
