/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdafraccion;

import Negocio.Fraccion;

/**
 *
 * @author Estudiante
 */
public class TDAFraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fraccion A = new Fraccion();
        A.setNumerador(5);
        A.setDenominador(5);
        A.setSigno('+');
        Fraccion B = new Fraccion('-',4,8);
        System.out.println(A);
        System.out.println("");
        System.out.println(B);
        Fraccion C = new Fraccion();
        System.out.println("SUMA:");
        C.division(A, B);
        System.out.println("");
        System.out.println(C);
        /*System.out.println("");
        Fraccion D = new Fraccion();
        System.out.println("DIVISION:");
        D.division(A, B);
        System.out.println(D);*/
        
    }
    
}
