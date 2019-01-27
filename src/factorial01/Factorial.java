/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial01;

/**
 *
 * @author casa
 */
public class Factorial {
    
     public static void main(String[] args) {
        System.out.print(factorial(5));
    }
    
    
    public static double factorial (double numero) {
    
        if (numero == 0)
            return 1;
        else
        {
            double resultado=numero*factorial(numero-1);
            return resultado;
        }
    }
    
   
    
}
