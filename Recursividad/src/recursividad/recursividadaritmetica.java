/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

import java.util.Scanner;
import static recursividad.recursividadseriegrometrica.p;

/**
 *
 * @author blesasan
 */
public class recursividadaritmetica {

    public static double s(double n) {
        //metodo recursivo que calcula la serie aritmetica de un nuemro N;
//    s(1)=1/2=0,5;
//    s(N)=N/N+1+S(N-1)
        if (n == 1) {
            return 0.5;
        }
        return n / (n + 1) + (n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba un numero entero positivo: ");
         double numero=scan.nextDouble();
        System.out.println(s(numero));
    }
}
