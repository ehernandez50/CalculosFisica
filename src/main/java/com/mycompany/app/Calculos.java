
package com.mycompany.app;

public class Calculos {
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

 

  
    
}
