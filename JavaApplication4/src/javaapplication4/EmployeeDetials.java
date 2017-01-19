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
public class EmployeeDetials extends Detials {
  
    double salary;
    String desg;
    String dept;
  
    public void getdetail(String name1, int age, double sal, String des, String dep) {
     super . getdetail (name1,age);
      salary = sal;
      desg = des;
      dept = dep;
      showdetail ();
  }

     public void showdetail () {
      System.out.println("\nthe employee details are : \n");
      System.out.println(" first name: " + super. firstname);
      System.out.println("age: " + super.age);
      System.out.println("{departmment: " + dept);
      System.out.println("designation: " + desg);
     System.out.println("salary: " + salary);
   }
 }
   