package com.mycompany.app;
import java.util.Scanner;

public class MovimientoAcelerado {
    public static void MRUA() {
        Scanner scanner = new Scanner(System.in);

        //Titulo de la aplicación
        System.out.println("***Movimiento acelerado***");

        // Elegir sistema de unidades
        System.out.println("Seleccione el sistema de unidades ");
        System.out.println("1. Sistema Internacional (m, s, m/s, m/s²)");
        System.out.println("2. Sistema Inglés (ft, s, ft/s, ft/s²)");
        System.out.print("Opción: ");
        int sistema = scanner.nextInt();
        double conversion = (sistema == 2) ? 3.28084 : 1.0; // Factor de conversión SI -> Inglés

        while (true) {
            System.out.println("\n¿Qué variable deseas calcular?");
            System.out.println("1. Velocidad final (vf)");
            System.out.println("2. Velocidad inicial (vo)");
            System.out.println("3. Aceleración (a)");
            System.out.println("4. Tiempo (t)");
            System.out.println("5. Distancia (x)");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1: // Calcular velocidad final (vf)
                    System.out.print("Ingrese la velocidad inicial (vo): ");
                    double vo1 = scanner.nextDouble() / conversion;
                    System.out.print("Ingrese la aceleración (a): ");
                    double a1 = scanner.nextDouble() / conversion;
                    System.out.print("Ingrese el tiempo (t): ");
                    double t1 = scanner.nextDouble();
                    double vf1 = vo1 + a1 * t1;
                    System.out.println("Velocidad final (vf) = " + (vf1 * conversion) + (sistema == 2 ? " ft/s" : " m/s"));
                    break;

                case 2: // Calcular velocidad inicial (vo)
                    System.out.print("Ingrese la velocidad final (vf): ");
                    double vf2 = scanner.nextDouble() / conversion;
                    System.out.print("Ingrese la aceleración (a): ");
                    double a2 = scanner.nextDouble() / conversion;
                    System.out.print("Ingrese el tiempo (t): ");
                    double t2 = scanner.nextDouble();
                    double vo2 = vf2 - a2 * t2;
                    System.out.println("Velocidad inicial (vo) = " + (vo2 * conversion) + (sistema == 2 ? " ft/s" : " m/s"));
                    break;

                case 3: // Calcular aceleración (a)
                    System.out.print("Ingrese la velocidad final (vf): ");
                    double vf3 = scanner.nextDouble() / conversion;
                    System.out.print("Ingrese la velocidad inicial (vo): ");
                    double vo3 = scanner.nextDouble() / conversion;
                    System.out.print("Ingrese el tiempo (t): ");
                    double t3 = scanner.nextDouble();
                    double a3 = (vf3 - vo3) / t3;
                    System.out.println("Aceleración (a) = " + (a3 * conversion) + (sistema == 2 ? " ft/s²" : " m/s²"));
                    break;

                case 4: // Calcular tiempo (t)
                    System.out.print("Ingrese la velocidad final (vf): ");
                    double vf4 = scanner.nextDouble() / conversion;
                    System.out.print("Ingrese la velocidad inicial (vo): ");
                    double vo4 = scanner.nextDouble() / conversion;
                    System.out.print("Ingrese la aceleración (a): ");
                    double a4 = scanner.nextDouble() / conversion;
                    double t4 = (vf4 - vo4) / a4;
                    System.out.println("Tiempo (t) = " + t4 + " s");
                    break;

                case 5: // Calcular distancia (x)
                    System.out.print("Ingrese la velocidad inicial (vo): ");
                    double vo5 = scanner.nextDouble() / conversion;
                    System.out.print("Ingrese el tiempo (t): ");
                    double t5 = scanner.nextDouble();
                    System.out.print("Ingrese la aceleración (a): ");
                    double a5 = scanner.nextDouble() / conversion;
                    double x5 = vo5 * t5 + (a5 * t5 * t5) / 2;
                    System.out.println("Distancia (x) = " + (x5 * conversion) + (sistema == 2 ? " ft" : " m"));
                    break;

                case 6:
                    System.out.println("Hasta luego!");
                    scanner.close();
                    return;

                default:
                    System.out.println("La opción no es válida. Inténtelo de nuevo.");
            }
        }
    }
}
