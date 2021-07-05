package aula129.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aula129.entities.Employee;
import aula129.entities.OutsourcedEmployee;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ebter the humber of Employee: ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.println("Employee #"+ (i+1)+" Data: ");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per Hour: ");
            double valurPerHouse = sc.nextDouble();

            if(ch == 'y'){
                System.out.print("Additional Charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours, valurPerHouse, additionalCharge);
                list.add(emp);
                //Outra forma
                //list.add(new OutsourcedEmployee(name, hours, valurPerHouse, additionalCharge));

            }else{
                Employee emp = new Employee(name, hours, valurPerHouse);
                list.add(emp);
                //list.add(new Employee(name, hours, valurPerHouse));
            }
        }
        System.out.println();
        
        System.out.println("PAYMENTS: ");
        for(Employee emp: list){
            System.out.println(emp.getName() + " - $ "+ String.format("%.2f", emp.payment()));
        }
        sc.close();
    }
}
