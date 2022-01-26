/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author blesasan
 */
public class recursividadseriegrometrica {
    public static double p(double n){
    //metodo recursivo que obtinee la serie geometrica de la N
    //la serie de p(n) se puede ver como p(N)=1/N*p(N-1) hasta que p(1)=1/1=1
    if (n==1) return 1;
    return 1/n*p(n-1);
    
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba un numero entero positivo: ");
         double numero=scan.nextDouble();
        System.out.println(p(numero));
        
    }
}
