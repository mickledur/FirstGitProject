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
     public static void prod(int num1, int num2){
        
        int prod=num1*num2;
        System.out.println(num1+" x "+num2+" = "+prod);
    }
     public static void div(int num1, int num2){
        
        int div=num1/num2;
        System.out.println(num1+" / "+num2+" = "+div);
     }
     public static void abs(int num1){
        
        int abs= Math.abs(num1);
        System.out.println("|"+num1+"| = "+abs);
    }
    
}
