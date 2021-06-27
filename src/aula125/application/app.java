package aula125.application;

import aula125.entities.Account;
import aula125.entities.BussinessAccount;
import aula125.entities.SavingsAccount;

public class app {
    public static void main(String[] args) {

        //Aula 125
       /* Account acc = new Account(1001, "AlexG Green", 0.0);

        BussinessAccount bussinessAccount = new BussinessAccount(1002, "Maria Brown", 0.0, 500.0);

        //UpCasting

        Account acc1 = bussinessAccount;

        Account acc2 = new BussinessAccount(1003, "Bob", 0.0, 200.0);

        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        //DownCasting

        BussinessAccount acc4 = (BussinessAccount) acc2;
        acc4.loan(100.00);

        //BussinessAccount acc5 = (BussinessAccount) acc3;

        if (acc3 instanceof BussinessAccount){
            BussinessAccount acc5 = (BussinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }
        

        //Pra testar se acc3 é instancia de SavingAccounts
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Updated!");
        }
*/
        //Aula 126

        Account acc1 = new Account(1001, "Alex", 1000.00);

        acc1.withdraw(200.00);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);

        acc2.withdraw(200.00);
        System.out.println(acc2.getBalance());

        Account acc3 = new BussinessAccount(1003, "Bob",1000.00, 500.0);

        acc3.withdraw(200.00);

        System.out.println(acc3.getBalance());
    }
}
