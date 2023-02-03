/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5_procedimientos_funciones;

import java.util.Scanner;

/**
 *
 * @author Emiliano
 */
/*
REALIZAR UNA FUNCION, A LA QUE SE LE PASE COMO PARAMETRO UN NUMERO "N", 
Y MUESTRE POR PANTALLA "N" VECES
*/

public class ejercicio_1 {
    public static Scanner s;
    public static void main(String[] args) {
        {s = new Scanner(System.in);
        int n ;
        n = parametro_n();
        leer_numero(n);
        
    }
}
public static int parametro_n() {
    int numero;
    System.out.println("escribe un número entero: ");
    numero = s.nextInt();
    return numero;
}
public static void leer_numero(int n) {
    int i;
    for (i=1; i<=n;i++) {
        System.out.println(i + " Veces: modulo ejecutandose");
    }
}
}