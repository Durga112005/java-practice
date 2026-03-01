import java.util.*;
public class Ex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

try{
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a/b;
        System.out.println(c);

}
catch(InputMismatchException e){
    System.out.println("Input mismatch" +e);
}

catch(ArithmeticException e){
    System.out.println("Arithmetic exception handled" + e);
}

    }
}