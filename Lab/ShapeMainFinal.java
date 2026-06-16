/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Shape;
import java.util.Scanner;

//abstract math operation class
abstract class MathOperation {
    protected int n;
    public abstract void display();
}

//abstract shape class
abstract class Shape{
   abstract double area();
   abstract double circ();
   abstract void display();
}


//circle class
class Circle extends Shape{
  byte radius;
  Circle(byte radius){
   this.radius=radius;
  }
  double area(){
    return ((22/7.0)*radius*radius);
  }
  double circ(){
    return (2*(22/7.0)*radius);
  }
  void display(){
    System.out.println("Area Of Circle:"+area());
    System.out.println("Circumference Of Circle:"+circ()+"\n");
}
}

//Rectangle Class

class Rectangle extends Shape{
  byte l,b;
  Rectangle(byte l,byte b){
   this.l=l;
   this.b=b;
  }
  double area(){
    return l*b;
  }
  double circ(){
    return 2*(l+b);
  }
  void display(){
    System.out.println("Area Of Rectangle:"+area());
    System.out.println("Perimeter Of Rectangle:"+circ()+"\n");
}
}

//Triangle Class

class Triangle extends Shape{
  byte a,b,c;
  Triangle(byte a,byte b,byte c){
   this.a=a;
   this.b=b;
   this.c=c;
  }
  double area(){
    double s=(a+b+c)/2.0;
    return (Math.sqrt((s*(s-a)*(s-b)*(s-c))));
  }
  double circ(){
    return (a+b+c);
  }
  void display(){
    System.out.println("Area Of Triangle:"+area());
    System.out.println("Perimeter Of Triangle:"+circ()+"\n");
}
}

//PrimeNumber class

class PrimeNumber extends MathOperation{
  PrimeNumber(int n){
    this.n=n;
  }

  private boolean is_Prime(){
     if(n<=1)
       return false;
     if(n==2)
       return true;
     else if(n%2==0)
       return false;
     else{
       for(int i=3;i<=Math.sqrt(n);i+=2){ 
         if(n%i==0)
           return false;
       }
     }
     return true;
   
  }

  public void display(){
   if(is_Prime())
      System.out.println(n+" is a Prime Number");
   else
      System.out.println(n+" is not a Prime Number");
  }

}

//Fibonacci 

class Fibb extends MathOperation{
   Fibb(int n){
    this.n=n;
   }
   
   private int fibRec(int n){
     if(n==0)
       return 0;
     else if(n==1)
       return 1;
     else
       return (fibRec(n-1)+fibRec(n-2));
    }
    
  private int[] fibNormal(int a,int b){
    int c=a+b;
    return new int[]{b,c};
  }

  private void displaywithlimit(){
    System.out.println("First "+n+" Fibonnaci Numbers without Recursion:");
    int a=0;
    int b=1;
    for(byte i=0;i<n;i++){
      System.out.print(a+"\t");
      int[] res=fibNormal(a,b);
      a=res[0];
      b=res[1];
    }
  }

  private void displaywithspot(){
    System.out.println("Fibonnaci Numbers till "+n+" with Recursion:");
    for(byte i=0;i<=n;i++){
      if(fibRec(i)<=n)
        System.out.print(fibRec(i)+"\t");
    }
  }

  public void display(){
   displaywithlimit();
   System.out.println("\n");
   displaywithspot();
   System.out.println("\n");
  }
}

class ShapeMainzFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Fibonacci Series");
            System.out.println("5. Prime Number Check");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter the Radius: ");
                    int r = sc.nextInt();
                    Circle c1 = new Circle((byte) r);
                    c1.display();
                    break;

                case 2:
                    System.out.print("Enter the Length and Breadth: ");
                    int l = sc.nextInt();
                    int b = sc.nextInt();
                    Rectangle r2 = new Rectangle((byte) l, (byte) b);
                    r2.display();
                    break;

                case 3:
                    System.out.print("Enter the 3 sides: ");
                    int a = sc.nextInt();
                    int b3 = sc.nextInt();
                    int c3 = sc.nextInt();
                    Triangle t = new Triangle((byte) a, (byte) b3, (byte) c3);
                    t.display();
                    break;

                case 4:
                    System.out.print("Enter the Number to print Fibonacci series: ");
                    byte n = sc.nextByte();
                    Fibb fib = new Fibb(n);
                    fib.display();
                    break;

                case 5:
                    System.out.print("Enter the Number to check if Prime: ");
                    int n1 = sc.nextInt();
                    PrimeNumber pm = new PrimeNumber(n1);
                    pm.display();
                    break;

                case 6:
                    System.out.println("Exiting..!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

    }
}
