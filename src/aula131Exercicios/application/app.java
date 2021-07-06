package aula131Exercicios.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import aula131Exercicios.entities.ImportedProduct;
import aula131Exercicios.entities.Product;
import aula131Exercicios.entities.UsedProduct;

public class app {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Product #"+ (i+1) +" Data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if(type == 'c'){
                list.add(new Product(name, price));
            }
            else if(type == 'u'){
                System.out.print("Manufacture Date: (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                list.add(new UsedProduct(name, price, date));
            }
            else{
                System.out.print("Customs Fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
        }


        System.out.println();
            System.out.println("PRICE TAGS: ");
            for(Product prod: list){
                System.out.println(prod.priceTag());
            }
    }
}
