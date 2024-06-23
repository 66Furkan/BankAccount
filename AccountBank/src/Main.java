import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        AccountA myAccount1 = new AccountA("Furkan Köse",230);
        AccountA myAccount2 = new AccountA("Osman Köse",139);
        AccountA myAccount3 = new AccountA("Selim Köse",0.0);
        Scanner input = new Scanner(System.in);
        System.out.printf("%n%s balance $%.2f ",myAccount1.getName(),myAccount1.getBalance());
        System.out.printf("%n%s balance $%.2f ",myAccount2.getName(),myAccount2.getBalance());
        System.out.printf("%n%s balance $%.2f%n ",myAccount3.getName(),myAccount3.getBalance());

        System.out.println("Enter the depositamount for account1: ");

        double depositAmount = input.nextDouble();
        myAccount1.deposit(depositAmount);
        System.out.printf("%n%s adding account1 balance:%n",depositAmount);

        System.out.println("Enter the depositamount for account2: ");

        depositAmount = input.nextDouble();
        myAccount2.deposit(depositAmount);
        System.out.printf("%n%s adding account2 balance:%n",depositAmount);

        System.out.println("Enter the depositamount for account3: ");

        depositAmount=input.nextDouble();
        myAccount3.deposit(depositAmount);
        System.out.printf("%n%s adding account3 balance:%n",depositAmount);

        System.out.printf("%n%s balance $%.2f ",myAccount1.getName(),myAccount1.getBalance());
        System.out.printf("%n%s balance $%.2f ",myAccount2.getName(),myAccount2.getBalance());
        System.out.printf("%n%s balance $%.2f%n ",myAccount3.getName(),myAccount3.getBalance());


        System.out.println("Enter the incrementAmount for account1: ");

        double incrementAmount= input.nextDouble();
        myAccount1.increment(incrementAmount);
        System.out.printf("%n%s icnrement account1 balance:%n",incrementAmount);

        System.out.println("Enter the incrementAmount for account2: ");

        incrementAmount = input.nextDouble();
        myAccount2.increment(incrementAmount);
        System.out.printf("%n%s icnrement account2 balance:%n",incrementAmount);






    }
}