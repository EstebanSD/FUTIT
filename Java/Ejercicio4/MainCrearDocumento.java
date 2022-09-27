import java.util.Scanner;

import documents.Invoice;
import documents.Order;
import documents.UrgentOrder;
import documents.HumanResources.CV;
import documents.HumanResources.Contract;

public class MainCrearDocumento {
    
    public static Invoice crearFactura(){
        Invoice factura = new Invoice();
        int cliente;
        String nombre;

        System.out.println("Ingrese el numero de cliente");
        Scanner entrada = new Scanner(System.in);
        cliente = entrada.nextInt();
        
        System.out.println("Ahora ingrese el nombre de cliente");
        Scanner entrada2 = new Scanner(System.in);
        nombre = entrada2.nextLine();
        
        factura.setCliente(cliente);
        factura.setNombreCliente(nombre);
        
        entrada.close();
        entrada2.close();

        return factura;
    }

    public static Order crearOrden(){
        Order orden = new Order();
        int cliente;
        String producto;

        System.out.println("Ingrese el numero de cliente");
        Scanner entrada = new Scanner(System.in);
        cliente = entrada.nextInt();
        
        System.out.println("Ahora ingrese el producto");
        Scanner entrada2 = new Scanner(System.in);
        producto = entrada2.nextLine();
        
        orden.setCliente(cliente);
        orden.setProducto(producto);

        entrada.close();
        entrada2.close();

        return orden;
    }

    public static UrgentOrder crearOrdenUrgente(){
        UrgentOrder orden = new UrgentOrder();
        int cliente;
        String producto;

        System.out.println("Ingrese el numero de cliente");
        Scanner entrada = new Scanner(System.in);
        cliente = entrada.nextInt();
        
        System.out.println("Ahora ingrese el producto de la orden urgente");
        Scanner entrada2 = new Scanner(System.in);
        producto = entrada2.nextLine();
        
        orden.setCliente(cliente);
        orden.setProducto(producto);

        entrada.close();
        entrada2.close();

        return orden;
    }

    public static Contract crearContrato(){
        Contract contrato = new Contract();
        int comprador;
        int vendedor;

        System.out.println("Ingrese el numero identificativo del comprador");
        Scanner entrada = new Scanner(System.in);
        comprador = entrada.nextInt();
        
        System.out.println("Ahora ingrese el numero identificativo del vendedor");
        Scanner entrada2 = new Scanner(System.in);
        vendedor = entrada2.nextInt();
        
        contrato.setComprador(comprador);
        contrato.setVendedor(vendedor);

        entrada.close();
        entrada2.close();

        return contrato;
    }

    public static CV crearCV(){
        CV curriculum = new CV();
        String nombre;
        String apellido;
        String titulo;

        System.out.println("Ingrese el nombre");
        Scanner entrada = new Scanner(System.in);
        nombre = entrada.nextLine();
        
        System.out.println("Ahora ingrese el apellido");
        Scanner entrada2 = new Scanner(System.in);
        apellido = entrada2.nextLine();

        System.out.println("Por ultimo ingrese el titulo");
        Scanner entrada3 = new Scanner(System.in);
        titulo = entrada3.nextLine();

        curriculum.setNombre(nombre);
        curriculum.setApellido(apellido);
        curriculum.setTitulo(titulo);

        entrada.close();
        entrada2.close();
        entrada3.close();

        return curriculum;
    }

    public static void main ( String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Elija el tipo de documento que desea crear");
        System.out.println("1) Factura");
        System.out.println("2) Pedido");
        System.out.println("3) Pedido Urgente");
        System.out.println("4) Contrato");
        System.out.println("5) Curriculum Vitae \n");
        
        int tipoDeDocumento = entrada.nextInt();

        if(tipoDeDocumento == 1){
            System.out.println("La factura creada quedo de la siguiente manera: \n"+crearFactura());    
        }
        else{
            if(tipoDeDocumento == 2){
                System.out.println("La orden creada quedo de la siguiente manera: \n"+crearOrden());
            }
            else{
                if(tipoDeDocumento == 3){
                    System.out.println("La orden urgente quedo de la siguiente manera: \n"+crearOrdenUrgente());
                }
                else{
                    if(tipoDeDocumento == 4){
                        System.out.println("El contrato quedo de la siguiente manera: \n"+crearContrato());
                    }
                    else{
                        if(tipoDeDocumento == 5){
                            System.out.println("El curriculum vitae quedo de la siguiente manera: \n"+crearCV());
                        }
                        else{
                            System.out.println("Valor no valido");
                        }
                    }
                }
            }
        }
        entrada.close();
    }
}
