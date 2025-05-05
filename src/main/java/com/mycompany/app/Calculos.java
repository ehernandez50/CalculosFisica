/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

/**
 *
 * @author Jovany
 */
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
    
}
