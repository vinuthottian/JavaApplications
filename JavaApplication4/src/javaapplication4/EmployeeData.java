/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import static jdk.nashorn.internal.objects.ArrayBufferView.buffer;

/**
 *
 * @author user
 */
public class EmployeeData {
  public int empID;
  public String empName;
  public String empDesg;
  public String empDept;

  public EmployeeData()  {

  empID = 2132;
  empName = "Ajay Shamra";
  empDesg = "Software Devloper";
  empDept = "IT";
 }
  public String toString() {
   StringBuilder buffer = new StringBuilder();
  buffer.append("The Employee Details are: \n");
  buffer.append("The Employee ID: "+ empID+ "\n");
  buffer.append("The Employee Name: "+ empName+"\n");
  buffer.append("The Employee Designation: "+ empDesg+"\n");
  buffer.append("The Employee Department: "+ empDept+"\n");
  return buffer.toString();
      }
 public static void main(String[] args) {
     EmployeeData oobj = new EmployeeData();
  System.out.println(oobj);
}
}