/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

import static ejercicio_1.Tienda.entrada;
import java.util.ArrayList;

/**
 *
 * @author DAW
 */
public class Articulo {

    private int ide;
    private String nombre;
    private int precio_venta_cliente;
    private int precio_compra_proveedor;
    private final int iva = 21;
    private int stock;

    ArrayList<Articulo> Lista_articulos = new ArrayList<>();

    public Articulo(int ide, String nombre, int precio_venta_cliente, int precio_compra_proveedor, int stock) {
        this.ide = ide;
        this.nombre = nombre;
        this.precio_venta_cliente = precio_venta_cliente;
        this.precio_compra_proveedor = precio_compra_proveedor;
        this.stock = stock;
    }

    public void AñadirNuevoArtriculo(Articulo nuevo) {
        boolean creado = true;
        for (Articulo art_auxiliar : Lista_articulos) {
            if (art_auxiliar.getNombre().equalsIgnoreCase(nuevo.getNombre())) {
                creado = false;
            }
        }
        if (creado) {
            Lista_articulos.add(nuevo);
        }

    }
    
    

    public void MostrarArticulos() {

        for (Articulo art_auxiliar : Lista_articulos) {
            System.out.println("" + art_auxiliar.InfoArticulo());
        }

    }

    public ArrayList<Articulo> getLista_articulos() {
        return Lista_articulos;
    }

    public void setLista_articulos(ArrayList<Articulo> Lista_articulos) {
        this.Lista_articulos = Lista_articulos;
    }

    public void ventaClienteArticulo() {
        System.out.println("dime lo que quieres vender: ");
        int identificador = entrada.nextInt();

        System.out.println("" + Lista_articulos.get(identificador).getNombre());
        System.out.println("dime cuantos articulos quieres vender: ");
        int cantidad = entrada.nextInt();

        System.out.println("el precio es de: " + Lista_articulos.get(identificador).getPrecio_venta_cliente());
        System.out.println("hay en tienda: " + Lista_articulos.get(identificador).getStock());
        int precio_total = Lista_articulos.get(identificador).getPrecio_venta_cliente() * cantidad;

        System.out.println("el total del precio es de: " + precio_total);
        System.out.println("dime tu nombre: ");
        String nombre_cliente = entrada.next();

        System.out.println("quiere confirmar la compra sr " + nombre_cliente + "?");
        String respuesta = entrada.next();

    }

    public void compraProveedorArticulo() {
        System.out.println("dime lo que quieres comprar: ");
        int ide = entrada.nextInt();

        System.out.println("" + Lista_articulos.get(ide).getNombre());
        System.out.println("dime cuantos articulos quieres comprar: ");
        int cant = entrada.nextInt();

        System.out.println("el precio es de: " + Lista_articulos.get(ide).getPrecio_compra_proveedor());
        System.out.println("hay en tienda: " + Lista_articulos.get(ide).getStock());
        int prec_total = Lista_articulos.get(ide).getPrecio_compra_proveedor() * cant;

        System.out.println("el total del precio de compra es de: " + prec_total);
        System.out.println("dime tu nombre: ");
        String nom_cliente = entrada.next();

        System.out.println("quiere confirmar la compra sr " + nom_cliente + "?");
        String resp = entrada.next();
    }

    public int getIde() {
        return ide;
    }

    public void setIde(int ide) {
        this.ide = ide;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio_venta_cliente() {
        return precio_venta_cliente;
    }

    public void setPrecio_venta_cliente(int precio_venta_cliente) {
        this.precio_venta_cliente = precio_venta_cliente;
        
    }

    public int getPrecio_compra_proveedor() {
        return precio_compra_proveedor;
    }

    public void setPrecio_compra_proveedor(int precio_compra_proveedor) {
        this.precio_compra_proveedor = precio_compra_proveedor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String InfoArticulo() {
        return "su ide es: " + this.ide + " su nombre es: " + this.nombre + " sus precios son: " + this.precio_venta_cliente + " " + precio_compra_proveedor + " su iva es: " + this.iva + " su stock es de: " + this.stock;

    }
}
