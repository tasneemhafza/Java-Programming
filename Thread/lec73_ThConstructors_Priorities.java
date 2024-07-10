package Thread;
class MyThread extends Thread{
    MyThread(String name) {
        super(name);
    }
    public void run() {
        //Constructors:-
        // int i=13;
        // System.out.println("Thank You!");
        // while(i<100) {
        //     System.out.println("Hello World!");
        //     i++;
        // }

        //Priorities:-
        System.out.println("I'm thread : "+Thread.currentThread().getName());
        System.out.println("I'm thread :"+Thread.currentThread().getPriority()); //t1.getPriority() will return the priority of t1 thread 
    }
}
public class lec73_ThConstructors_Priorities {
    public static void main(String[] args) {
        MyThread one = new MyThread("BTS");
        MyThread two = new MyThread("ARMY");
        //one.start();
        //two.start();
        //constructors:-
        System.out.println("The id of the thread t is "+ one.getId());
        System.out.println("The name of the thread t is "+ one.getName());
        System.out.println("The id of the thread t2 is "+ two.getId());
        System.out.println("The name of the thread t2 is "+two.getName());

        //Priorities:-
        MyThread three = new MyThread("Tasneem");
        MyThread four = new MyThread("Borahae");
        MyThread five = new MyThread("Apobangpo");

        one.setPriority(Thread.MAX_PRIORITY); //10
        two.setPriority(Thread.NORM_PRIORITY); //5
        three.setPriority(Thread.NORM_PRIORITY);
        four.setPriority(Thread.MIN_PRIORITY); //1
        five.setPriority(Thread.MIN_PRIORITY);
        one.start();
        two.start();
        three.start();
        four.start();
        five.start();

    }
}
