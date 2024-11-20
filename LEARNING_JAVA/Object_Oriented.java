package LEARNING_JAVA;

//class-blueprint of an object,diff properties of object,having some methods
//object-all the entities
//data like string, int etc  members-like its functions
//by convention we  write class keyword and class name with capital letter

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("write");
    }
    public void printColr(){
        System.out.println(this.color);//this is java keyword whoever will call thisfun its color will get printed this will tell which object called
 
    }}


//parameterized
class Student{
        String name;
        int age;

        public void printInfo(){
            System.out.println(this.name);
            System.out.println(this.age);
        }

//parameterized
Student(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println(" parameterized construtor called");
}
//copy
Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
        System.out.println("copy construtor called");
    }
//default
Student(){
    System.out.println("Default constructor called");
    }
    }


//Method overriding in Java is a feature that allows a subclass to provide a specific implementation of a method that is already defined in  superclass.
// This is essential for achieving runtime polymorphism,allowing objects to take on different forms depending on the class that calls them.
class A{
    public int a;

    public int harry(){
        return 4;
    }
    public void methd2(){
        System.out.println("Iam method 2 of class A");
    }
}

class B extends A{
    @Override
    public void methd2(){//overriden method 
        System.out.println("Iam method 2 of class B");
        }
    public void methd3(){
    System.out.println("Iam method 3 of class B");
    }
}



class Phone{
    public void greet(){
        System.out.println("morning");
    }
    public void name(){
        System.out.println("my name is yashi");
    }
}


class SmartPhone extends Phone{
    public void swagat(){
            System.out.println("apka swagat hai");
    }
    public void name(){
        System.out.println("my name is java in class two");
}
}

public class Object_Oriented{
    public static void main(String[]args){
        Pen obj1=new Pen();
        obj1.color="blue";
        obj1.type="ball pen";
        obj1.write();

        Pen obj2=new Pen();
        obj2.color="black";
        obj2.type="gel";
        obj1.printColr();
        obj2.printColr();

//when we write new in memory heap our oblect will get stored
//constructor -used to construct object ,get called when object is created
//constructor have same name  as class they have no return type for 1 obj only once a constructor is called
// constructor are of 3 type default,parameter,copy
//in c++ copy const can be made by user or by default but in java copy constr are user defined where ek obk ko copy krk dusre mai daal skate hai
//in c++ we have destructors but in java we have an automatic mechanism ie automatic garbage collector -var not in use gets deletd



         Student s1=new Student("arun",22);
         s1.printInfo();

        Student s2=new Student(s1);
        s2.printInfo(); 


        B b= new B();
        b.methd2();
        b.methd3();

//Dynamic method dispatch-Dynamic Method Dispatch is a concept in Java that allows a method to be called based on the actual object that a superclass reference variable is pointing to at runtime. 
//In simple words, it’s a way to decide which method to execute when there are multiple implementations of a method, and it happens during runtime.
//When you have a parent class (say, Animal) and a child class (say, Dog or Cat), you might want to call the sound() method, but each subclass (Dog and Cat) has its own version of sound().
// Using dynamic method dispatch, Java will decide at runtime whether to call sound() of Dog or Cat, depending on the object type.
//i have super class with  method 1 and method2 and subclass with method 2 (overridden) and method 3 
//if i do super obj=new sub()-its allowed obj.meth2()=is called of subclass but if we call obj.meth3()its not allowed 
        Phone ob=new Phone();
        ob.name();
        SmartPhone object1=new SmartPhone();
        object1.name();
        Phone object2=new SmartPhone();//method of smart phn will run this is called run ttime polymorphism
        object2.name();
        // SmartPhone object3=new Phone();//not allowed
        
    }}
   


//Method Overloading: Occurs when multiple methods in the same class have the same name but different parameters  It's a way to achieve compile-time polymorphism.
//Method Overriding: Occurs when a subclass  has a method with the same name, return type, and parameters as a method in its superclass to provide a specific implementation of a method already defined in the superclass and achieves runtime polymorphism.