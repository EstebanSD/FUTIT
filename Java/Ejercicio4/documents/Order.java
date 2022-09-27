package documents;

public class Order {
 
    private int id;
    private int cliente;
    private String producto;

    //CONSTRUCTOR
    public Order(int id, int cliente, String producto) {
        this.id = id;
        this.cliente = cliente;
        this.producto = producto;
    }

    //GETTERS AND SETTERS
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


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
        return "Orden numero: "+ id + ", del cliente: "+ cliente +", del producto: "+ producto;
    }  
}
