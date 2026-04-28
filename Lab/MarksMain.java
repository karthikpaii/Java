/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.python;

//3. Write a Java program that calculates and displays grades based on student scores stored in an array.
//using Constructor, [2nd array]
class StudentA
{
    byte[] marks;
    String name;
    
    StudentA(byte[] marks, String name)
    {
        this.name=name;
        this.marks=marks;
    }
    
    int total()
    {
        int sum=0;
        for(int i=0;i<marks.length;i++)
        {
            sum+=marks[i];
        }
        return sum;
    }
   double avg()
   {
       int n=marks.length;
       return (total()/n);
   }
   
   char calGrade()
   {
       double a=avg();
       boolean pass=true;
       
       for(int i=0;i<marks.length;i++)
       {
           if(marks[i]<50)
               pass=false;
       }
       if(pass)
       {
            if (a >= 90)
                return 'O';
            else if (a >= 80)
                return 'A';
            else if (a >= 70)
                return 'B';
            else if (a >= 60)
                return 'C';
            else if (a >= 50)
                return 'D';
            else
                return 'F';   
    } else
       {
           return 'F';
       }
   }
    void display()
    {
        System.out.println("Name is: " + name);
        System.out.println("Marks are:");
        for (byte m:marks)
        {
            System.out.println(" "+m);
        }
        System.out.println("Total is: " + total());
        System.out.println("Average is: " + avg());
        System.out.println("Grade is: " + calGrade());
        System.out.println("\n");
       
    }
}

public class StudentMain {
    public static void main(String args[]) {
        
        String name[] = {"Murali","Chandra","Krish","Flying Jatt","Hanu Man"};
        byte marks[][] = {{34,23,67,87,100},
            {45,56,78,87,74},
            {77,67,89,90,77},
            {45,65,45,56,54},
            {45,76,56,78,67}};
        
       StudentA[] stud=new StudentA[5];
       for(int i=0;i<stud.length;i++)
       {
          stud[i] = new StudentA(marks[i], name[i]);
       }
       
       for(StudentA s:stud)
           s.display();
    }
}


//Version 2  using setvars,[one dimension array]
    
class Student
{
    byte score;
    String name;
    
    void setVars(byte m, String n)
    {
        score = m;
        name = n;
    }
    
    char calGrade()
    {
        if (score >= 90)
            return 'O';
        else if (score >= 80)
            return 'A';
        else if (score >= 70)
            return 'B';
        else if (score >= 60)
            return 'C';
        else if (score >= 50)
            return 'D';
        else
            return 'F';   
    }
    
    void display()
    {
        System.out.println("Name is: " + name);
        System.out.println("Grade is: " + calGrade());
       
    }
}

public class MarksMain {
    public static void main(String args[]) {
        
        String snames[] = {"DEV","RAM","KRISH","Mohan"};
        byte marks[] = {34,23,67,87};
        
        for(int i = 0; i < marks.length; i++)
        {
            Student obj = new Student();  
            obj.setVars(marks[i], snames[i]);
            obj.display();
        }
    }
}
