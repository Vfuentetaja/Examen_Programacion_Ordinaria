/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);

    public static int DimeOpcion() {

        System.out.println("1.Mostrar articulos. " + "\n"
                + "2.Venta a cliente. " + "\n"
                + "3.Compra a proveedor." + "\n"
                + "4.Gestionar articulos. " + "\n"
                + "5.Salir");
        System.out.println("dime que quieres hacer: ");
        int opcion = entrada.nextInt();
        return opcion;

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Articulo> tienda = new ArrayList<>();

        Articulo a1 = new Articulo(0, "caja", 24, 15, 3);
        Articulo a2 = new Articulo(1, "sombrero", 9, 5, 13);
        Articulo a3 = new Articulo(2, "cinturon", 13, 9, 22);
        Articulo a4 = new Articulo(3, "pantalon", 45, 22, 15);

        tienda.add(a1);
        tienda.add(a2);
        tienda.add(a3);
        tienda.add(a4);

        a1.AñadirNuevoArtriculo(a1);
        a1.AñadirNuevoArtriculo(a2);
        a1.AñadirNuevoArtriculo(a3);
        a1.AñadirNuevoArtriculo(a4);

        do {
            switch (DimeOpcion()) {
                case 1:
                    a1.MostrarArticulos();
                    break;
                case 2:
                    a1.ventaClienteArticulo();
                    break;
                case 3:
                    a1.compraProveedorArticulo();
                    break;
                case 4:

                    System.out.println("dime que quieres hacer:" + "\n"
                            + "1.Añadir articulo" + "\n"
                            + "2.editar articulo" + "\n"
                            + "3.eliminar articulo" + "\n"
                            + "4.volver");
                    int opcion = entrada.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("dime su codigo: ");
                            int codigo = entrada.nextInt();
                            System.out.println("dime su nombre: ");
                            String nombre = entrada.next();
                            System.out.println("dime su precio de venta a cliente: ");
                            int precio_venta = entrada.nextInt();
                            System.out.println("dime su precio de compra de porveedor: ");
                            int precio_compra_proveedor = entrada.nextInt();
                            System.out.println("dime si esta en stock: ");
                            int stock = entrada.nextInt();
                            Articulo a5 = new Articulo(codigo, nombre, precio_venta, precio_compra_proveedor, stock);
                            tienda.add(a5);
                            System.out.println("articulo añadido");
                            a5.AñadirNuevoArtriculo(a5);
                            break;
                        case 2:

                            System.out.println("dime el ide del articulo al que quieres editar: ");
                            int x = entrada.nextInt();
                            
                            if (x == 0) {

                                System.out.println("que quieres cambiar? ");
                                String nom = entrada.next();

                                if (nom == "nombre"); {
                                    System.out.println("dime su nuevo nombre:");
                                    String nuevo_nombre = entrada.next();
                                    a1.setNombre(nuevo_nombre);
                                }
                                if (nom == "precio_venta_cliente"); {
                                    System.out.println("dime su nuevo precio_venta_cliente:");
                                    int nuevo_prec1 = entrada.nextInt();
                                    a1.setPrecio_venta_cliente(nuevo_prec1);
                                }
                                if (nom == "precio_compra_proveedor"); {
                                    System.out.println("dime su nuevo precio_compra_proveedor:");
                                    int nuevo_prec2 = entrada.nextInt();
                                    a1.setPrecio_compra_proveedor(nuevo_prec2);
                                }
                                if (nom == "stock"); {
                                    System.out.println("dime su nuevo stock:");
                                    int nuevo_stock = entrada.nextInt();
                                    a1.setStock(nuevo_stock);
                                }
                            }
                            if (x == 1) {

                                System.out.println("que quieres cambiar? ");
                                String nom = entrada.next();

                                if (nom == "nombre"); {
                                    System.out.println("dime su nuevo nombre:");
                                    String nuevo_nombre = entrada.next();
                                    a2.setNombre(nuevo_nombre);
                                }
                                if (nom == "precio_venta_cliente"); {
                                    System.out.println("dime su nuevo precio_venta_cliente:");
                                    int nuevo_prec1 = entrada.nextInt();
                                    a2.setPrecio_venta_cliente(nuevo_prec1);
                                }
                                if (nom == "precio_compra_proveedor"); {
                                    System.out.println("dime su nuevo precio_compra_proveedor:");
                                    int nuevo_prec2 = entrada.nextInt();
                                    a2.setPrecio_compra_proveedor(nuevo_prec2);
                                }
                                if (nom == "stock"); {
                                    System.out.println("dime su stock:");
                                    int nuevo_stock = entrada.nextInt();
                                    a2.setStock(nuevo_stock);
                                }
                            }
                            if (x == 2) {

                                System.out.println("que quieres cambiar? ");
                                String nom = entrada.next();

                                if (nom == "nombre"); {
                                    System.out.println("dime su nuevo nombre:");
                                    String nuevo_nombre = entrada.next();
                                    a3.setNombre(nuevo_nombre);
                                }
                                if (nom == "precio_venta_cliente"); {
                                    System.out.println("dime su nuevo precio_venta_cliente:");
                                    int nuevo_prec1 = entrada.nextInt();
                                    a3.setPrecio_venta_cliente(nuevo_prec1);
                                }
                                if (nom == "precio_compra_proveedor"); {
                                    System.out.println("dime su nuevo stock:");
                                    int nuevo_prec2 = entrada.nextInt();
                                    a3.setPrecio_compra_proveedor(nuevo_prec2);
                                }
                                if (nom == "stock"); {
                                    System.out.println("dime su nuevo precio_compra_proveedor:");
                                    int nuevo_stock = entrada.nextInt();
                                    a3.setStock(nuevo_stock);
                                }
                            }
                            if (x == 3) {

                                System.out.println("que quieres cambiar? ");
                                String nom = entrada.next();

                                if (nom == "nombre"); {
                                    System.out.println("dime su nuevo nombre:");
                                    String nuevo_nombre = entrada.next();
                                    a4.setNombre(nuevo_nombre);
                                }
                                if (nom == "precio_venta_cliente"); {
                                    System.out.println("dime su nuevo precio_venta_cliente:");
                                    int nuevo_prec1 = entrada.nextInt();
                                    a4.setPrecio_venta_cliente(nuevo_prec1);
                                }
                                if (nom == "precio_compra_proveedor"); {
                                    System.out.println("dime su nuevo precio_compra_proveedor:");
                                    int nuevo_prec2 = entrada.nextInt();
                                    a4.setPrecio_compra_proveedor(nuevo_prec2);
                                }
                                if (nom == "stock"); {
                                    System.out.println("dime su nuevo stock:");
                                    int nuevo_stock = entrada.nextInt();
                                    a4.setStock(nuevo_stock);
                                }
                            }
                            break;

                        case 3:
                            System.out.println("que articulo quieres eliminar? ");
                            String articulo = entrada.nextLine();
                            tienda.remove(articulo);

                            break;
                        case 4:
                            DimeOpcion();
                    }

                    break;

            }
        } while (DimeOpcion() != 5);

    }
}
