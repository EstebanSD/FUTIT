package documents.HumanResources;

public class Contract {
        
    private int id;
    private int comprador;
    private int vendedor;

    //CONTRUCTORES
    public Contract(){
    }

    public Contract(int id, int comprador, int vendedor) {
        this.id = id;
        this.comprador = comprador;
        this.vendedor = vendedor;
    }

    //GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getComprador() {
        return comprador;
    }

    public void setComprador(int comprador) {
        this.comprador = comprador;
    }

    public int getVendedor() {
        return vendedor;
    }

    public void setVendedor(int vendedor) {
        this.vendedor = vendedor;
    }

    
    
}
