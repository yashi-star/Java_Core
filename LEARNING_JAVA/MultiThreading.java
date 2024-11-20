package LEARNING_JAVA;

//A thread is a smaller, lightweight unit of a process, allowing multiple tasks to be performed simultaneously within the same program.
//Every Java program has at least one thread, known as the main thread, which is created automatically when the program starts.
//Threads share the same memory space and can interact with each other while running concurrently.

//Multithreading in Java refers to the capability of executing multiple threads concurrently, which can lead to faster execution and more responsive programs, especially in applications that perform many tasks simultaneously.
//Java’s multithreading is managed by the JVM (Java Virtual Machine) and is often used to improve performance or handle multiple tasks simultaneouly

//In Java, threads can be created in two main ways:
//By Extending the Thread Class:You can create a class that extends the Thread class and override its run() method, which defines the code that the thread will execute.
//By Implementing the Runnable Interface: which requires defining the run() method. This method is preferred when you want to inherit from another class, as Java doesn’t support multiple inheritance.


//Concurrency vs parallelism
//Concurrency is the ability of a system to handle multiple tasks or processes simultaneously, even if they are not necessarily executing at the exact same time.
//Parallelism is the simultaneous execution of multiple tasks or processes. In parallelism, tasks run literally at the same time, often on multiple cores or processors.

//Life Cycle of a Thread in Java
//New: The thread is created but not yet started by invoking start().
//Runnable: The thread is ready to run and is waiting for the CPU to become available and then run (before selected to be run by schedular).
//Running:After thread schedular has selected it
//Blocked: The thread is waiting for a resource to become available.
//Waiting: The thread waits for another thread to perform a particular action.
//Terminated: The thread has completed execution.
//JVM has ready queue where we have all the threads

//creating thread by extending thread class
class MyThread extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<10) { 
            System.out.println("My thread is running");
            System.out.println("I am happy");
            i++;
        }}}

    class MyThread2 extends Thread{
        @Override
        public void run(){
            int i=0;
            while (i<20) { 
                System.out.println("My thread2 is running");
                System.out.println("I am double happy");
                 i++;
            }} }


//Creating a thread using runnable interface
class MyRunnable1 implements Runnable{
    public void run(){
        System.out.println("I am runnable thread1");
    }}
class MyRunnable2 implements Runnable{
    public void run(){
        System.out.println("I am runnable thread2");
    }}


////Constructors of thread class
//Thread()
//Thread(String name)
//Thread(Runnable r)
//Thread(Runnable r,String name)
// Demonstrating Thread class constructor usage
class MyThreadWithConstructor extends Thread {
    public MyThreadWithConstructor(String name) {
        super(name);  // Initialize the thread with a name
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("I am thread1 of constructor: " + getName());
            i++;
        }
    }
}


//java thread priority
//Thread.MIN_PRIORITY=1
//Thread.NORM_PRIORITY=5
//Thread.MAX_PRIORITY=10
class MyThread1 extends Thread{
    public MyThread1(String name) {
        super(name);  // Initialize the thread with a name
    }
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Priority threads " + this.getName());
            i++;
        }
    }
}


public class MultiThreading{
    public static void main(String[] args){
        //here both the thread will run for particular time so we can see 2 task are getting executed simultaneously
        MyThread t1=new MyThread();
        MyThread2 t2=new MyThread2();
        t1.start();//start internally run run method which is inside thread
        t2.start();

        //here you cannot directly run start method 
//MyRunnable1 implements Runnable, which means it only defines what the thread will do by implementing the run() method. It does not provide the ability to start a new thread directly.
//Only an instance of the Thread class (or a subclass of Thread) can call the start() method to begin a new thread of execution.
//Runnable allows you to define what the thread will do (the task).
//Thread allows you to control the execution of the thread, including starting, pausing, and stopping.
        
        MyRunnable1 t3=new MyRunnable1();
        Thread s1=new Thread(t3);
        MyRunnable2 t4=new MyRunnable2();
        Thread s2=new Thread(t4);
        s1.start();
        s2.start();

        MyThreadWithConstructor t = new MyThreadWithConstructor("Harry");
        t.start();  // Start thread with a custom name
        System.out.println("here is the id "+ t.getId());
        System.out.println("here is the id "+t.getName());
    
    
        MyThread1  th1=new MyThread1("yashi1 min");
        MyThread1  th2=new MyThread1("yashi2");
        MyThread1  th3=new MyThread1("yashi3");
        MyThread1  th4=new MyThread1("yash4");
        MyThread1  th5=new MyThread1("yash5 most imp");
        th5.setPriority(Thread.MAX_PRIORITY);
        th1.setPriority(Thread.MIN_PRIORITY);
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();


//Methods in java
//The join() method in Java allows one thread to wait until the execution of some other specified thread is completed
//If t is a Thread object whose thread is currently executing, then t.join() causes the current thread to pause execution until t's thread terminates.
//Join() method puts the current thread on wait until the thread on which it is called is dead.
//public final void join(long millis)
        MyThread k1=new MyThread();
        MyThread k2=new MyThread();
        k1.start();
        try {
            k1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        k2.start();




//The sleep() method in Java is useful to put a thread to sleep for a specified amount of time.
//Sleep() method returns void.
        try {
            for (int i = 1; i <=5; i++) {
                Thread.sleep(2000);
                System.out.println(i);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }


       // A thread in a sleeping or waiting state can be interrupted by another thread with the help of the interrupt() method of the Thread class.
       // The interrupt() method throws InterruptedException.
       // The interrupt() method will not throw the InterruptedException if the thread is not in the sleeping/blocked state, but the interrupt flag will be changed to true.

    }
}

// start(): This method is essential for starting a thread. 
//Calling start() schedules the thread and initiates its execution through run().

// Direct run() Call: Calling run() directly (without start()) will execute run() in the current thread, 
//which won’t create a new thread or achieve concurrency.



