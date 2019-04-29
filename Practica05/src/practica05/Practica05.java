/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica05;

import java.util.Scanner;
import paqueteuno.Porcentajes;

/**
 *
 * @author nali1
 */
public class Practica05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
       // Variables
       double costo;
       double matriculaInicial = 1330;
       int edad;
       int origen;
       int estadoCivil;
       int cargaFamiliar;
       
        // Entrada y cálculo de los porcentajes
        System.out.println("¿Seleccione su origen? ");
        System.out.println("1. Loja");
        System.out.println("2. Zamora");
        System.out.println("3. Otro");
        origen = entrada.nextInt();
        
        
        if (origen ==1 || origen == 2){
            costo = (1330 - Porcentajes.porcentajeuno);
        
        }else {
            costo = matriculaInicial;
            
        }
        
        System.out.println("Por favor ingrese su edad");
        edad = entrada.nextInt();
        
        if (edad >=17 && edad <20) {
            costo = (costo - Porcentajes.porcentajedos);
        }
        
        System.out.println("Seleccione su estado civil");
        System.out.println("1. Casado");
        System.out.println("2. Soltero");
        estadoCivil = entrada.nextInt();
        
        if (estadoCivil == 1) {
            costo = (costo - Porcentajes.porcentajetres);
        }
       
        System.out.println("¿Presenta cargas familiares?");
        System.out.println("1. Si");
        System.out.println("2. No");
        cargaFamiliar = entrada.nextInt();
        
        if (cargaFamiliar == 1) {
            costo = (costo - Porcentajes.porcentajecuatro);
            
            
        }
        costo = costo + (costo * 0.02);
        
        
        // Salida de datos
        System.out.printf("El costo de su matrícula es: %.2f", costo);   
       
    }
    
}
