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
public class VolumeOfCylinder {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius r");
int r=sc.nextInt();
System.out.println("Enter the hight h )");
int h=sc.nextInt();
float volume=(float) (Math.PI*r*r*h);
System.out.println("Volume of cylinder is"+volume);
 }
    
}
