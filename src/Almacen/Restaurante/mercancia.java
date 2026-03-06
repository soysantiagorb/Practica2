package Almacen.Restaurante;
import java.time.LocalDate;
import java.util.ArrayList;

public class mercancia {

    private String nombre;
    private int existencia;
    private LocalDate fechaUltimaEntregaAlmacen;
    private int puntoDeReorden;
    private ArrayList <proveedor> proveedores;
    private ArrayList <pedido> pedidos;

    public mercancia(String nombre, int existencia, LocalDate fechaUltimaEntregaAlmacen, int puntoDeReorden, ArrayList proveedores, ArrayList pedidos) {
        this.nombre = nombre;
        this.existencia = existencia;
        this.fechaUltimaEntregaAlmacen = fechaUltimaEntregaAlmacen;
        this.puntoDeReorden = puntoDeReorden;

        this.proveedores = new ArrayList();
        this.pedidos = new ArrayList();
    }

    public  String agregarProveedor(proveedor p) {
        proveedores.add(p);
        return "Proveedor agregado";

    }

    public LocalDate agregarPedido (pedido p) {
        pedidos.add(p);
        return p.getfechaPedido();
    }

    public int actualizarExistencias(int cantidad, LocalDate fechaLlegada){

        existencia = existencia + cantidad;
        fechaUltimaEntregaAlmacen = fechaLlegada;
        return existencia;
    }

    public boolean necestiaReorden(){

        return existencia <= puntoDeReorden;
    }


    @Override
    public String toString() {
        return "mercancia{" +
                "nombre='" + nombre + '\'' +
                ", existencia=" + existencia +
                ", fechaUltimaEntregaAlmacen=" + fechaUltimaEntregaAlmacen +
                ", puntoDeReorden=" + puntoDeReorden +
                ", proveedores=" + proveedores +
                ", pedidos=" + pedidos +
                '}';
    }
}

