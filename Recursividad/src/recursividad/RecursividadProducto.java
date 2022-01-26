/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author blesasan
 */
public class RecursividadProducto {

    public static void main(String[] args) {
        //el primer numero da el numero a multiplicar y el segundo es el numero de veces que se suma

    }

    public static int Producto(int n, int m) {

        if (m > 1) {//si el numero de veces que se tiene que multiplicar es mayor 1 repite el metodo
        return n + Producto (n,m-1);}//sumas el numero que se tiene que multiplicar al numero acumulado
        //(en este caso el metodo, cuyos valores ahora serán el mismo número pero el segundo numero sera menos porque es una repeticion menos) 
        else {
        return n;//
        }
    }
    

}

