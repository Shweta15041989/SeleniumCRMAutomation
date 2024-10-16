package com.qa.javapract;

public class SwapString {

    public static void main(String[] args) {
        
        String s1 ="Hello";
        String s2 = "World!";
         s1 = s1+s2; //HelloWorld!
         s2 = s1.substring(0, s1.length()-s2.length());//0,10-6
         //System.out.println(s1);

        s1= s1.substring(s2.length());//6
        System.out.println(s1);

        System.out.println(s1 + s2);



    }
    
}
