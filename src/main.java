
import Helpers.Deportista;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author dhern
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Deportista deportista = new Deportista(); //Instanciar la clase Doctor 
        
        
        System.out.println(deportista.ObternerInformacionPersona());
        deportista.imprimirgeneral();
        deportista.imprimirDeportista();
        //Esperando solucionar 
        
        
    }
    
}