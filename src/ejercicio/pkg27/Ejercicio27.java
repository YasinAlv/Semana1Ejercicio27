/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg27;

import java.util.Scanner;

/**
 *
 * @author Ingenieria
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Teclado = new Scanner(System.in);
        int Num, contador=0;

        
        
        do {
            System.out.println("Digite un número: ");
            Num = Teclado.nextInt();
            contador++;
            System.out.println("Has introducido: "+contador+" numeros");
                
        } while (Num != -1);
        
        
    }
    
}
