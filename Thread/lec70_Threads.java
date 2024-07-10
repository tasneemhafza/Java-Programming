package Thread;

class MyThread1 extends Thread{
    public void run() {
        int i=0;
        while(i<100) {
            System.out.println("Thread ONE is working!");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run() {
        int i=0;
        while(i<100) {
            System.out.println("Thread TWO is working...");
            i++;
        }
    }
}

class MyRunnableThread1 implements Runnable {
    public void run() { 
        int i=0;
        while(i<100) {
            System.out.println("I'm thread 1 of RunnableThread1");
            i++;
        }
    }
}
class MyRunnableThread2 implements Runnable {
    public void run() { 
        int i=0;
        while(i<100) {
            System.out.println("I'm thread 2 of RunnableThread2...");
            i++;
        }
    }
}

public class lec70_Threads {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
        System.out.println("Hello"); //will be printed first

// Runnable Interface
        MyRunnableThread1 bullet1 = new MyRunnableThread1();
        Thread gun1 = new Thread(bullet1);
        MyRunnableThread2 bullet2 = new MyRunnableThread2();
        Thread gun2 = new Thread(bullet2);
        //gun1.start();
        //gun2.start();
        

    }
}
