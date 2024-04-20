/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea4endes23;


public class Main {

    public static void main(String[] args) throws Exception {
        CCuenta miCuenta;
        double saldoActual;
        double saldoRetirado;
        

        miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        miCuenta.retirar(200.0);
        saldoRetirado = miCuenta.estado();
        System.out.println("El saldo despues de retirar es: "+ saldoRetirado);
        
    
    }
    
    public static void probarIngresar(CCuenta c, int cantidad) throws Exception{
        c.ingresar(cantidad);
        
    }
    
    public static void probarRetirar(CCuenta c, int cantidad) throws Exception{
        c.retirar(cantidad);
    }
}
