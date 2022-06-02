/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void leerContenido(File ruta) throws FileNotFoundException {

        if (ruta.isDirectory()) {
            try (Scanner lector = new Scanner(ruta)) {
                while (lector.hasNextLine()) {
                    System.out.println(lector.nextLine());
                }
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        String r = "Examen_Ordinario_Programacion\\Bomberos\\2017.csv";
        File ruta = new File(r);
        leerContenido(ruta);
    }

}
