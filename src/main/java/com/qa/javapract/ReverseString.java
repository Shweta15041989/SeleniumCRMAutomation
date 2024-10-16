package com.qa.javapract;

public class ReverseString {
    public static void main(String args[]){

        String s = "This is a String";
       String[] strarray= s.split(" ");
       
       for(int i=strarray.length-1; i>=0;i--){
        System.out.print(strarray[i] + " ");
       }
    }
    
}
