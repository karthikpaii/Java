/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.javaa;

class Over{
  int empid;
  String name; 
  double salary;
  
  Over(){
      empid=101;
      name="dev";

  }
  
  Over(int empid){
      this.empid=empid;
      name="raj";
  }
  
  Over(int empid, String name,double salary){
      this.empid=empid;
      this.name=name;
      this.salary=salary;
  }
  
  void calSalary(double basic){
      salary=basic;
  }
  
    void calSalary(double basic, double allownce){
      salary=basic+allownce;
  }
    
    void calSalary(double basic, double allownce, double bonus){
      salary=basic+allownce+bonus;
  }
    
    void display(){
        System.out.println("Name is:"+name);
        System.out.println("Employee id is:"+empid);
        System.out.println("salary is"+salary);
    
    }
    
  
  
}
public class Consover {
    public static void main(String[] args) {
        Over v= new Over();
        v.calSalary(2000);
        v.display();
        
        Over v1= new Over(12);
        v1.calSalary(23000, 12000);
        v1.display();
        
        Over v2= new Over(12,"Ramya",12900);
        v2.calSalary(23000, 12000,200);
        v2.display();
    }
}
