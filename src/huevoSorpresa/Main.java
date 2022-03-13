/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package huevoSorpresa;

/**
 * Clase Main del programa donde se define un objeto HuevoSorpresaSerranoSerranoMariaEugenia2122 con unos parámetros
 * y realiza acciones de aumentar el precio y de intentar sacar dos unidades
 * 
 * @author Maria Eugenia Serrano Serrano
 */
public class Main {

    /**
     * Método main
     * 
     * Este método es el principal de ejecución del programa
     * 
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HuevoSorpresaSerranoSerranoMariaEugenia2122 h_sorpresa;
       
        
        h_sorpresa=new HuevoSorpresaSerranoSerranoMariaEugenia2122(10,5,"peluche",10);
        opera_PrecioSerranoSerranoMariaEugenia2122(h_sorpresa);
        
        opera_UnidadesSerranoSerranoMariaEugenia2122(h_sorpresa);
        
    }

    /**
     * Método opera_UnidadesSerranoSerranoMariaEugenia2122
     * 
     * En este método se va a realizar la acción de intentar sacar 2 huevos sorpresa
     * 
     * Se hace con la idea de que, al no haber dinero suficiente, saltará la excepción y
     * no se modificará el número de unidades en tienda
     * 
     * @param h_sorpresa Parámetro que necesitamos usar
     * 
     */
    public static void opera_UnidadesSerranoSerranoMariaEugenia2122(HuevoSorpresaSerranoSerranoMariaEugenia2122 h_sorpresa) {
        /*Vamos a intentar sacar 2 huevos sorpresa, como no hay dinero suficiente saltará
        una excepción y no se modificará el nº de unidades de la tienda*/
        try {
            System.out.println("Vamos a sacar huevos sorpresa");
            h_sorpresa.sacarHuevosSorpresas(2, 4, "llavero");
            System.out.println("Operación realizada, ahora tiene "+h_sorpresa.obtenerUnidades()+" unidades en la tienda");
        } catch (Exception e) {
            System.out.println("Error al sacar huevos sorpresa, el nº de unidades sigue siendo: "+h_sorpresa.obtenerUnidades());
            
        }
    }

    /**
     *
     * @param h_sorpresa Parámetro que necesitamos usar
     * 
     */
    public static void opera_PrecioSerranoSerranoMariaEugenia2122(HuevoSorpresaSerranoSerranoMariaEugenia2122 h_sorpresa) {
        /*Vamos a aumentar el precio 3€, como no supera el precio máximo establecido la operación
        tendrá éxito y el nuevo precio será de 8€*/
        try {
            System.out.println("Vamos a aumentar el precio de venta de un huevo sorpresa");
            h_sorpresa.aumentarPrecio(3);
            System.out.println("El precio actual es "+h_sorpresa.obtenerPrecio()+" €");
        } catch (Exception e) {
            System.out.println("Error al aumentar el precio");
        }
    }
    
    
}
