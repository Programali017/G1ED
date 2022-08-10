/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g1ed;

import java.util.Scanner;

/**
 *
 * @author alibu
 */
public class Vehiculos {

    static Scanner leer = new Scanner(System.in);
    static Scanner leerS = new Scanner(System.in);
    static int nMarcas;
    static String Marcas[] = new String[nMarcas];
    static int añoIni = 2018;
    static long añosPrecio[][] = new long[nMarcas][5];

    public static void main(String[] args) {

        //
        System.out.println(" REGISTRO VEHICULAR DE MARCAS Y PRECIOS");
        System.out.println("========================================");
        System.out.print("Cuantas marcas desea registrar: ");
        nMarcas = leer.nextInt();

        System.out.println("----------------------------------------");
        System.out.println("         NOMBRES DE LAS MARCAS");
        System.out.println("========================================");
        for (int i = 0; i < nMarcas; i++) {
            System.out.print("Digite la marca " + (i + 1) + ": ");
            Marcas[i] = leer.next();
        }

        System.out.println("----------------------------------------");
        System.out.println("      PRECIO EN LOS ULTIMOS 5 AÑOS");
        System.out.println("========================================");
        for (int i = 0; i < añosPrecio.length; i++) {
            System.out.println(" " + Marcas[i]);
            for (int j = 0; j < añosPrecio[0].length; j++) {
                System.out.print("Precio " + añoIni + ": ");
                añosPrecio[i][j] = leer.nextLong();
                while ((añosPrecio[i][j]) < 0) {
                    System.out.print("El precio para el año " + añoIni + " debe ser positivo: ");
                    añosPrecio[i][j] = leer.nextLong();
                }
                añoIni++;
            }
            System.out.println("");
        }

        listaVehiculos();

    }

    public static void listaVehiculos() {
        for (int i = 0; i < añosPrecio.length; i++) {
            System.out.print(" " + Marcas[i]);
            for (int j = 0; j < añosPrecio[0].length; j++) {
                System.out.print(" " + añosPrecio[i][j]);
            }
            System.out.println("");
        }
        
    }
}
