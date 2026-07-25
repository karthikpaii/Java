//static methods in java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statkey;

class Mob{
  String brand;
  int price;
  static String name="Devara";
  
  void show(){
      System.out.println(brand+" : "+price+" : "+name);
  }
  
  public static void show1(Mob m2){ //static var cannot be accessible inside a static methods [we should pass obj refrence] 
      System.out.println(m2.brand+" : "+m2.price+" : "+name); //non static vars should refer to object
  }
  
}
public class StatKey {

    public static void main(String[] args) {
       Mob m =new Mob();
       m.brand="Appulu";
       m.price=12000;
        //class should be used for accessing
       
       Mob m2=new Mob();
       m2.brand="Samson";
       m2.price=12000;
     
       
       m.show();
       Mob.show1(m2);//object should be passed
    }
    
}
