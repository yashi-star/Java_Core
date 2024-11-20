package LEARNING_JAVA;

import java.util.*;
// 1) Syntax errors
// 2) Logical errors
// 3) Runtime errors- also called Exceptions

// Syntax Errors
// When complex finds something wrong with our program,it throws a syntax error
// int   a = 9  // No semicolon, syntax errors!
// a =   a + 3;
// d = 4; // Variable not declared, syntax errors


// A logical error or a bug occurs when a program compiles and round but does the wrong thing.
// - Message delivered wrongly
// - Wrong time of chats being displayed
// Incorrect redirects!


// Java may sometimes encounter an error while the program is running.These are also called Exceptions!
// These are encountered due to circumstances like bad input and (or) resource constraints.
// Ex: User supplies 'S' + 8 to a program that adds 2 numbers.

// Syntax errors and logical errors are encountered by the programmers, whereas Run-time errors are encountered by the users.



// Exceptions in Java
// An exception is an event that occurs when a program is executed dissented the normal flow of instructions.
// There are mainly two types of exceptions in java:
// 1) Checked exceptions - compile-time exceptions (Handle by the compiler)
// 2) Unchecked exceptions - Runtime exceptions

// Commonly Occurring Exceptions
// 1) Null pointer exception
// 2) Arithmetic Exception
// 3) ArrayIndexOutOfBound exception
// 4) Illegal Argument Exception
// 5) Number Format Exception


class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class MaxAgeException extends Exception{
    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure that the value of age entered is correct";
    }
}






public class Error_Exception {
    public static void main(String[] args) {

   
            // SYNTAX ERROR DEMO
            // int a = 0 // Error: no semicolon!
            // b = 8; // Error: b not declared!
    
            // LOGICAL ERROR DEMO
            // Write a program to print all prime numbers between 1 to 10
            System.out.println(2);
            for (int i=1; i<5; i++){
                System.out.println(2*i+1);
            }
    
            // RUNTIME ERROR
            int k;
            Scanner c = new Scanner(System.in);
            k = c.nextInt();
            System.out.println("Integer part of 1000 divided by k is "+ 1000/k);
    


//Try catch block example
            int a = 6000;
            int b = 0;
            // Without Try:
            // int c = a / b;
            //System.out.println("The result is " + c);

            // With Try:
            try {
                int cl = a / b;
                System.out.println("The result is " + cl);
            }
            catch(Exception e) {
                System.out.println("We failed to divide. Reason: ");
                System.out.println(e);
            }
            System.out.println("End of the program");




            int [] marks = new int[3];
            marks[0] = 7;
            marks[1] = 56;
            marks[2] = 6;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the array index");
            int ind = sc.nextInt();
    
            System.out.println("Enter the number you want to divide the value with");
            int number = sc.nextInt();
            try{
                System.out.println("The value at array index entered is: " + marks[ind]);
                System.out.println("The value of array-value/number is: " + marks[ind]/number);
            }
            catch (ArithmeticException e){
                System.out.println("ArithmeticException occured!");
                System.out.println(e);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException occured!");
                System.out.println(e);
            }
            catch (Exception e){
                System.out.println("Some other exception occured!");
                System.out.println(e);
            }



        //the exception class in java
        //The Exception class has the following important methods:
        //1) Strings toString() executed when sout (e) is ran
//toString() on an exception object typically returns a string representation of that exception. 
//This string often includes the name of the exception class and may include additional details 
        //2) Void printStackTrace() - prints Stack trace
//The printStackTrace() method is used to print the stack trace of an exception.
// A stack trace provides detailed information about the sequence of method calls that led to the exception being thrown.
        //3) String getMessage() - prints the exception message
//The getMessage() method is a method of the Throwable class. It retrieves a descriptive message about the exception.
        int ab;
        Scanner s = new Scanner(System.in);
        ab = s.nextInt();
        if (ab<9){
            try{
                // throw new MyException();
                throw new ArithmeticException("This is an exception");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }


     
    }
}