/*Question: Create a custom exception InvalidAgeException and use it in a method to check if an age is valid.
Instructions:
1. Create a Java class named InvalidAgeException that extends Exception.
2. In the InvalidAgeException class, add a constructor that takes a message as a parameter and passes it to the superclass constructor.
3. Create another class named AgeValidator.
4. In the AgeValidator class, create a method named checkAge that takes an integer age as a parameter.
5. In the checkAge method, throw an InvalidAgeException if the age is less than 0 or greater than 150.
6. In the main method, test the checkAge method with different age values. */

import java.util.*;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }

}

class AgeValidator {
    void checkAge(int age){
        try{
            if(age<0 || age>150){
                throw new InvalidAgeException("Invalid age");
            }
            else{
                System.out.println("Valid Age");
            }
        }
        catch(InvalidAgeException e){
            System.out.println(e);
        }
    }
}
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        AgeValidator obj = new AgeValidator();
        obj.checkAge(n);

    }
    
}
