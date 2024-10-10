/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package treinovetor;

import java.util.ArrayList;

/**
 *
 * @author ingri
 */
public class TreinoVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList lista = new ArrayList();
        int qtdeNome = 2;
        lista.add("");
        lista.add("a");
        lista.add("b");
        
        for(int c = 1; c <= qtdeNome; c++){
            System.out.println("Indice [" + c + "]" + " = " + lista.get(c));
        }
        
    }
    
}
