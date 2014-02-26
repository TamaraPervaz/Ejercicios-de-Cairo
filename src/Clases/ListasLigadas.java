/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Tamara
 */
public class ListasLigadas {

    public static void main(String[] args) {
        //Definir el principio de la lista
        ListaLigada<String> lista = new ListaLigada<>();
       lista.MostrarLista();
        lista.InsertaFinal("1");
        lista.InsertaFinal("2");
        lista.InsertaFinal("4");
        lista.MostrarLista();
        lista.InvertirLista().MostrarLista();
        
        lista.insertaAntesDeX("3", "4");
         lista.MostrarLista();

        
    }
}
