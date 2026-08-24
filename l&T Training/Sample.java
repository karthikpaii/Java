import java.util.Scanner;

class Pattern{
    int n;
    Pattern(int n){
        this.n=n;
    }
 
    void printPattern(){

        //method 1
        for(int i=0;i<n*n;i++){
            System.out.print("* ");
            if((i+1)%n==0)
                System.out.println("");

        }


    //method2
    //      for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             System.out.print("* ");
    //         }
    //          System.out.println();
    //     }
    }
}                                             


class Sample{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
        Pattern p= new Pattern(n);
        p.printPattern();
       
    }
}