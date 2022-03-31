/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ludo;

/**
 *
 * @author Usuario
 */
public class Dado {
   int resultado;
   public Dado(){
        
   }
   public void lanzarDado(){
    resultado = (int)(Math.random()*6 + 1); //Primer dado
}
}
