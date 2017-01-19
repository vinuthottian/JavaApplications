/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author user
 */
public class MemberVariableMethod {
   public static void main ( String args[] ) {
      System.out.println ( Number.x );
      Number.x=34; 
      Number num1 =new Number ();
      num1.y=3;
      System.out.println ( num1.x );
      System.out.println( num1.y );
      num1.x = 347; 
      System.out.println(Number.x);

      Number num2 = new Number ();
      num2.y=4;
      System.out.println ( num2.x );
      System.out.println( num2.y );
      num2.y=3479;

      System.out.println ( Number.x );
      System.out.println ( num1.x );
      System.out.println ( num2.x );
   }
} 

