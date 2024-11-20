package LEARNING_JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void printjavafunction() {
        System.out.println("hello java this is function");}


    public static void main(String[] args) {
        System.out.println("Hello World");//it prints and give a line space
        System.out.print("Hello World");//it prints and doesnt give a line space

        String  name="Aman"; //we will have a memory location name having value Aman
        String neigh=" Ram";//we will have memory location neigh having value Ram
        int age=21;// we have age with value 21
        //string value exchanged with string  and int exchanged with int
        String friend=neigh;//friend will have value of neigh ie Ram


 //Java type -Primitive and Non Primitive
 //Primitive are -- its length is fixed         
 //byte - 1 byte memeory [-128 to 127]         
 //short-2                                     
 //int-4                                        
 //long-8
 //float-4
 //double-8
 //char-2
 //boolean-1

    byte a = 30;
    int phone = 1234567890;
    long p=12345667L;//we write L which says its long 
    float pi=3.14F;// we write F which says its float
    


    //Non-Primitive Type-it has its own methods and functions from which we can derieve different values, it has var length and we use new keyword
    //string-they are immutable if you want to change you have make new var 
    //Arrays
    //classes-all class names are given in uppercase by default


    String x="Aman";
    //it functions are-
    //length
    System.out.println(x.length());
    String n=new String("Aman");
    System.out.println(n.length());

    //concat
    String str= n +"and" + x;
    System.out.println(str);

    //charAt
    System.out.println(str.charAt(0));

    //replace
    String r ="Hi";
    String q=r.replace('i','y');
    System.out.println(r);
    System.out.println(q);

    //substring
    String name1 = "Yashi Pant and Who?";
    System.out.println(name1.substring(10,19));//last index will not get included
    

    //Array
    int[] marks=new int[3];
        marks[0]=87;
        marks[1]=50;
        marks[2]=79;
        System.out.println(marks);//it will not give arr it will give some garbage value
        System.out.println(marks[1]);//50
        
        //if you make any variable/arr and does not initialize it with null or 0 by deafault
        //like for int 0 for bool false
        boolean[] makes=new boolean[2];
        System.out.println(makes[1]);//false


    //properties in arrays 

    //length-in string length was a fun but in array it is its property so need of parenthesis
    System.out.println(marks.length);

    //sort
    Arrays.sort(marks);

    //if we already know what we have to store inside array so we do not use new keyword
   int[] mks ={12,34,5,34};

   //2d array
   int[][] finalmarks ={{34,22,54}, {23,76,3}};
   System.out.println(finalmarks[0][2]);


   //casting or conversion
   //implicit
   //explicit

   //Java allow int to store in java ie implicit
   double price=100.00;
   double finalPrice=price+20;
   System.out.println(finalPrice);
    
   //Java does not allow double to store in int so we use explicit
   int pp=100;
   int fp=pp+(int)18.18;
   System.out.println(fp);


   //Constants- ARE DEFINE BY UPPERCASE  
   int ag=40;
   ag=32;

   final float PI=3.14F;//we cannot change it later if we put final
   // PI=23.32;  THIS LINE WILL GIVE ERROR


//OPERATORS
//AIRTHMATIC- +,-,*,/,%(gives remainder)
//ASSIGNMENT =  
//Unary ++ --
//LOGICAL || && !
//COMPARISON  >= == <= !=

    //Math Class
    System.out.println(Math.max(5,6));
    System.out.println(Math.min(5,6));
    //random return a fn from range 0.0 to 1.0 print in formm of long
    System.out.println(Math.random());
    //if we want random number in int we will typcast it
    System.out.println((int)(Math.random()*100));



    //How to take input
    Scanner sc = new Scanner(System.in);
    System.out.println("Input age");
    int g=sc.nextInt();
    System.out.println(g);
    float k=sc.nextFloat();
    System.out.println(k);
    Scanner c = new Scanner(System.in);
    String o =c.next();//it take only 1 word or token
    System.out.println(o);
    String ok =c.nextLine();//it take string
    System.out.println(ok);



    //Conditional statements
    boolean isup=false;
    if(isup==true){
        System.out.println("day");
    }
    else {
        System.out.println("night");
    }


    //switch statement
    int day=1;
    switch(day){
        case 1: System.out.println("mon");
                break;
        case 2: System.out.println("tues");
                break;
        case 3: System.out.println("wed");
                break;
        default: System.out.println("sunday");
    }



    //LOOPS=for,while,do while
    for (int i = 0; i < 10; i++) {
        System.out.println("hi");
    }

    int i=0;
    while(10>i){
        System.out.println(i);
        i++;
    }

    int j=10;
    do{
        System.out.println(j);
        j--;
    }while(j>0);




    //Continue and break
    //break-to get out of loop
    //continue- to skip this iteration and move forward with other iterations


    //exception handling  try-catch 
    //errors cant be handled or catched
    //but exception can be handled and catch
    int[] db ={2,3,54,21};
    try {
        System.out.println(marks[5]);
    } catch (Exception e) {
        System.out.println("exception handled");
    }
    System.out.println("after exception");


    //function/methods-in a class we have diff  method having some input /null  which perform some opration like a tv remote
    printjavafunction();
    printjavafunction();
    printjavafunction();


//string builder
//StringBuilder objects are mutable, meaning you can change the content of a StringBuilder object without creating new instances. 
//This makes StringBuilder more memory efficient for string manipulations.

    StringBuilder sb = new StringBuilder("Hello");

    //to append at last
    sb.append(" World"); // Modifies the same StringBuilder object without creating a new one
    System.out.println(sb.toString()); // Output: "Hello World"
    //char at index
    System.out.println(sb.charAt(1));
    //set char at index 
    sb.setCharAt(0, 'l');
    System.out.println(sb);
    //insert at pariticular index
    System.out.println(sb.insert(2,'S'));
    //delete string
    System.out.println(sb.delete(5,10));
    //length of string
    System.out.println(sb.length());



//java collection framework
//it is a collection of classes and interfaces
//we have iterface called interable  inside it we have collection inside we have list,queue and set
}
}


//A Wrapper Class in Java is a class that provides an object representation of primitive data types.
// These classes are part of the java.lang package and allow you to treat primitive types (like int, char, double, etc.) as objects.
//boxing(primitive to wrapper)
//int num = 10;
//Integer wrappedNum = Integer.valueOf(num); // Explicit boxing
//Integer autoWrappedNum = num; // Autoboxing
//unboxing (wrapper to primitive)
//Integer wrappedNum = 20;
//int num = wrappedNum.intValue(); // Explicit unboxing
//int autoNum = wrappedNum; // Auto-unboxing
