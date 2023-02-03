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
 MUESTRE POR PANTALLA LOS RESULTADOS DE LAS CUATRO 
 * OPERACIONES BASICAS, DE DOS NUMEROS
 */
public class ejercicio_2 {
    public static Scanner TECLADO;
    public static void main(String[] args) {
        TECLADO = new Scanner(System.in);
        int numero1, numero2, suma, resta, multiplicacion;
        float division;
        numero1 = leer_numero("primer número");
        numero2 = leer_numero("segundo número");
        suma = hacer_suma(numero1, numero2);
        resta = hacer_resta(numero1, numero2);
        multiplicacion = hacer_multiplicacion(numero1,numero2);
        division = hacer_division(numero1, numero2);
        hacer_resultados(suma, resta, multiplicacion, division);
    }
    public static int leer_numero(String namenumero){
        int numero;
        System.out.println("tipee el " + namenumero + ": ");
        numero = TECLADO.nextInt();
        return numero;
    }
    public static int hacer_suma(int num1, int num2){
        int resultado;
        resultado = num1 + num2;
        return resultado;
    }
    public static int hacer_resta(int num1, int num2) {
        int resultado;
        resultado = num1 - num2;
        return resultado;
    }
    public static int hacer_multiplicacion(int num1, int num2){
        int resultado;
        resultado = num1*num2;
        return resultado;
    }
    public static float hacer_division(float num1, float num2){
        float dividir;
        dividir = (float) (num1/num2);
        return dividir;
    }
    public static void hacer_resultados(int num1, int num2, int num3, float num4){
        System.out.println("Resultados de las cuatro operaciones basicas: \n");
        System.out.println("Suma: " + num1);
        System.out.println("Resta: " + num2);         
        System.out.println("Multiplicación: " + num3);
        System.out.println("División: " + num4);         
    }
}
