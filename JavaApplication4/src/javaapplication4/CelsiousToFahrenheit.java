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
public class CelsiousToFahrenheit {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Temperature in degree celsious");
int c=sc.nextInt();
float f;
        f = (c*9)/5 + 32;
System.out.println("The tempature in Fahrenheit is " +f);
    }
    
}
