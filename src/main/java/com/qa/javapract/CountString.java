package com.qa.javapract;

public class CountString {
    
    public static void main (String args[]){

        String s = "This is a String";
         char[] a =s.toCharArray();
int count = 0;
         for(int i = 0; i<=(a.length-1);i++){
           if(!(a[i]==' ')){
count++;
           } 
            }
System.out.println(count);
            }


    }