/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.python;


class Triangle {
    int a;
    void setVars(int limit)
    { a=limit;
    }
    
    void displayPattern(){
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
                
            }
            System.out.println("");
        }
    }
}

class TrianglePattern{
    public static void main(String[] args)
    {
        Triangle tri1= new Triangle();
        Triangle tri2= new Triangle();
        Triangle tri3= new Triangle();
        
        tri1.setVars(5);
        tri1.displayPattern();
        System.out.println("\n");
        
        
        tri2.setVars(5);
        tri2.displayPattern();
        System.out.println("\n");
        
        tri3.setVars(5);
        tri3.displayPattern();
        System.out.println("\n");
        
    }
}
