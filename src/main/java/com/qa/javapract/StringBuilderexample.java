package com.qa.javapract;

import org.apache.commons.math3.analysis.integration.gauss.SymmetricGaussIntegrator;

public class StringBuilderexample {
    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder();
        str.append("Hello World");
        str.reverse();
        System.out.println(str.toString());
//         String firstString = "Hello";
// 		String secondString = "World";

// 		StringBuilder sb = new StringBuilder(firstString);
// 		sb.append(secondString);
//         System.out.println(sb.toString());
// String s1 = sb.toString().substring(0,firstString.length());
// String s2 = sb.toString().substring(sb.toString().length()-firstString.length());
// System.out.println(s2 + s1);
    }
    
}
