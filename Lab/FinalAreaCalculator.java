/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labJava;

import java.util.Scanner;

interface CircleShape {
    double areaCircle();
    double cirCircle();
}

interface Recta{
   double areaRect();
   double cirRect();
}

interface Trian{
  double areaTri();
  double cirTri();
}

interface Line{
    double calculate(byte m, byte x, byte z);
}


class  areaCalculator  implements CircleShape, Recta, Trian{

    byte r, l, b, a, bb, c,m,x,z;

    areaCalculator(byte r, byte l, byte b, byte a, byte bb, byte c, byte m, byte x, byte z) {
        this.r = r;
        this.l = l;
        this.b = b;
        this.a = a;
        this.bb = bb;
        this.c = c;
         this.m=m;
        this.x=x;
	this.z=z;
    }
 
   public double areaCircle(){
        return (22/7.0*r*r);
    }
      
   public double cirCircle(){
       return (2*22/7.0*r);
    }
    
   public double areaRect(){
        return l*b;
    }


    
  public  double cirRect(){
       return 2*(l+b);
    }
    
 

    
public    double areaTri(){
        int s=(a+bb+c)/2;
        return (Math.sqrt(s*(s-a)*(s-bb)*(s-c)));
    }
    
    
  public  double cirTri(){
       return a+bb+c;
    }

    
   public  void displayTri(){
        
    }

public double LineEquation(){
int y;
  return y=m*x+z;

}
  public   void display(){
        System.out.println("===Circle===");
        System.out.println("Area of a Circle is:"+areaCircle());
        System.out.println("Circumference of cirlce:"+cirCircle());
        System.out.println("\n");
        System.out.println("=====Triangle=====");
        System.out.println("Area of a Rectangle is:"+areaRect());
        System.out.println("Circumference of Rectangle:"+cirRect());
        System.out.println("\n");
        System.out.println("=====Triangle=====");
        System.out.println("Area of a Triangle is:"+areaTri());
        System.out.println("Circumference of Triangle:"+cirTri());
        System.out.println("\n");
        System.out.println("====Line Equation=====");
       System.out.println("Y Intercept is:"+LineEquation());
       System.out.println("\n");
    }
}


public class ShapeCalculator {
       public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the Radius of Circle");
            byte r=sc.nextByte();
            System.out.println("\n");
            System.out.println("Enter the Length of Rectangle");
            byte l=sc.nextByte();
            System.out.println("Enter the Breadth of Rectangle");
            byte b=sc.nextByte();
           System.out.println("\n");

            System.out.println("Enter the length of a for Triangle");
            byte a=sc.nextByte();

            System.out.println("Enter the length of b of Triangle");
            byte bb=sc.nextByte();

            System.out.println("Enter the length of c of Triangle");
            byte c=sc.nextByte();

            System.out.println("\n");
             System.out.println("Enter the Slope of Line(m)");
             byte m=sc.nextByte();
   
             System.out.println("Enter the horizontal coordinate of Line(x)");
             byte x=sc.nextByte();


             System.out.println("Enter  Y Intercept(c)");
             byte z=sc.nextByte();
             System.out.println("\n");


            
           areaCalculator shp = new areaCalculator(r,l,b,a,bb,c,m,x,z);
           shp.display();

    }

}


//run:
//Enter the Radius of Circle
//2
//
//
//Enter the Length of Rectangle
//2
//Enter the Breadth of Rectangle
//3
//
//
//Enter the length of a for Triangle
//3
//Enter the length of b of Triangle
//4
//Enter the length of c of Triangle
//5
//
//
//Enter the Slope of Line(m)
//4
//Enter the horizontal coordinate of Line(x)
//5
//Enter  Y Intercept(c)
//6
//
//
//===Circle===
//Area of a Circle is:12.571428571428571
//Circumference of cirlce:12.571428571428571
//
//
//=====Triangle=====
//Area of a Rectangle is:6.0
//Circumference of Rectangle:10.0
//
//
//=====Triangle=====
//Area of a Triangle is:6.0
//Circumference of Triangle:12.0
//
//
//====Line Equation=====
//Y Intercept is:26.0

