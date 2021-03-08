/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victico
 */
public class Cuentax {
 
    public static void main(String[] args) {
         
        Cuenta cuenta_1 = new Cuenta("HolaMundo");
        Cuenta cuenta_2 = new Cuenta("HelloWorld", 300);

        cuenta_1.ingresar(300);
        cuenta_2.ingresar(400);
         
        cuenta_1.retirar(500);
        cuenta_2.retirar(100);
        System.out.println(cuenta_1); 
        System.out.println(cuenta_2);
         
    }
     
}