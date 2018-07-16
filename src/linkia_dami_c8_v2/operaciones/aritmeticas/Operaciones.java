/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_dami_c8_v2.operaciones.aritmeticas;

/**
 *
 * @author dmorenoar
 */
public class Operaciones {
    
    public static void muestraNumOperaciones(int num){
       
        System.out.println("El num de operaciones aritmeticas es: " + num);
    }
   
    /*Función que llama a otra funcion de la misma clase*/
    public static void ejem(){
        Operaciones.muestraNumOperaciones(0);
    }
    
}
