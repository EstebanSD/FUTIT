package documents;

public class Invoice {
    
    private int id;
    private int cliente;
    private String nombreCliente;

    // CONSTRUCTOR
    public Invoice(int id, int cliente, String nombreCliente) {
        this.id = id;
        this.cliente = cliente;
        this.nombreCliente = nombreCliente;
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

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }    
    
    //Metodos Adicionales
    @Override
    public String toString (){
        return "Factura numero: "+ id + ", del cliente: "+ cliente +", a nombre de: "+ nombreCliente;
    }
}
