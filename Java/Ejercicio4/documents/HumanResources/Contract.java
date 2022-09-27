package documents.HumanResources;

import documents.Document;

public class Contract extends Document{
        
    private int comprador;
    private int vendedor;

    //CONTRUCTORES
    public Contract(){
    }

    public Contract(int id, int comprador, int vendedor) {
        setId(id);
        this.comprador = comprador;
        this.vendedor = vendedor;
    }

    //GETTERS AND SETTERS
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

    //Metodos Adicionales
    @Override
    public String toString (){
        return "Contrato numero: "+ this.getId() + ", del comprador: "+ comprador +", y vendedor: "+ vendedor;
    }
}
