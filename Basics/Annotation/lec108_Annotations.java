package Basics.Annotation;

@FunctionalInterface
interface myFunctionalInteface{
    void thisMethod();
//    void thisMethod2(); //only one method
}
class Phone{
    public void showTime() {
    System.out.println("Time is 7 PM");
}
}
class NewPhone extends Phone{
    @Override
    public void showTime(){
        System.out.println("Time is 8 PM");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}
public class lec108_Annotations{
    // @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();
        int sum = phone.sum(7, 9); 
        System.out.println("The sum is: " + sum);
    }
}