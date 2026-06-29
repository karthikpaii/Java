class ExceptionNew{
      int a,b;
      int[] arr;
      String str;
      String st;
      String value;

    ExceptionNew(int a,int b,int arr[], String str, String st, String value){
      this.a=a;
      this.b=b;
      this.arr=arr;
      this.str=str;
      this.st=st;
      this.value=value;

}

int add() {
        return (a + b);
    }

    int sub() {
        return (a - b);
    }

    int mul() {
        return (a * b);
    }

//exception in single

void  mainMethod() {
    try {
        
         System.out.println("Division:"+(a / b));
  
        System.out.println("Array Element is"+arr[2]);
 
       char ch = str.charAt(2); 

       System.out.println("Character at index 2: " + ch);
    
        int n=st.length();
        System.out.println("Length of Element is:"+n);

         int num= Integer.parseInt(value);
         System.out.println(num);
    } 

catch (ArithmeticException  e) {
        System.out.println("Division By Zero"+e);
          }
catch (ArrayIndexOutOfBoundsException e){
          System.out.println("Error:"+e);
                   }
catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
         }
catch(NullPointerException  e){
             System.out.println("Error: " + e); 
        }
catch (NumberFormatException e){
        System.out.println("Error:"+e);
}
catch (Exception e){
    System.out.println("Some Error are there"+e);
}

}
}

public class ExpFiveMain {
    public static void main(String[] args) {
        int arr[] = {12, 14, 15};
        String st=null;
        String val="Hello Dev";
        ExceptionNew obj1 = new ExceptionNew(6, 3, arr, "Hello", st, val);
        System.out.println("Addition is:"+obj1.add());
        System.out.println("Multiplication is:"+obj1.mul());
        System.out.println("Subtraction is:"+obj1.sub());
       obj1.mainMethod();
 }
}


//2nd method
class ExceptionHandling{
      int a,b;
      int[] arr;
      String str;
      String st;
      String value;

    ExceptionHandling(int a,int b,int arr[], String str, String st, String value){
      this.a=a;
      this.b=b;
      this.arr=arr;
      this.str=str;
      this.st=st;
      this.value=value;

}

int add() {
        return (a + b);
    }

    int sub() {
        return (a - b);
    }

    int mul() {
        return (a * b);
    }

//Division By Zero Exception


int DivByZero() {
    try {
        return a / b;
    } 
catch (ArithmeticException  e) {
        System.out.println("Division By Zero"+e);
        return -1;
    }
}

//Array Index Out Of Bound
int arrayOut(){
         try{
           return arr[3];
           }
      catch (ArrayIndexOutOfBoundsException e){
          System.out.println("Error:"+e);
           return -1;
          }
}

//String Index Out of Bound
void eleIndex() {
try {
          char ch = str.charAt(2); 
          System.out.println("Character at index 2: " + ch);
      } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
    }
}


//null pointer exp
void nullPoint(){
    try{
      int n=st.length();
      System.out.println("Length of Element is:"+n);
      } catch(NullPointerException  e){
             System.out.println("Error: " + e);
         
}
}

void NumberFor(){
     try{
         int num= Integer.parseInt(value);
         System.out.println(num);
     } catch (NumberFormatException e){
        System.out.println("Error:"+e);
}
}
}
public class DevideMain {
    public static void main(String[] args) {
        int arr[] = {12, 14, 15};
        String st=null;
        String val="Hello Dev";
   ExceptionHandling obj1 = new ExceptionHandling(3, 0, arr, "Hello", st, val);


        System.out.println("Add: " + obj1.add());
        System.out.println("Sub: " + obj1.sub());
        System.out.println("Mul: " + obj1.mul());
        System.out.println("Div: " + obj1.DivByZero());
        System.out.println("Array Element: " + obj1.arrayOut());
        obj1.eleIndex();
        obj1.nullPoint();
        obj1.NumberFor();
}
}






