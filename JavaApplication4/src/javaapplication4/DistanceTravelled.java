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
public class DistanceTravelled {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of u(inital velocity)");
int u=sc.nextInt();
System.out.println("Enter value of a(accleration)");
int a=sc.nextInt();
System.out.println("Enter value of t(time)");
int t=sc.nextInt();
float distance=u*t+((a*t*t)/2);
    System.out.println("The distance travelled is"+distance);
}
}

