/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ludo;

/**
 *
 * @author Usuario
 */
public class ListaCircular {
     Nodo inicio;
     Nodo ultimo;
     int tamanio;
    public void Lista(){
        inicio = null;
        ultimo = null;
        tamanio = 0;//tamaÃ±o del archivo de texto//
    }
     public boolean esVacia(){ //pa ver si es vacia//
        return inicio == null;
    }
     public void crearunnodo(int valor){
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega al valor al nodo.
        nuevo.setValor(valor);
        // Consulta si la lista esta vacia.
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            inicio = nuevo;
            // De igual forma el ultimo nodo sera el nuevo.
            ultimo = nuevo;  
            // Y el puntero del ultimo debe apuntar al primero.
            ultimo.setSiguiente(inicio);
        // Caso contrario va agregando los nodos al inicio de la lista.
        } else{
            // Une el nuevo nodo con la lista existente.
            nuevo.setSiguiente(inicio);
            // Renombra al nuevo nodo como el inicio de la lista.
            inicio = nuevo;
            // El puntero del ultimo debe apuntar al primero.
            ultimo.setSiguiente(inicio);
        }
        // Incrementa el contador de tamaño de la lista.
        tamanio++;
    }
     public void agregrar52nodos(){
         for(int i=1;i<53;i++){
        crearunnodo(i);
        }
     }
     public void agregar6nodos(){
         for(int i=1;i<7;i++){
             crearunnodo(i);
         }
     }
     
     public void listar(){
        // Verifica si la lista contiene elementoa.
        if (!esVacia()) {
            // Crea una copia de la lista.
            Nodo aux = inicio;
            // Posicion de los elementos de la lista.
            
            System.out.print("-> ");
            // Recorre la lista hasta llegar nuevamente al incio de la lista.
            do{
                // Imprime en pantalla el valor del nodo.
                System.out.print( ".[ " + aux.getValor() + " ]" + " ->  ");
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                
            }while(aux != inicio);
        }
    }

}
