//3. Write a Java program that calculates and displays grades based on student scores stored in an array.
    
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
