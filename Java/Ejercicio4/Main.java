import documents.Invoice;
import documents.Order;
import documents.UrgentOrder;

public class Main {

    public static void main ( String[] args) {
        
        Invoice factura1 = new Invoice(0, 123, "Martin");
        Order orden1 = new Order(0, factura1.getCliente(), "Notebook");
        UrgentOrder ordenUrgente1 = new UrgentOrder(1,999,"Tinta");
        
        System.out.println(factura1);
        System.out.println(orden1);
         
        orden1 = ordenUrgente1;
        System.out.println(orden1);
        
    }
}
