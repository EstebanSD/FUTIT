package documents;

public class UrgentOrder extends Order {

    public UrgentOrder(){
        super();
    }

    public UrgentOrder(int id, int cliente, String producto){
        super(id, cliente, producto);
    }

    @Override
    public String toString(){
        return "Orden Urgente numero: "+ this.getId() + ", del cliente: "+ this.getCliente() +", del producto: "+ this.getProducto();
    }
}
