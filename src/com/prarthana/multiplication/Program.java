/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prarthana.multiplication;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        int x,y,total,i;
        Scanner input=new Scanner(System.in);
      
      while(true)
      {  
        System.out.println("Multiplication table for: ");
        x=input.nextInt();
        System.out.println("Enter count to yout table:");
        y=input.nextInt();
        
        for(i=1;i<=y;i++)
        {
         total=x*i;
            System.out.println(x +"*" +i +"=" +total);
        }
        System.out.println("Do you want to continue[Y/N]: ");
        String ch=input.next();
        if(ch.equalsIgnoreCase("n")){
            System.exit(0);
        }
      }
        
    }
        
        
    }
            
        
    
    
