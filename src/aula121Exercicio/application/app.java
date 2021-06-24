package aula121Exercicio.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import application.aula99.Entities.OrderStatus;
import aula121Exercicio.entities.Client;
import aula121Exercicio.entities.Order;
import aula121Exercicio.entities.OrderItem;
import aula121Exercicio.entities.Product;

public class app {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Cliente Data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        Date birhtDate = sdf.parse(sc.nextLine());

        Client client = new Client(name, email, birhtDate);

        System.out.println("Enter order Data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());


        Order order = new Order(new Date(), status, client);

        System.out.print("How Many Itens to this Order? ");
        int n = sc.nextInt();



        for(int i = 0 ; i < n; i++){
            System.out.println("Enter #"+(i + 1)+" item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product Price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            //Instanciar produto, item de pedido associado ao produto, e depois inserir o item de pedido no pedido
            //Associar Produto e valor
            Product product = new Product(productName, productPrice);
            //Instancier item de pedido associado ao produto
            OrderItem it = new OrderItem(quantity, productPrice, product);
            order.addItem(it);
        }

        System.out.println();
        System.out.println(order);

       /* Product p = new Product("TV", 1000.0);

        OrderItem oi1 = new OrderItem(1, 1000.0, p);

        System.out.println(oi1);*/

        //Client client = new Client("Maria", "maria@gmail.com", sdf.parse("20/10/1995"));
        sc.close();
    }
}
