
package com.mycompany.app;
import java.util.Scanner;

    
public class TerceraLeydeNewton {

    public static void Newton3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la masa del Primer Objeto (kg): ");
        double masa1 = sc.nextDouble();

        System.out.print("Ingrese la masa del Segundo Objeto (kg): ");
        double masa2 = sc.nextDouble();

        System.out.print("Ingrese la fuerza que el Primero ejerce sobre el Segundo (N): ");
        double fuerza = sc.nextDouble();

        double fuerzaSobre2 = fuerza;
        double fuerzaSobre1 = -fuerza;
        
        double aceleracion1 = fuerzaSobre1 / masa1;
        double aceleracion2 = fuerzaSobre2 / masa2;

        System.out.println("\n--- Resultados ---");
        System.out.printf("Fuerza sobre el Primero (reaccion): %.2f N\n", fuerzaSobre1);
        System.out.printf("Fuerza sobre el Segundo (accion): %.2f N\n", fuerzaSobre2);
        System.out.printf("Aceleracion del Primero: %.2f m/s²\n", aceleracion1);
        System.out.printf("Aceleracion del Segundo: %.2f m/s²\n", aceleracion2);

        sc.close();
    }
}

