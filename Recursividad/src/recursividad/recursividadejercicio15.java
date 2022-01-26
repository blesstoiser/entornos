/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

import java.util.Scanner;
import static recursividad.recursividadaritmetica.s;

/**
 *
 * @author blesasan
 */
public class recursividadejercicio15 {
    public static int potenciaiterativa( int b, int e){
    int potencia=0;//almacena los productos aprciales
    for (int i=1; i<= e; i++){
    potencia=potencia*b;
    }
    return potencia;
    }
    public static int PotenciaRecursiva (int b, int e){
     int potencia=0;
//2^3=2*2^2
            //--->2^2=2*2^1
                        //---->2^1=2*2^0=2
        if(e==0) return 1;
        for(int i=1; i<=e; i++){
        potencia=potencia*b;}
        return potencia;
          
    }
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println("Escriba un numero entero positivo: ");
         double numero=scan.nextDouble();
        //System.out.println(PotenciaRecursiva(numero)); 
        //System.out.println(potenciaiterativa(numero));
//habria que pedir dependiendo del metodo que queramos
    }
}
