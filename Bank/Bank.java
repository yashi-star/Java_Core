//ACCESS MODIFIERS

package Bank;
//Private:accessed within the class
//Public: Classes, methods, or variables declared as public can be accessed from any other package or outside class.
//Protected: Members with protected access can be accessed within the same package and only in subclasses (inherited class)in different packages.
//Default (no modifier): When no access modifier is specified, members are accessible only within the same package.

//to access the private variable we have getters and setters
//we are not directly able to access private key so we use function 

class Account{
    private String  password;
    public String name;//public;
    int age;//default
    protected double rollno;//protected
    //getter
    public String getPassword(){
        // setPassword(randomPass);  for private setter function get function can access set password
        return this.password;
    }
    //setter
    public String setPassword(String pass){
        return this.password=pass;
    }

    //if we donot want anyone to set password again  so we will make it private here so that it cannot be accesed outside class
    // private String setPassword(String pass){
    //     return this.password=pass;
    // }
}



//Constructor in Inheritance
class Base{
    Base(){
        System.out.println("(i m parent constructor base 1)");
    }
    Base(int x){
        System.out.println("parent class constrcutor"+ x);
    }
}
class Derived extends Base{
    Derived(){
       // super(20);//if i have overloaded constructor in base  class and i want to run the cosntructor with argument then i will use super keyword otherwise by default it will run non args constructor
        System.out.println("(i m child constructor derived)");
    }
    Derived(int x,int y){
        super(x);
        System.out.println("i m child with overloaded constr"+y);
    }
}




class ChildofDerived extends Derived{
    ChildofDerived(){
        System.out.println("i am child 2 of derived class constructor");
    }
    ChildofDerived(int x,int y,int z){
        super (x,y);
        System.out.println("i am child 2 overloaded of derived class constructor"+z);
    }
}



public class  Bank{
    public static void main(String[] args){
        Account acc=new Account();
        acc.name="Arun";
        acc.setPassword("abcd");
        System.out.println(acc.getPassword());
    
        
        //Base b1=new Base();

        //Derived d=new Derived();//if we do not make derived class constructor and call a const so it willc automatically call parent class constructor
        //but i i make derived class constructor then also paresnt cass const + base class cosnt will be called respectively
        
        //Derived d=new Derived(5,5);

       // ChildofDerived cd=new ChildofDerived();
        ChildofDerived cd=new ChildofDerived(2,4,3);
    }
 }

 //java compiler look for main class to start execution so its always public so that easily accessible

 //the "super" keyword is used to access members (fields and methods) and constructors of a parent class (also known as a superclass). 
 //It is helpful when working with inheritance, as it allows a subclass to interact with the properties and behaviors of its superclass.
 //The super keyword can be used to call a method from the parent class when a subclass has overridden it. This is useful when you want to extend or
 // modify the functionality of the parent class's method while still retaining its original behavior


 // "this" keyword is used within an instance method or a constructor to refer to the current object.
 // It provides a way to access the current instance's properties, methods, or constructors, which can be helpful to avoid naming conflicts and to make the code clearer