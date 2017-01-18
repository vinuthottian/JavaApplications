/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Divisibility {
        public static void main(String[] args) 
        {
        int n,m;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number 1 :");
        n = s.nextInt();
        System.out.print("Enter any number 2 :");
        m = s.nextInt();

        if(n % m == 0)
        {
            System.out.println(n+" is divisible by"+m);
        }
        else
        {
            System.out.println(n+" is not divisible by 5");
        }
    }
}

    

