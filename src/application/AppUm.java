package application;

//import java.sql.Date;
import java.util.Date;
import Entities.Order;
import Entities.OrderStatus;

public class AppUm {
    public static void main(String[] args) throws Exception {
        
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);

    }
}