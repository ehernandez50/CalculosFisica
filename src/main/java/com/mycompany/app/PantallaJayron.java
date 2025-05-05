
package com.mycompany.app;
    import java.util.Scanner;
import com.mycompany.app.Movimiento;
public class PantallaJayron  {
  
    static final double GRAVEDAD = 9.8;

    public static void MenuCaidaLibre() {
       // Scanner scanner = new Scanner(System.in);
        int opcion=0;
                ;

      do {
            System.out.println("--- Cálculos de Caída Libre ---");
            System.out.println("1. Calcular tiempo (con distancia)");
            System.out.println("2. Calcular distancia (con tiempo)");
            System.out.println("3. Calcular velocidad final (con tiempo)");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            String input = Movimiento.scanner.next();

            try {
                opcion = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese la distancia (m): ");
                    try {
                        double d = Double.parseDouble(Movimiento.scanner.next());
                        if (d < 0) {
                            System.out.println("La distancia no puede ser negativa.");
                        } else {
                            double t = Math.sqrt((2 * d) / GRAVEDAD);
                            System.out.printf("Tiempo de caída: %.2f segundos%n", t);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Ingrese un número válido.");
                    }
                }

                case 2 -> {
                    System.out.print("Ingrese el tiempo (s): ");
                    try {
                        double t = Double.parseDouble(Movimiento.scanner.next());
                        if (t < 0) {
                            System.out.println("El tiempo no puede ser negativo.");
                        } else {
                            double d = 0.5 * GRAVEDAD * Math.pow(t, 2);
                            System.out.printf("Distancia recorrida: %.2f metros%n", d);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Ingrese un número válido.");
                    }
                }

                case 3 -> {
                    System.out.print("Ingrese el tiempo (s): ");
                    try {
                        double t = Double.parseDouble(Movimiento.scanner.next());
                        if (t < 0) {
                            System.out.println("El tiempo no puede ser negativo.");
                        } else {
                            double v = GRAVEDAD * t;
                            System.out.printf("Velocidad final: %.2f m/s%n", v);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Ingrese un número válido.");
                    }
                }

                case 4 -> System.out.println("Saliendo del programa...");

                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (opcion != 4);

       // scanner.close();
    }
}

    
    
    
    
    
    


