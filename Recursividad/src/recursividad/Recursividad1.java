/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author blesasan
 */
public class Recursividad1 {

    public static void main(String[] args) {
        int sumatorio = 0;
        for (int i = 0; i < 6; i++) {
            sumatorio = sumatorio + i;
            System.out.println(sumatorio);
           
        }
         System.out.println(factorial(5));//en el metodo principal tienes que poner 
            //para que llame al segundo método y le das el valor (dentro de los parentesis
            //que va a tomar el valor a la hora de hacer el método).
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n + factorial(n - 1);
        
    }
}
