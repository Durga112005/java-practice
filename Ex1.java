/*Question: Write a method that performs division and handles the case where the divisor is zero.
Instructions:
1. Create a Java class named Division Example.
2. Inside the class, create a method named divideNumbers that takes two integers as parameters: numerator and denominator.
3. In the method, use a try block to perform the division: int result = numerator /denominator;.
4. Catch the ArithmeticException if the denominator is zero and print an appropriate message: "Cannot divide by zero".
5. Test the method by calling it with different values, including zero as the denominator. */

import java.util.*;

class Division{
    void dividenumbers(int num , int den){
        try{
        int result = num / den;
        System.out.println("Result is printed :" + result);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        Division s = new Division();
        s.dividenumbers(n1 , n2);


    }
    
}
