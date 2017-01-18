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
public class Reservation {
 int ticketID;
 String name;
 String source;
 String destination;

 Reservation()   {
  ticketID = 80;
  name ="Harry";
  source = "Chicago";
  destination = "Dallas";
 }


public void showTicket ()  {
         System.out.println("The Ticket ID is "+ ticketID);
         System.out.println("The Passenger Name is "+ name);
         System.out.println("The Sourse is" + source);
         System.out.println("The Destination is" + destination);
        
}

public static void main(String[] args)  {
   Reservation g = new Reservation();
   g.showTicket();
      }
 }
    

