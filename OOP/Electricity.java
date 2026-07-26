/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.javaa;

import java.util.Scanner;

 
class ElectricityBill { 
    int consumerNo; 
    String name; 
    int units; 
    double bill; 
 
    ElectricityBill(int cno, String name, int units) { 
        consumerNo = cno; 
        this.name = name; 
        this.units = units; 
    } 
 
    void calculateBill() { 
 
        if (units <= 100) 
            bill = units * 1.5; 
 
        else if (units <= 200) 
            bill = 100 * 1.5 + (units - 100) * 2.5; 
 
        else 
            bill = 100 * 1.5 + 100 * 2.5 + (units - 200) * 4; 
    } 
 
    void display() { 
        System.out.println("\nConsumer No : " + consumerNo); 
        System.out.println("Name        : " + name); 
        System.out.println("Units       : " + units); 
        System.out.println("Bill Amount : " + bill); 
    } 
} 
 
public class Electricity { 
 
    public static void main(String args[]) { 
 
        Scanner sc = new Scanner(System.in); 
 
        System.out.println("Enter no of Consumers");
        int no=sc.nextInt();
        ElectricityBill e[]=new ElectricityBill[no];
        for(int i=0;i<e.length;i++)
        {    
            
            System.out.println("Enter the Number");
            int n =sc.nextInt();
            System.out.println("Enter Name");
                String name = sc.next(); 
            System.out.println("Enter Units COnsumed");
            int units =sc.nextInt() ; 
            
            e[i]= new ElectricityBill(n,name,units);
             e[i].calculateBill();
             e[i].display();
        }
    } 
} 
