/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ludo;

/**
 *
 * @author Usuario
 */
public class jugadores {
    String color;
    int posicioninicial;
    int posicionactual;
    Dado dado;
    int metablanca;
    ListaCircular listasecundaria;
    public jugadores(String colo,int inicial, int finb){
        color=colo;
        posicioninicial=inicial;
        metablanca=finb;
        listasecundaria.agregar6nodos();
    }
}
