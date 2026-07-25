/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statkey;

class Mob{
  String brand;
  int price;
  static String name;
  
  void show(){
      System.out.println(brand+" : "+price+" : "+name);
  }
  
}
public class StatKey {

    public static void main(String[] args) {
       Mob m =new Mob();
       m.brand="Appulu";
       m.price=12000;
       Mob.name="Hello"; //class should be used for accessing
       
       Mob m2=new Mob();
       m2.brand="Samson";
       m2.price=12000;
       m2.name="hi";
       
       m.show();
       m2.show();
    }
    
}
