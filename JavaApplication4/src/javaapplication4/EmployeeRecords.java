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
public class EmployeeRecords {

  String employeeDetails [] [] = new String [1] [7];
    public void storeData() {

   employeeDetails [0] [0] = "A101";
   employeeDetails [0] [1] = "john mathew";
   employeeDetails [0] [2] = "admin";
   employeeDetails [0] [3] = "manager";
   employeeDetails [0] [4] = "05/04/1998";
   employeeDetails [0] [5] = "11/09/1997";
   employeeDetails [0] [6] = "married";
 }
    public void displayData() {
    System.out.println ("Employee Details:");
    for ( int i = 0; i <7;i++){
        for (String employeeDetail : employeeDetails[i]) {
        System.out.println(employeeDetail);
        }
    }
 }




     public static void main (String [] args) {
      EmployeeRecords obj = new EmployeeRecords();
      obj.storeData();
     obj.displayData();
  }

}

    

