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
public class EmployeeDetails {
    public void Menu()  {
        System.out.println("--------------------MENU-------------------");
    Scanner sc =new Scanner(System.in);
        System.out.println("1.ENTER DATA"+"\n"+" 2.DISPLAY DATA"+"\n"+" 3.EXIT");
        System.out.println("\nChoose the option:  ");
        int option=sc.nextInt();
        
        switch (option)  {
                            case 1:
                                     enterData();
                                     break;
                            case 2:
                                     DisplayData();
                                     break;
                            case 3:
                                     exitMenu();
                                     break;
                            default:
                                     System.out.println("Incorrect menu option");
                                     Menu();
                                     break;
    } 
  }
  public void enterData() {
   System.out.println("enterData method is invoked");
  }

  public void DisplayData() {
   System.out.println("displayData method is invoked");
  }


  public void exitMenu() {
   System.out.println("exitMenu method is invoked");
   System.exit(0);
  }

  public static void main(String[] args)  {
   EmployeeDetails obj = new EmployeeDetails();
   obj.Menu();
     }
  }