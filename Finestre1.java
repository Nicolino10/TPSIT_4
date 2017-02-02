/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finestre1;

import java.util.Scanner;

/**
 *
 * @author studente
 */
public class Finestre1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int risp, x, posizione = 0;
        Finestra f;
        System.out.println("Quante finestre vuoi visualizzare?");
        risp = input.nextInt();
        while ((risp < 1) || (risp > 10)) {
            System.out.println("Il valore inserito è errato, reinserisci un valore da 1 a 10:");
            risp = input.nextInt();
        }
        for (x = 0; x < risp; x++) {
            f = new Finestra();
            f.setVisible(true);
            f.testo.setText("Sono la finestra " + (x + 1) + "!");
            f.setTitle("Finestra " + (x + 1));
            f.setLocation(posizione, posizione);
            posizione = posizione + 50;
        }
    }

}
