package LEARNING_JAVA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//The Throw Keyword:The throw keyword is used to throw an exception explicitly by the programmer
//Throws keyword : is used to declare an exception. This gives information to the programmer 
//that there might be an exception so it’s better to be prepared with a try-catch block!

class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative! toString";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative! getMessage";
    }
}



// Java finally block
// Finally block contains the code which is always executed whether the exception is handled or not.
// It is used to execute code containing instructions to release the system resources, close a connection etc.
public class Throw_Throws {

    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        return Math.PI * r * r;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        int result = a/b;
        return result;
    }

    //finally example
public static int greet(){
    try{
        int a = 50;
        int b = 10;
        int c = a/b;
        return c;
    }
    catch(Exception e){
        System.out.println(e);
    }
    finally {
        System.out.println("Cleaning up resources...This is the end of this function");
    }
    return -1;
}



    public static void main(String[] args) {
        try {
            //double ar = area(6);
            double ar = area(-1);
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println("Caught an Exception:");
            
            // Print getMessage()
            System.out.println("getMessage output: " + e.getMessage());
            
            // Print toString()
            System.out.println("toString output: " + e.toString());
            
            // Print stack trace
            System.out.println("printStackTrace output:");
            e.printStackTrace();
        }


//Finally

        int k = greet();
        System.out.println(k);
        int a = 7;
        int b = 9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally for value of b = " + b);
            }
            b--;}

        try{
            System.out.println(50/3);
        }
        finally {
            System.out.println("Yes this is finally");}
    }
    }



    // Java Collections Framework
    // A collection represents a group of object Java collections provide classes and Interfaces for us
    // to be able to write code interfaces quickly and efficiently  
    // We need collections for efficient storage and better manipulation of data in java
    // For ex: we use arrays to store integers but what if we want to
    // Resize this array? 
    // Insert an element in between? 
    // Delete an elements in Array?
    // Apply certain operations to change this array?

// Collections in java are available as class and interfaces Folling are few commonly used collections in java :
// ArrayList -> For variables size collections 
// Set -> For distinct collection
// Stack-> A LIFO data structure 
// HashMap -> For strong key - value pairs
// Collections class is available in java util package collection class also provides static methods for sorting , searching etc.


// //Date & Time in Java
// Before java 8, java util package used to hold the date time class now these classes are deprecated 
// Date in java is stored in the form of a long numer. This long number holds the number of miliseconds passed since 1 jan 1970
// Java assumes that 1900 is the start year which means it calculates years passed since 1900 whenever We ask it for years passed 
// System current Time Millis () returns no of sound passed Once no. of ms are calculated, we can calculate minutes, seconds & years passed 
// eg-System.currentTimeMillis()  (can be stroedin long data type)

//Date class in java is available in java.util package provides the instant in time with precision of millisecond.
//Date()/Date(long milliseconds): This constructor is used when we need an object of current date and time.
//Methods - getYear(),getDate(),getTima(),compareTo()




//The  calendar class in java provides the methods that helps in converting date between a specific instant in time.
// Since it is an abstract class, we can not create an instance of this class with the help of a constructor.
// We use the static method Calender.getInstance() in order to implement a sub-class.
// Example to demonstrate the getInstance() method :
// Calendar c = Calendar.getInstance();
//System.out.println(c.getCalendarType());  

//Calendar(): This constructor is used to construct a calendar with the default time zone & locale.
//Calender.YEAR,Calender.MONTH,Calender.MINUTES ETC





// File Handling in Java
// In Java, file handling is done with the help of the File class of the java.io package.
// Common file handling operations :
// Creating a new file.
// Writing in a file.
// Reading an existing file.
// Deleting a file.
// To perform any of the above operations , we need to create an object of the File class 
// import java.io.File;  // Importing the File class
// File obj = new File("filename.txt"); // Specify the name of the file



class cwh_111_file {
    public static void main(String[] args) {

        // Code to create a new file
        /*
        File myFile = new File("cwh111file.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }


        // Code to write to a file
        try {
            FileWriter fileWriter = new FileWriter("cwh111file.txt");
            fileWriter.write("This is our first file from this java course\nOkay now bye");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading a file
        File myFile = new File("cwh111file.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        */
        // Deleting a file
        File myFile = new File("cwh111file.txt");
        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }

    }
}
