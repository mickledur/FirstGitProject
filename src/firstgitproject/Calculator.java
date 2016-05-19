/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstgitproject;

/**
 *
 * @author geekzone
 */
public class Calculator {
    
    public static void sum(int num1, int num2){
        
        int sum=num1+num2;
        System.out.println(num1+" + "+num2+" = "+sum);
    }
    
     public static void diff(int num1, int num2){
        
        int diif=num1-num2;
        System.out.println(num1+" - "+num2+" = "+diif);
    }
     public static void max(int num1, int num2){
        
 
        System.out.println("Max("+num1+","+num2+") = "+Math.max(num1, num2));
     }
     public static void min(int num1, int num2){
        
 
        System.out.println("Min("+num1+","+num2+") = "+Math.min(num1, num2));
    }
     public static void abs(int num1){
        
        int abs= Math.abs(num1);
        System.out.println("|"+num1+"| = "+abs);
    }
     
     
    
}
