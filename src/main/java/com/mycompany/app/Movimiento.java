
package com.mycompany.app;

import java.util.Scanner;
import com.mycompany.app.TerceraLeydeNewton;
import com.mycompany.app.MovimientoAcelerado;
public class Movimiento {
    
    
 

     public static double calcularDistanciaMRU(double v, double t) {
        return v * t;
    }

    public static double calcularVelocidadMRU(double d, double t) {
        return d / t;
    }

    public static double calcularTiempoMRU(double d, double v) {
        return d / v;
    }
    
    
    
    
    
    
    
    
     public static double calcularMagnitud(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    public static double[] calcularComponentes(double magnitud, double anguloGrados) {
        double anguloRad = Math.toRadians(anguloGrados);
        double x = magnitud * Math.cos(anguloRad);
        double y = magnitud * Math.sin(anguloRad);
        return new double[]{x, y};
    }

    public static double[] sumarVectores(double[] v1, double[] v2) {
        return new double[]{v1[0] + v2[0], v1[1] + v2[1]};
    }

    public static double[] restarVectores(double[] v1, double[] v2) {
        return new double[]{v1[0] - v2[0], v1[1] - v2[1]};
    }

    public static double productoEscalar(double[] v1, double[] v2) {
        return v1[0] * v2[0] + v1[1] * v2[1];
    }

  public static double[] multiplicarPorEscalar(double[] v, double escalar) {
    return new double[]{v[0] * escalar, v[1] * escalar};
}

    public static double calcularAnguloEntreVectores(double[] v1, double[] v2) {
        double producto = productoEscalar(v1, v2);
        double magnitud1 = calcularMagnitud(v1[0], v1[1]);
        double magnitud2 = calcularMagnitud(v2[0], v2[1]);
        double cosTheta = producto / (magnitud1 * magnitud2);
        return Math.toDegrees(Math.acos(cosTheta));
    }
    
    
    
    public void menu(){
    
    
     Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelecciona la operacion que deseas realizar:");
            System.out.println("1. Calcular Distancia (MRU)");
            System.out.println("2. Calcular Velocidad (MRU)");
            System.out.println("3. Calcular Tiempo (MRU)");
            System.out.println("4. Calcular Magnitud de un vector");
            System.out.println("5. Calcular Componentes de un vector");
            System.out.println("6. Sumar dos vectores");
            System.out.println("7. Restar dos vectores");
            System.out.println("8. Producto Escalar de dos vectores");
            System.out.println("9. Multiplicar un vector por un escalar");
            System.out.println("10. Calcular el ángulo entre dos vectores");
            System.out.println("11. Calcular MRUA");
            System.out.println("12. Calcular newton3");
            System.out.println("0. Salir");

            System.out.print("Ingresa tu opcion: ");
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                System.out.println("Saliendo...");
                break;
            }

            switch (opcion) {
                case 1: {
                    // Calcular Distancia (MRU)
                    System.out.print("Ingresa la velocidad (v): ");
                    double v = scanner.nextDouble();
                    System.out.print("Ingresa el tiempo (t): ");
                    double t = scanner.nextDouble();
                    double distancia = calcularDistanciaMRU(v, t);
                    System.out.println("La distancia es: " + distancia);
                    break;
                }
                case 2: {
                    // Calcular Velocidad (MRU)
                    System.out.print("Ingresa la distancia (d): ");
                    double d = scanner.nextDouble();
                    System.out.print("Ingresa el tiempo (t): ");
                    double t = scanner.nextDouble();
                    double velocidad = calcularVelocidadMRU(d, t);
                    System.out.println("La velocidad es: " + velocidad);
                    break;
                }
                case 3: {
                    // Calcular Tiempo (MRU)
                    System.out.print("Ingresa la distancia (d): ");
                    double d = scanner.nextDouble();
                    System.out.print("Ingresa la velocidad (v): ");
                    double v = scanner.nextDouble();
                    double tiempo = calcularTiempoMRU(d, v);
                    System.out.println("El tiempo es: " + tiempo);
                    break;
                }
                 case 4: {
                    // Calcular Magnitud de un vector
                    System.out.print("Ingresa el componente x del vector: ");
                    double x = scanner.nextDouble();
                    System.out.print("Ingresa el componente y del vector: ");
                    double y = scanner.nextDouble();
                    double magnitud = calcularMagnitud(x, y);
                    System.out.println("La magnitud del vector es: " + magnitud);
                    break;
                }
                case 5: {
                    // Calcular Componentes de un vector
                    System.out.print("Ingresa la magnitud del vector: ");
                    double magnitud = scanner.nextDouble();
                    System.out.print("Ingresa el ángulo en grados: ");
                    double angulo = scanner.nextDouble();
                    double[] componentes = calcularComponentes(magnitud, angulo);
                    System.out.println("Componentes del vector: x = " + componentes[0] + ", y = " + componentes[1]);
                    break;
                }
                case 6: {
                    // Sumar dos vectores
                    System.out.print("Ingresa el componente x del primer vector: ");
                    double x1 = scanner.nextDouble();
                    System.out.print("Ingresa el componente y del primer vector: ");
                    double y1 = scanner.nextDouble();
                    System.out.print("Ingresa el componente x del segundo vector: ");
                    double x2 = scanner.nextDouble();
                    System.out.print("Ingresa el componente y del segundo vector: ");
                    double y2 = scanner.nextDouble();
                    double[] suma = sumarVectores(new double[]{x1, y1}, new double[]{x2, y2});
                    System.out.println("El resultado de la suma es: x = " + suma[0] + ", y = " + suma[1]);
                    break;
                }
                case 7: {
                    // Restar dos vectores
                    System.out.print("Ingresa el componente x del primer vector: ");
                    double x1 = scanner.nextDouble();
                    System.out.print("Ingresa el componente y del primer vector: ");
                    double y1 = scanner.nextDouble();
                    System.out.print("Ingresa el componente x del segundo vector: ");
                    double x2 = scanner.nextDouble();
                    System.out.print("Ingresa el componente y del segundo vector: ");
                    double y2 = scanner.nextDouble();
                    double[] resta = restarVectores(new double[]{x1, y1}, new double[]{x2, y2});
                    System.out.println("El resultado de la resta es: x = " + resta[0] + ", y = " + resta[1]);
                    break;
                }
                case 8: {
                    // Producto Escalar
                    System.out.print("Ingresa el componente x del primer vector: ");
                    double x1 = scanner.nextDouble();
                    System.out.print("Ingresa el componente y del primer vector: ");
                    double y1 = scanner.nextDouble();
                    System.out.print("Ingresa el componente x del segundo vector: ");
                    double x2 = scanner.nextDouble();
                    System.out.print("Ingresa el componente y del segundo vector: ");
                    double y2 = scanner.nextDouble();
                    double producto = productoEscalar(new double[]{x1, y1}, new double[]{x2, y2});
                    System.out.println("El producto escalar es: " + producto);
                    break;
                }
                case 9: {
                    // Multiplicar un vector por un escalar
                    System.out.print("Ingresa el componente x del vector: ");
                    double x = scanner.nextDouble();
                    System.out.print("Ingresa el componente y del vector: ");
                    double y = scanner.nextDouble();
                    System.out.print("Ingresa el valor del escalar: ");
                    double escalar = scanner.nextDouble();
                    double[] resultado = multiplicarPorEscalar(new double[]{x, y}, escalar);
                    System.out.println("El vector multiplicado por el escalar es: x = " + resultado[0] + ", y = " + resultado[1]);
                    break;
                }
                case 10: {
                    // Calcular el ángulo entre dos vectores
                    System.out.print("Ingresa el componente x del primer vector: ");
                    double x1 = scanner.nextDouble();
                    System.out.print("Ingresa el componente y del primer vector: ");
                    double y1 = scanner.nextDouble();
                    System.out.print("Ingresa el componente x del segundo vector: ");
                    double x2 = scanner.nextDouble();
                    System.out.print("Ingresa el componente y del segundo vector: ");
                    double y2 = scanner.nextDouble();
                    double angulo = calcularAnguloEntreVectores(new double[]{x1, y1}, new double[]{x2, y2});
                    System.out.println("El ángulo entre los vectores es: " + angulo + " grados");
                    break;
                }
                
                
                
                
                case 11: {
                   MovimientoAcelerado.MRUA();
                 
                    break;
                }
             
                case 12: {
                 TerceraLeydeNewton.Newton3();
                   
                    break;
                }
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        scanner.close();
    }
    }
    
    
    
    
    
    
    
    
    
    
    
   

  