/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author blesasan
 */
public class recursividadEuclides {
    public static int aMCD(int a, int b){
    int aux;
    while (b!=0){
    aux=b;
    b=a%b;
    a=aux;
    }
    return a;
    }
    public static void main(String[] args) {
        
    }
}
