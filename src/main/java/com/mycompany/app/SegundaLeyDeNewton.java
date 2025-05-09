
package com.mycompany.app;

import com.mycompany.app.Movimiento;
import java.util.Scanner;

public class SegundaLeyDeNewton {
      public  static void SegundaLey(){

    
    
        int opcion;

        System.out.println("===== CALCULADORA SEGUNDA LEY DE NEWTON =====");
        System.out.println("F = m·a");

        do {
            System.out.println("\nSeleccione qué desea calcular:");
            System.out.println("1. Calcular Fuerza (F = m·a)");
            System.out.println("2. Calcular Masa (m = F/a)");
            System.out.println("3. Calcular Aceleración (a = F/m)");
            System.out.println("4. Resolver problema con fricción");
            System.out.println("5. Resolver problema en plano inclinado");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            
            opcion = Movimiento.scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    calcularFuerza(Movimiento.scanner);
                    break;
                case 2:
                    calcularMasa(Movimiento.scanner);
                    break;
                case 3:
                    calcularAceleracion(Movimiento.scanner);
                    break;
                case 4:
                    calcularConFriccion(Movimiento.scanner);
                    break;
                case 5:
                    calcularPlanoInclinado(Movimiento.scanner);
                    break;
                case 6:
                    System.out.println("¡Gracias por usar la calculadora de la Segunda Ley de Newton!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 6);
        
  
    }
    
    
    private static void calcularFuerza(Scanner scanner) {
        System.out.print("Ingrese la masa (kg): ");
        double masa = scanner.nextDouble();
        
        System.out.print("Ingrese la aceleración (m/s²): ");
        double aceleracion = scanner.nextDouble();
        
        double fuerza = masa * aceleracion;
        
        System.out.println("\nResultado:");
        System.out.println("Fuerza = " + fuerza + " N (Newtons)");
    }
    
    
    private static void calcularMasa(Scanner scanner) {
        System.out.print("Ingrese la fuerza (N): ");
        double fuerza = scanner.nextDouble();
        
        System.out.print("Ingrese la aceleración (m/s²): ");
        double aceleracion = scanner.nextDouble();
        
        if (aceleracion == 0) {
            System.out.println("Error: La aceleración no puede ser cero para calcular la masa.");
            return;
        }
        
        double masa = fuerza / aceleracion;
        
        System.out.println("\nResultado:");
        System.out.println("Masa = " + masa + " kg");
    }
    
    
    private static void calcularAceleracion(Scanner scanner) {
        System.out.print("Ingrese la fuerza (N): ");
        double fuerza = scanner.nextDouble();
        
        System.out.print("Ingrese la masa (kg): ");
        double masa = scanner.nextDouble();
        
        if (masa == 0) {
            System.out.println("Error: La masa no puede ser cero para calcular la aceleración.");
            return;
        }
        
        double aceleracion = fuerza / masa;
        
        System.out.println("\nResultado:");
        System.out.println("Aceleración = " + aceleracion + " m/s²");
    }
    
    
    private static void calcularConFriccion(Scanner scanner) {
        System.out.print("Ingrese la fuerza aplicada (N): ");
        double fuerzaAplicada = scanner.nextDouble();
        
        System.out.print("Ingrese la masa del objeto (kg): ");
        double masa = scanner.nextDouble();
        
        System.out.print("Ingrese el coeficiente de fricción (μ): ");
        double coeficienteFriccion = scanner.nextDouble();
        
       
        final double GRAVEDAD = 9.8; 
        
        double fuerzaFriccion = coeficienteFriccion * masa * GRAVEDAD;
        
       
        double fuerzaNeta = fuerzaAplicada - fuerzaFriccion;
        
     
        double aceleracion = fuerzaNeta / masa;
        
        System.out.println("\nResultados:");
        System.out.println("Fuerza de fricción = " + fuerzaFriccion + " N");
        System.out.println("Fuerza neta = " + fuerzaNeta + " N");
        
        if (fuerzaNeta <= 0) {
            System.out.println("El objeto no se mueve porque la fricción es mayor o igual que la fuerza aplicada.");
            System.out.println("Aceleración = 0 m/s²");
        } else {
            System.out.println("Aceleración = " + aceleracion + " m/s²");
        }
    }
    
   
    private static void calcularPlanoInclinado(Scanner scanner) {
        System.out.print("Ingrese la masa del objeto (kg): ");
        double masa = scanner.nextDouble();
        
        System.out.print("Ingrese el ángulo del plano inclinado (grados): ");
        double anguloDegrees = scanner.nextDouble();
        
        System.out.print("¿Incluir fricción? (1: Sí / 0: No): ");
        int incluirFriccion = scanner.nextInt();
        
        double anguloRadians = Math.toRadians(anguloDegrees);
        final double GRAVEDAD = 9.8; 
        
        
        double fuerzaParalela = masa * GRAVEDAD * Math.sin(anguloRadians);
        
   
        double fuerzaNormal = masa * GRAVEDAD * Math.cos(anguloRadians);
        
        double aceleracion;
        
        if (incluirFriccion == 1) {
            System.out.print("Ingrese el coeficiente de fricción (μ): ");
            double coeficienteFriccion = scanner.nextDouble();
            
            
            double fuerzaFriccion = coeficienteFriccion * fuerzaNormal;
            
            
            double fuerzaNeta = fuerzaParalela - fuerzaFriccion;
            
            if (fuerzaNeta <= 0) {
                System.out.println("\nResultados:");
                System.out.println("El objeto no se desliza debido a la fricción.");
                System.out.println("Aceleración = 0 m/s²");
                return;
            }
            
            
            aceleracion = fuerzaNeta / masa;
            
            System.out.println("\nResultados:");
            System.out.println("Fuerza paralela al plano = " + fuerzaParalela + " N");
            System.out.println("Fuerza normal = " + fuerzaNormal + " N");
            System.out.println("Fuerza de fricción = " + fuerzaFriccion + " N");
            System.out.println("Fuerza neta = " + fuerzaNeta + " N");
        } else {
           
            aceleracion = fuerzaParalela / masa;
            
            System.out.println("\nResultados:");
            System.out.println("Fuerza paralela al plano = " + fuerzaParalela + " N");
            System.out.println("Fuerza normal = " + fuerzaNormal + " N");
        }
        
        System.out.println("Aceleración = " + aceleracion + " m/s²");


    }
    
}
