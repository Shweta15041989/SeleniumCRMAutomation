package com.qa.javapract;

public class Duplicatechar {
    
    public static void main (String args[]){
        String str = "tt";
        char[] a =str.toCharArray();
boolean dup=false;
        for (int i =0;i<(a.length);i++){
            //dup=false;
            for (int j=i+1; j<a.length;j++){
            if(a[i]==a[j]){
                dup=true;
            break;
        }}
        if(!dup){
             
            System.out.println("no duplicate");
        }
        else {
             
            System.out.println("is duplicate");
        }
    }}
}
