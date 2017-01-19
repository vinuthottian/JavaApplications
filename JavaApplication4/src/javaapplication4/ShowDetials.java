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
public class ShowDetials {

      public static void main (String [] args) {
       Detials sobj = new Detials ();
       sobj.getdetail("peter", "parker", 23 , "science", 125);
       EmployeeDetails eobj = new EmployeeDetails ();
       eobj.getdetail("david", "henson",  34, 2000, "manager", "admin");
    }


}


