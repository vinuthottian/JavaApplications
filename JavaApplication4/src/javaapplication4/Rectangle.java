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
public class Rectangle {
    

   double length;
   double breadth;

  public Rectangle ( double len , double brd) {
     length = len;
     breadth = brd;

   public boolean equals (Object obj) {
    Rectangle rec  = (Rectangle) obj;
   if (this. length == rec.length && this.breadth == rec.breadth) {
  
     return true;
     }
       else {
      return false;
    }
  }
      public static void main(String [] arg) {
       Rectangle obj1 = new Rectangle (10.5 , 23.6);
       Rectangle obj2 = new Rectangle (10.5 , 33.6);
}
}