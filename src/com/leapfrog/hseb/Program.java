/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.hseb;
import com.leapfrog.hseb.Marksheet;
import java.util.Scanner;

/**
 *
 * @author Sagar
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input=new Scanner(System.in);
        Marksheet marksheet=new Marksheet(input);
        marksheet.setPassMark(32);
        while (true){
            marksheet.entry();
      if (marksheet.isFail()){
          System.out.println("Sorry!! You have failed");    
      }
      else{
          double total=marksheet.getTotal();
          double per=marksheet.getPercentage();
          String grade=marksheet.getGrade();
          System.out.println("Total is "+ total);
          System.out.println("Percentage is "+ per);
          System.out.println("Grade is "+ grade);
          
      }
      System.out.println("Do u want to continue[Y/N] ");
      if(input.next().equalsIgnoreCase("n")){
          System.exit(0);
      }
    }
    }
    
}
