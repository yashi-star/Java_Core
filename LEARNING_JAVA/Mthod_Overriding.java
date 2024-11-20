package LEARNING_JAVA;


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
    public void methd3(){
    System.out.println("Iam method 3 of class B");
    }
}


public class Mthod_Overriding{
 public static void main(String[] args) {
    // A a= new A();
    // A.methd2();
     B b= new B();
     b.methd2();
 }
}