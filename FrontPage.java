import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.*;
public class FrontPage {


    public static void main(String[] args){


        Simulator s = new Simulator();
        s.Starting();


    }
}


class Simulator {


    public void Starting() {

        DecimalFormat df = new DecimalFormat("0.00");
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Please enter your name");
        String Name = sc.nextLine();

        AccountDetail A = new AccountDetail();
        int Value = r.nextInt(1000);


        A.getAccountName(Name);

        double Balance = r.nextDouble() + 500 + Value;
        A.getBalance(Balance);
      //  System.out.println(df.format(A.setBalance()));


        int AccountNumber = r.nextInt(10000000);
        A.getAccountNumber(AccountNumber);
        //System.out.println(A.setAccountNunmber());


        System.out.println("Name: " + A.setAccountName()  + "\nAccount Number: " + A.setAccountNunmber() + "\nBalance: " + (df.format(A.setBalance())));


        System.out.println("Please choose and Action \n 1. Withdraw \n 2. Deposit \n 3. Work \n 4. Crime" );
        int option = sc.nextInt();
        switch(option){

            case 1: {

                System.out.println(" Please enter how much you would like to withdaw");
                double Withdraw = sc.nextDouble();


                if(A.setBalance() < Withdraw){

                    System.out.println("ERROR: FUNDS NOT FOUND");


                }
                else{

                    System.out.println( "Current Balance: ");
                    System.out.print(df.format(A.setBalance() - Withdraw));

                    break;
                }

            }

            case 2: {
                System.out.println("Please enter how much you would like to deposit ");

                double Depsoit = sc.nextDouble();


                if(Depsoit < 0){

                    System.out.println("Please enter a positive value");

                }
                System.out.println("Current Balance: ");
                System.out.print(df.format(A.setBalance()+Depsoit));

                break;
            }

            case 3: {

                int hours  = r.nextInt(50) ;
                double pay = r.nextDouble() + Value;

                System.out.println(A.setAccountName() + "Thank you for Working a Total of \n" + "Hours: " + hours +  "\nYou Earned " + df.format(pay));
                   double newBalance = pay + A.setBalance();
                System.out.println("The money has been deposited in your bank acocunt \n" + df.format(newBalance) );


                break;

            }

            case 4:
            {
                int Crime = r.nextInt(50) ;


                if(Crime %2 ==0 ){

                    int RandomAmount = r.nextInt(500);

                    double newBalance = RandomAmount + A.setBalance();

                    System.out.println("Congradulations " + A.setAccountName() + " You got away with a crime.... you earned " + df.format(RandomAmount) );
                    System.out.println("New Balance: "  +  df.format(newBalance));

                }

                else{

                    int downBad = r.nextInt(5000);
                    double newBalance = A.setBalance() - downBad;

                    System.out.println( A.setAccountName() + "!!!!"+ " You were caught and charged a fine of " + df.format(downBad));
                    System.out.println("New Balance " + df.format(newBalance));


                }

            break;

            }

        }
    }

    }

class AccountDetail {


    private String AccountName;
    private int AccountNumber;
    private double Balance;


    public void getAccountName(String AccountName) {


        this.AccountName = AccountName;

    }

    public String setAccountName() {


        return AccountName;
    }


    public void getAccountNumber(int AccountNumber) {

        this.AccountNumber = AccountNumber;
    }

    public int setAccountNunmber() {


        return AccountNumber;
    }

    public void getBalance(double Balance) {
        this.Balance = Balance;
    }

    public double setBalance() {

        return Balance;

    }

}




