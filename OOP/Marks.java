/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.javaa;

class topStu{
   int regno;
   String name;
   int  marks[];
   
   topStu(int regno, String name, int marks[]){
       this.regno=regno;
       this.name=name;
       this.marks=marks;
   }
   
   void avgStu(){
       int sum=0;
       for(int i=0;i<marks.length;i++){
           sum+=marks[i];
       }
       
       
       
   }
   
   
}
public class Marks {
    public static void main(String[] args){
        int regno[]={11,13,14,14};
        String name[]={"dev","krishna","radha"};
        int mark[][]={{100,25,44},{122,22,23},{34,45,67}};
        
        topStu stu[]= new topStu[4];
        
        for(int i=0;i<stu.length;i++){
            stu[i]=new topStu(regno[i],name[i],mark[i]);
        }
        
    }
}
