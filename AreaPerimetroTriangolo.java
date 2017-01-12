/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrotriangolo;

import java.util.Scanner;

/**
 *
 * @author studente
 */
public class AreaPerimetroTriangolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float l1, l2, l3, h, area, perimetro;
        do {
            System.out.println("\nInserisci lunghezza primo lato (base) [cm]:\n");
            l1 = input.nextFloat();
        } while (l1 <= 0);
        do {
            System.out.println("\nInserisci lunghezza secondo lato[cm]\n");
            l2 = input.nextFloat();
        } while (l2 <= 0);
        do {
            System.out.println("\nInserisci lunghezza terzo lato[cm]:\n");
            l3 = input.nextFloat();
        } while ((l3 <= 0) || (l3 >= (l1 + l2)));
        do {
            System.out.println("\nInserisci altezza[cm]:\n");
            h = input.nextFloat();
        } while (h <= 0);
        area = l1 * h;
        perimetro = l1 + l2 + l3;
        System.out.println("\nPerimetro triangolo: " + perimetro + "cm\n");
        System.out.println("\nArea triangolo: " + area + "cm\n");
        // TODO code application logic here
    }

}
