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
public class Grocery {
    int weight;
    String ProductName;
    double price;
    
public Grocery(){
    weight=4;
    ProductName="sugsr";
    price=6;
}
public void weightAdd(){
    weight+=5;
}
public void weightRemove(){
    weight-=3;
}
public void checkWeight(){
    System.out.println(weight);
}
    public static void main(String[] args) {
        Grocery g=new Grocery();
        System.out.println("The current Weight is");
        g.checkWeight();
        
        System.out.println("The added weight is");
        g.weightAdd();
        g.checkWeight();
        
        System.out.println("The decreased weight is");
        g.weightRemove();
        g.checkWeight();
    }
}
