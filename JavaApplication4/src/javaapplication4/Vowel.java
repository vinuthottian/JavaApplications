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
public class Vowel {
    public static void main(String args[])
    {
        char ch;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter an Alphabet : ");
        ch = scan.next().charAt(0);
		
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
        ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
        ch=='u' || ch=='U')
        {
            System.out.print("This is a Vowel");
        }
        else
        {
            System.out.print("This is Consonant");
        }
    }
}

