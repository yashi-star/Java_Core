package LEARNING_JAVA;
//Polymorphism is of 2 types function overloading(compile time) and function overriding (run time )
//In function overloading we create different function of same name but doing different task
//function overloading can have either different number of arguments or different data type args and complier will automatically uderstand and print the following fucntion related to input  else it will give error
//Method overloading in Java means defining multiple methods within the same class with the same name but different parameter lists
class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name+ " "+ age);
    }
}




//Inheritance-from 1 class we have to inherit properties to another class we use extends as a keyword
//resusability increases
//its of 4 types  in java single level ,multilevel,hierarchial and hybrid
//in c++ 5th type is multiple inheritance in java we have interfaces instead of it

//single level inheritance -there is 1 base class and 1 deriving class
class Shapes{
    String color;
    public void display(){
        System.out.println("parent class");
    }
}
class Triangle extends Shapes{
    public void display(){
        System.out.println("child class");
    }}



//multilevel we have more than 1 derived class class where C extends B and B extends A
class Shape{
    String color;
    public void printClass(){
        System.out.println("parent class A");
    }
}
class Tri extends Shape{
    public void printClass(){
        System.out.println("child class B");
    }
}
class EquTri extends Tri{
    public void printClass(){
        System.out.println("child class C");
    }
}


//Heirarchial inheritancle where we have 1 parents class and multiple subclass 
class A{
    String color;
    public void printA(){
        System.out.println("parent class A");
    }
}
class B extends A{
    public void printA(){
        System.out.println("child class B");
    }
}
class C extends A{
    public void printA(){
        System.out.println("child class C");
    }
}




//ENCAPSULATION
//data and function are combined in a single entity
//becoz of which data hiding concept comes up  using acess modifiers
//data hiding is a prs of protecting members of a class from unintended changes


//Abstraction
//Hiding the implementation details and showing only impor/useful parts to be used
//it is used using abstract keyword , using intrfaces
//Abstract class-must have abstract keyword ,it can have abstract and non absrtact methods,it has constructor and static method also 
//it can have final methods which force not to get inherit

abstract class Animal {//it cannot be used its just a concept so we made it abstrat  its object cannot be created
    abstract void walk();//this is abstract no need to define it to define
    public void eat(){
        System.out.println("eats");
    }
    Animal(){
        System.out.println("create animal cosntr");
    }
}
class Horse extends Animal {
    Horse(){
        System.out.println("create horse cosntr");
    }
    public void walk(){
        System.out.println("Horse class");
    }
}

class Chicken extends Animal{
    public void walk(){
    System.out.println("Chicken class");
}
}


//Interface -it uses pure abstraction where you have only useful information
//it does not have constructors
//there should be no non abstract function
//all feilds in interfaces are public ,final and static by default
//all methods are public and abstract by default
//a class ithat implements interface must implemnt all methods declared in interface
//interface support  functionality of multiple inheritance

interface Ani{
    public void wakes();
}

interface Herbivore{
    public void eating();
}
class Dog implements Ani,Herbivore{
    public void wakes(){
        System.out.println("wakes up here ");
    }
    public void eating(){
        System.out.println("eating up here ");
    }
}




//static keyword-it is special keyword which is accessibe for all for all object a property is  common so static 
//for static we do not need to make object we can diectly access using class name
//we can use static with property,method,block ,nested classes
//in static memory is allocated only once  but in obj memory is allocated again and again 

class Stud{
    static String school;
    String namec;

    public static void chgneschl(){
        school="newschool";
        System.out.println(school);
    }
}



public class OOPS{
    public static void main(String[] args){

        Student s1=new Student();
       s1.printInfo(3);
       s1.printInfo("yashi", 21);
       s1.printInfo("yashi");

       Shapes s2=new Shapes();
       s2.display();//Creating an instance of the superclass and calling its method
       s2.color="blue";
       Triangle s3=new Triangle();
       s3.display();//Creating an instance of the subclass and calling its overridden method:
       Shapes s4=new Triangle();
       s4.display();//Assigning a subclass instance to a superclass reference
    //    Triangle s5=new Shapes(); error as you cannot assign an instance of a superclass (Shapes) to a variable of a subclass type (Triangle). 
    //    s5.display();              This is because Shapes does not necessarily have the additional properties or methods that might exist in Triangle.
   

        Shape t1=new Shape();
        t1.printClass();
        Tri t2=new Tri();
        t2.printClass();
        EquTri t3=new EquTri();
        t3.printClass();
        Shape t4=new EquTri();
        t4.printClass();
        Tri t5=new EquTri();
        t5.printClass();


        A K1=new A();
        K1.printA();
        B K2=new B();
        K2.printA();
        C K3=new C();
        K3.printA();
        A K4=new C();
        K4.printA();


        Horse h=new Horse();//whenever u call derieved class constr first base class const is called then child class constr this is called constructor chaining
        h.walk();

        Dog d=new Dog();
        d.wakes();
        d.eating();


        Stud.school="Jvm";
        Stud nm=new Stud();
        nm.namec="ria";
        System.out.println(nm.school);
        Stud.chgneschl();
}
}

//PACKAGES
// use the package keyword as the first line of your Java file,To import all classes in a package, use *.
//import to bring in classes from Java’s built-in  and user defined packages.
//In Java, packages are used to group related classes and interfaces together. They help organize code, avoid naming conflicts, and control access to classes, especially in large projects
//TYPES OF PACAKGES-builtin and user-defined
//builtin- java.util,java.lang,java.swing,java.awt
//java.lang--string,system,math 
//java.util-arraylist,hashmap,scanner 
//java.io-file,inputstream,outputstream
//java.awt and java.swing for gui component
//when you import you use "." with package name and class name eg - Bank.Account

