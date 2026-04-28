class Factorial {
    int n;

    void setVars(int x) {
        n = x;
    }

    void printSteps() {
        int i = n;
        while (i >= 1) {
            System.out.print(i);
            if (i > 1)  
              System.out.print("*");
            i--;
        }
    }

    int factorial() {
        int fact = 1, i = n;
        while (i >= 1) {
            fact = fact * i;
            i--;
        }
        return fact;
    }

    void display() {
        System.out.print(n + "!=");
        printSteps();
        System.out.print("=" + factorial());
        System.out.println();
    }
}

class mainFactWhile {
    public static void main(String[] args) {

        if (args.length == 0) {
                   return;
        }

       Integer.parseInt(args[0]);

        Factorial obj1 = new Factorial();
        obj1.setVars( Integer.parseInt(args[0]));
        obj1.display();

        Factorial obj2 = new Factorial();
        obj2.setVars( Integer.parseInt(args[1]));
        obj2.display();

        Factorial obj3 = new Factorial();
        obj3.setVars( Integer.parseInt(args[2]));
        obj3.display();

            }
}
