package application.aula99;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import application.aula99.Entities.Department;
import application.aula99.Entities.HourContract;
import application.aula99.Entities.Worker;
import application.aula99.Entities.enums.WorkerLevel;

public class appDois {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        //Criar simples Date Format, para ler a Data do contrato
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter Department's Name: ");
        String departmentName = sc.nextLine();

        System.out.println("Enter Worker Data: ");
        System.out.print("name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.println("How Many contracts to this Worker? ");
        int n = sc.nextInt();

        //Para ler os Dados das QTD de contratos
        for(int i = 0; i < n; i++){
            System.out.println("Enter Contract Numer #" + (i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Valur per Hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (Hours): ");
            int hours = sc.nextInt();

            //Instanciar contratos
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
            
        }


        System.out.println();
        //Ler a data 
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        //Rercortar String converter em inteiro e separando por Mês e ano
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: "+ worker.getName());
        System.out.println("Deparment: "+ worker.getDepartment().getName());
        System.out.println("Income for "+ monthAndYear +": "+ String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
