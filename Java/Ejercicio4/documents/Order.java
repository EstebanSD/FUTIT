package documents;

public class Order extends Document{

    private int cliente;
    private String producto;

    //CONSTRUCTORES
    public Order(){
    }

    public Order(int id, int cliente, String producto) {
        setId(id);
        this.cliente = cliente;
        this.producto = producto;
    }

    //GETTERS AND SETTERS
    public int getCliente() {
        return cliente;
    }


    public void setCliente(int cliente) {
        this.cliente = cliente;
    }


    public String getProducto() {
        return producto;
    }


    public void setProducto(String producto) {
        this.producto = producto;
    }

    //Metodos Adicionales
    @Override
    public String toString (){
        return "Orden numero: "+ this.getId() + ", del cliente: "+ cliente +", del producto: "+ producto;
    }  
}
