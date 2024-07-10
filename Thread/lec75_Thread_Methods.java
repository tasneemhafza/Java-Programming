package Thread;
import java.io.*;
import java.lang.Thread;


//join():-
class join1 extends Thread {
    public void run() {
        int i=0;
        while(i<100) {
        System.out.println("Hi, I'm thread 1.");
        i++;
        }
    }
}

class join2 extends Thread {
    public void run() {
        int i=0;
        while(i<100) {
        System.out.println("Hi, I'm thread 2...");
        i++;
        }
    }
} 

//interrupt():-
class Interrupting extends Thread {
public void run() {
//     try {
//         for(int i=0; i<=5; i++) {
//             System.out.println("Child Thread");
//             Thread.sleep(4000);
//         }
//     } catch (InterruptedException e) {
//         System.out.println("Child Thread interrupted.");
//     }
//     System.out.println("Thread is running");

//Another use:-
       for (int i = 1; i<=10; ++i) {
        System.out.println(i);
       }
}
}

public class lec75_Thread_Methods {
    public static void main(String[] args) throws InterruptedException {
    //sleep() : this method is used to put a thread to sleep for a specified time. while a thread is put to sleep, the thread scheduler pics and executes another thread in queue.
    //     try {
    //     for(int i=1; i<=5; i++) {
    //         Thread.sleep(2000); //main: get ready in 2 sec or im leaving
    //         System.out.println(i);
    //     }
    // } catch (Exception e) {
    //     System.out.println(e);    
    // }

    //join() : it allows one thread to wait until the execution of some other specified thread is completed.
    join1 t1 = new join1();
    join2 t2 = new join2();
    //t1.start();
    //t2.start();
    //t1.join();
    //t2.join(10000);

    //interrupt() : A thread in sleeping or waiting state can be interrupted by another thread using interrupt() 
    Interrupting i1 = new Interrupting();
    i1.start();
    i1.interrupt();
    System.out.println("Main Thread."); //first print line
    }
}
