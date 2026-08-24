import java.util.Scanner;

class Bank{
    private String name;
    private int accNo;
    private int balance;

    Bank(String name, int accNo, int balance){
        this.name=name;
        this.accNo=accNo;
    }

public void deposite(int amt){
    if(amt>0){   
    balance+=amt;
        System.out.println("Amount "+amt+" Deposited");
        System.out.println();
    }else{
        System.out.println("Enter a valid amount");
    }
}



public void withdraw(int amt){
        if (amt>balance){
               System.out.println("Insufficient Amount");
        }else{
        balance-=amt;
        System.out.println("Amount "+amt+" withdrawn");
        System.out.println();
        }
    }

public void checkBal(){
        System.out.println("Account Name is: "+name);
        System.out.println("Account Number is: "+accNo);
        System.out.println("Balance is: "+balance);
    }
}

class BankAcc{

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Bank b= new Bank("Dev",1233,500);
        b.deposite(200);
        b.checkBal();
     
    }
}

//clean code obj oriented