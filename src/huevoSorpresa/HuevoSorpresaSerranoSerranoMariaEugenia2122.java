package huevoSorpresa;

/**
 * Clase que representa un huevo sorpresa
 * 
 * Los objetos de esta clase contienen atributos que permiten almacenar información
 * La clase también dispone de información general independiente de los objetos
 * concretos que se hayan creado
 * 
 * @author Maria Eugenia Serrano Serrano
 * @version 1.2
 */
public class HuevoSorpresaSerranoSerranoMariaEugenia2122 {

    /**
     * @return Devuelve el precio máximo
     */
    public double getPrecio_maxSerranoSerranoMariaEugenia2122() {
        return precio_maxSerranoSerranoMariaEugenia2122;
    }

    /**
     * @param precio_maxSerranoSerranoMariaEugenia2122 Establece el precio máximo
     */
    public void setPrecio_maxSerranoSerranoMariaEugenia2122(double precio_maxSerranoSerranoMariaEugenia2122) {
        this.precio_maxSerranoSerranoMariaEugenia2122 = precio_maxSerranoSerranoMariaEugenia2122;
    }

    /**
     * @return Devuelve el precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio Establece el precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    private int unidades;//número de huevos que quedan 
    private double precio;//precio actual de un huevo sorpresa
    private String sorpresa;//nombre de la sorpresa que incluye huevo sorpresa
    private double precio_maxSerranoSerranoMariaEugenia2122;//precio máximo que puede tener un huevo sorpresa
    
    /*Constructor por defecto*/

    /**
     * Constructor sin parámetros
     */

    public HuevoSorpresaSerranoSerranoMariaEugenia2122() {
    }


    /*Constructor por parámetros*/

    /**
     * Constructor con cuatro parámetros
     * 
     * @param unidades Número de huevos que quedan
     * @param precio Precio actual de un huevo sorpresa
     * @param sorpresa Nombre de la sorpresa que incluye huevo sorpresa
     * @param precio_max Precio máximo que puede tener un huevo sorpresa
     */

    public HuevoSorpresaSerranoSerranoMariaEugenia2122(int unidades, double precio, String sorpresa, double precio_max) {
        this.unidades = unidades;
        this.precio = precio;
        this.sorpresa = sorpresa;
        this.precio_maxSerranoSerranoMariaEugenia2122 = precio_max;
    }


    /*Método que devuelve el número de huevos sorpresa que tiene la tienda*/

    /**
     * Método obtenerUnidades
     * 
     * Método que devuelve el número de huevos sorpresa que tiene la tienda
     * 
     * @return Devuelve el número de huevos
     */

    public int obtenerUnidades() {
        return this.unidades;
    }

    /*Método que devuelve el precio que tiene cada huevo sorpresa*/

    /**
     * Método obtenerPrecio
     * 
     * Método que devuelve el precio que tiene cada huevo sorpresa
     * 
     * @return Devuelve el precio de cada huevo
     */

    public double obtenerPrecio() {
        return this.getPrecio();
    }


    /* Método que devuelve la sorpresa que tiene el huevo*/

    /**
     * Método obtenerSorpresa
     * 
     * Método que devuelve la sorpresa que tiene el huevo
     * 
     * @return Devuelve la sorpresa que contiene
     */

    public String obtenerSorpresa() {
        return sorpresa;
    }

    /* Método que permite modificar la sorpresa del huevo*/

    /**
     * Método modificarSorpresa
     * 
     * Método que permite modificar la sorpresa del huevo
     * 
     * @param sorpresa Modifica la sorpresa
     */

    public void modificarSorpresa(String sorpresa) {
        this.sorpresa = sorpresa;
    }


    /*Método que permite modificar el número de huevos sorpresa que tiene la tienda*/

    /**
     * Método modificarUnidades
     * 
     * Método que permite modificar el número de huevos sorpresa que tiene la tienda
     * 
     * @param unidades Modifica el número de unidades
     */

    public void modificarUnidades(int unidades) {
        this.unidades = unidades;
    }


    /*Método que permite sacar huevos sorpresa si se tiene suficiente dinero y hay 
suficientes unidades en la tienda*/

    /**
     * Método sacarHuevosSorpresas
     * 
     * Método que permite sacar huevos sorpresa si se tiene suficiente dinero y 
     * hay suficientes unidades en la tienda
     * 
     * @param unidades Unidades que hay
     * @param dinero Dinero del que se dispone
     * @param sorpresaSerranoSerranoMariaEugenia2122 Nombre de la sorpresa
     * @throws Exception si la cantidad de dinero es negativa, si no se dispone de suficiente
     * dinero, si las unidades son menor o igual que cero o si no hay suficientes huevos en la tienda
     */

    public void sacarHuevosSorpresas(int unidades, double dinero, String sorpresaSerranoSerranoMariaEugenia2122) throws Exception {
        if (dinero <= 0) {
            throw new Exception("Se necesita una cantidad de dinero positiva");
        }
        if (dinero < (unidades * getPrecio())) {
            throw new Exception("No tiene suficiente dinero");
        }
        if (unidades <= 0) {
            throw new Exception("Es necesario indicar una cantidad positiva de huevos sorpresa");
        }
        if (this.unidades <= unidades) {
            throw new Exception("No hay suficientes huevos sorpresa en la tienda");
        }
        this.modificarUnidades(this.obtenerUnidades() - unidades);
    }


    /*Método que permite aumentar el precio de venta de un huevo sorpresa, suma al precio actual 
    el aumento que se indica siempre que no se sobrepase el precio máximo de venta*/

    /**
     * Método aumentarPrecio
     * 
     * Método que permite aumentar el precio de venta de un huevo sorpresa, suma al precio actual 
     * el aumento que se indica siempre que no se sobrepase el precio máximo de venta
     * 
     * @param aumento Aumenta el precio
     * @throws Exception si el aumento es igual o menor que cero o si supera el precio máximo
     */

    public void aumentarPrecio(double aumento) throws Exception {
        if (aumento <= 0) {
            throw new Exception("El aumento debe ser positivo");
        }
        if (getPrecio_maxSerranoSerranoMariaEugenia2122() < getPrecio() + aumento) {
            throw new Exception("No se puede superar el precio máximo");
        }
        setPrecio(getPrecio() + aumento);
    }
}
