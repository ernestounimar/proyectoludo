/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ludo;



/**
 *
 * @author Usuario
 */
public class Ludo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaCircular lista= new ListaCircular();       
        lista.agregrar52nodos();
        System.out.println(lista.inicio.valor);
        
    }
    
}
