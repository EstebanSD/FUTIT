package documents.HumanResources;

import documents.Document;

public class CV extends Document{
    
    private String nombre;
    private String apellido;
    private String titulo;

    //CONTRUCTORES
    public CV(){
    }

    public CV(int id, String nombre, String apellido, String titulo) {
        setId(id);
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
    }

    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    //Metodos Adicionales
    @Override
    public String toString (){
        return "CV de cliente: "+ nombre +" "+ apellido + ", titulo: "+ titulo;
    }
}
