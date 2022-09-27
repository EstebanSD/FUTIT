import documents.Invoice;
import documents.Order;

public class Main {

    public static void main ( String[] args) {
        
        Invoice factura1 = new Invoice(0, 123, "Martin");
        Order orden1 = new Order(0, factura1.getCliente(), "Notebook");

        System.out.println(factura1);
        System.out.println(orden1);
    }
}
