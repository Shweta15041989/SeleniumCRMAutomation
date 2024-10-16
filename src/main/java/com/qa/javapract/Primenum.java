package com.qa.javapract;

public class Primenum {
    public static boolean primeNum(int num){

        if (num<=1){
            return false;
        } else {
            for(int i=2; i<num;i++)
            if(num%i==0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        
        int num = 15;
      if(primeNum(num)){
        System.out.println("Is a prime num");
      }else{
        System.out.println("Not a prime num");

      }

       

       

        
    }
    
}
