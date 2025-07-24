package main;

import java.util.Scanner;

public class TipikusHibak {

    private static final Scanner SC = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Tipikus hibák:");
        
        /* kivételnél megszaka a program futása */
        //osztas_0_egesz();// ArithmeticException
        
        /* Infinity-nél megy tovább a program */
        osztas_0_valos();// Infinity
        if(Double.isInfinite(1.0/0)){
            System.out.println("Infinity az eredmény");
        }
        
        /* Not a Number esetén is megy tovább a program */
        System.out.println(Math.sqrt(-1));//NaN
        if(Double.isNaN(Math.cbrt(Math.sqrt(-1)))){
            System.out.println("NaN köbgyöke az NaN");
        }
        
//        System.out.print("egész: ");
        /* InputMismatchException */        //SC.nextInt();
        
//        System.out.print("valós: ");
//        SC.nextDouble();//3.1 --> InputMismatchException
        
//        System.out.print("CSAK EGÉSZ számot tartalmazó szöveg: ");
//        String str = SC.nextLine();
//        /* NumberFormatException , megszakad a prg. futása */
//        Integer.parseInt(str);
        
        System.out.print("CSAK VALÓS számot tartalmazó szöveg: ");
        String str = SC.nextLine();
        /* NumberFormatException , megszakad a prg. futása */
        Double.parseDouble(str);//3,1 --> NumberFormatException
        
        System.out.println("program vége");
    }

    private static void osztas_0_valos() {
        /* Infinity: */
        System.out.println(1.0/0);
        
        double a = 1, b = 0;
        System.out.println(a/b);
    }

    private static void osztas_0_egesz() {
        /* ArithmeticException: / by zero */
        System.out.println(1/0);
        
        int a = 2, b = 0;
        /* ArithmeticException: / by zero */
        System.out.println(a/b);
    }
    
}
