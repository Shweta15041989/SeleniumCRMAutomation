package com.qa.javapract;

public class LeapYear {


    public static boolean leapYear(int year){
       
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
}
        
       
    
    public static void main(String args[]){
        int year = 1700;
if(leapYear(year)){
    System.out.println("is a leap year");
}else {
    System.out.println("is not a leap year");

}
        
    }
}
