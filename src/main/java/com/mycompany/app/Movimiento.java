
package com.mycompany.app;

import java.util.Scanner;
import com.mycompany.app.TerceraLeydeNewton;
import com.mycompany.app.MovimientoAcelerado;
import com.mycompany.app.PantallaJayron;
import com.mycompany.app.Calculos;
public class Movimiento {
 

    
       public static final Scanner scanner = new Scanner(System.in);
 

   
    
    
    public void menu(){
    
    
   

        while (true) {
        


            System.out.println("===================================");
            System.out.println("        MENU PRINCIPAL - FISICA    ");
            System.out.println("===================================");
            System.out.println("1. Calcular Distancia (MRU)");
            System.out.println("2. Calcular Velocidad (MRU)");
            System.out.println("3. Calcular Tiempo (MRU)");
            System.out.println("4. Calcular Magnitud de un vector");
            System.out.println("5. Calcular Componentes de un vector");
            System.out.println("6. Sumar dos vectores");
            System.out.println("7. Restar dos vectores");
            System.out.println("8. Producto Escalar de dos vectores");
            System.out.println("9. Multiplicar un vector por un escalar");
            System.out.println("10. Calcular el Angulo entre dos vectores");
            System.out.println("11. Calcular MRUA");
            System.out.println("12. Calcular newton3");
            System.out.println("13. Caida libre");
            System.out.println("14. Salir");

            System.out.print("Ingresa tu opcion: ");
            int opcion = scanner.nextInt();

            if (opcion == 14) {
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
                    double distancia = Calculos.calcularDistanciaMRU(v, t);
                    System.out.println("La distancia es: " + distancia);
                    break;
                }
                case 2: {
                    // Calcular Velocidad (MRU)
                    System.out.print("Ingresa la distancia (d): ");
                    double d = scanner.nextDouble();
                    System.out.print("Ingresa el tiempo (t): ");
                    double t = scanner.nextDouble();
                    double velocidad = Calculos.calcularVelocidadMRU(d, t);
                    System.out.println("La velocidad es: " + velocidad);
                    break;
                }
                case 3: {
                    // Calcular Tiempo (MRU)
                    System.out.print("Ingresa la distancia (d): ");
                    double d = scanner.nextDouble();
                    System.out.print("Ingresa la velocidad (v): ");
                    double v = scanner.nextDouble();
                    double tiempo = Calculos.calcularTiempoMRU(d, v);
                    System.out.println("El tiempo es: " + tiempo);
                    break;
                }
                 case 4: {
                    // Calcular Magnitud de un vector
                    System.out.print("Ingresa el componente x del vector: ");
                    double x = scanner.nextDouble();
                    System.out.print("Ingresa el componente y del vector: ");
                    double y = scanner.nextDouble();
                    double magnitud = Calculos.calcularMagnitud(x, y);
                    System.out.println("La magnitud del vector es: " + magnitud);
                    break;
                }
                case 5: {
                    // Calcular Componentes de un vector
                    System.out.print("Ingresa la magnitud del vector: ");
                    double magnitud = scanner.nextDouble();
                    System.out.print("Ingresa el ángulo en grados: ");
                    double angulo = scanner.nextDouble();
                    double[] componentes = Calculos.calcularComponentes(magnitud, angulo);
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
                    double[] suma = Calculos.sumarVectores(new double[]{x1, y1}, new double[]{x2, y2});
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
                    double[] resta =Calculos.restarVectores(new double[]{x1, y1}, new double[]{x2, y2});
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
                    double producto =Calculos.productoEscalar(new double[]{x1, y1}, new double[]{x2, y2});
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
                    double[] resultado = Calculos.multiplicarPorEscalar(new double[]{x, y}, escalar);
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
                    double angulo =Calculos.calcularAnguloEntreVectores(new double[]{x1, y1}, new double[]{x2, y2});
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
                case 13:
                    PantallaJayron.MenuCaidaLibre();
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        scanner.close();
    }
    }
    
    
    
    
    
    
    
    
    
    
    
   

  