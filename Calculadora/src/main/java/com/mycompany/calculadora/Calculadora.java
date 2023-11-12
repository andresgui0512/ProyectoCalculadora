/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Calculadora {
    
    public double suma(double operador1, double operador2){
    return operador1 + operador2;
    }
    
    public double resta(double operador1, double operador2){
    return operador1 - operador2;
    }
        
    public double multiplicacion(double operador1, double operador2){
    return operador1 * operador2;
    }
        
    public double division(double operador1, double operador2){
    return operador1 / operador2;
    }
            
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");       
        double numero1 = scanner.nextDouble();
        
        
        System.out.println("Ingrese el segundo número:");
        double numero2 = scanner.nextDouble();
        
        
        System.out.println("Que operación desea realizar:");
        System.out.println("1 Suma");
        System.out.println("2 Resta");
        System.out.println("3 Multiplicación");
        System.out.println("4 División");
        int operacion = scanner.nextInt();
        
        Calculadora calculadora = new Calculadora();
        double sumar = calculadora.suma(numero1, numero2);
        double restar = calculadora.resta(numero1, numero2);
        double multiplicar = calculadora.multiplicacion(numero1, numero2);
        double dividir = calculadora.division(numero1, numero2);
        
        switch(operacion){
            case 1:
                System.out.println("El resulatdo es: " + sumar);
               break;
            case 2:
                System.out.println("El resulatdo es: " + restar);
                break;
            case 3:
                System.out.println("El resulatdo es: " + multiplicar);
                break;
            case 4:
                System.out.println("El resulatdo es: " + dividir);
                break;
            default:
                System.out.println("Ingrese un número válido por favor");
                break;
        }
        scanner.close();
    }
}
