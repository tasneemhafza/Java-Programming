package CollectionsFramework.Date;

import java.util.Date;

public class lec96_Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()); //total millisec till today from 1970
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365); //gives current year 1970+ that No.= current year
        //ex: 53--> 1970+53= 2023

        //Quick Quiz: is it save to store currentTimeMillis in long?
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
        //ans: yes it is!

        Date dt = new Date();
        System.out.println("Date: "+ dt);
        System.out.println("Time: "+ dt.getTime());
        //System.out.println("GetDate:"+dt.getDate());
        //System.out.println("Day: "+dt.getDay());  //0->Sunday, 1->Monday
        //System.out.println("Year: "+dt.getYear()); //1900+no.= year

    }
}
