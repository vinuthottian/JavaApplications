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
public class PrimeNumbers {
     public static void main(String args[])
    {
        int  i, j, count=0;
        
        /* to print all the prime numbers between any range
         * enter the two number (starting and ending number)
		 */
        
        Scanner scan = new Scanner(System.in);
		

		
        System.out.print("Prime Numbers Between 1 and 20 is :\n");
        for(i=1; i<=20; i++)
        {
            count = 0;
            for(j=2; j<i; j++)
            {
                if(i%j == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
    

