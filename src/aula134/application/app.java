package aula134.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aula134.entities.Company;
import aula134.entities.Individual;
import aula134.entities.TaxPayer;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of TaxPayers: ");
        int n = sc.nextInt();

        List<TaxPayer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.println("Taxpayer #" + (i+1) + ": ");
            System.out.print("Individual or Company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("name: ");
            String name = sc.next();
            System.out.print("Anual Income: ");
            Double anualIncome = sc.nextDouble();
            if(type == 'i'){
                System.out.print("Health Expenditures: ");
                double healthExpenditures = sc.nextDouble();
                Individual x = new Individual(name, anualIncome, healthExpenditures); //modo 1
                list.add(x);
            }else{
                System.out.print("Number of Employees: ");
                Integer numberOfEmployeers = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployeers)); //Modo 2
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");

        for(TaxPayer tp : list){
            //sum += tp.tax();
            System.out.println(tp.getName() + ": $" + String.format("%.2f", tp.tax()));
        }

        double sum = 0;
        for(TaxPayer tp :list){
            sum += tp.tax();
        }
        System.out.println("TOTAL TAXES: $ "+ String.format("%.2f", sum));

        sc.close();
    }
}
