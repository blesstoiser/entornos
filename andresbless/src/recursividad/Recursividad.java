/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author blesasan
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static int factorial(int n){
        if(n==0) return 1;//condición parada
        return n *factorial (n-1);//llamada recursiva
    }
    
    public static void main(String[] args) {
       factorial();
    }
    
}
