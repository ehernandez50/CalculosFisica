
package com.mycompany.app;


public class Conversiones {
    
    public static void main(String[] args) {
        System.out.println(  libras(1, "oz"));
    }
    
    
    
public static double metros(double metros, String unidad) {
    double conversion = 0;

    try {
        switch (unidad.toLowerCase()) {
            case "km":
                conversion = metros / 1000;
                break;
            case "cm":
                conversion = metros * 100;
                break;
            case "mm":
                conversion = metros * 1000;
                break;
            case "ft":
                conversion = metros * 3.28084;
                break;
            case "in":
                conversion = metros * 39.3701;
                break;
            case "millas":
                conversion = metros * 0.000621371;
                break;
            case "yardas":
                conversion = metros * 1.09361;
                break;
            default:
                throw new IllegalArgumentException("Unidad no válida");
        }

    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return 0;
    }

    return conversion;
}




    public static double kilometros(double kilometros, String unidad) {
        double conversion;

        try {
            switch (unidad.toLowerCase()) {
                case "m":
                    conversion = kilometros * 1000;
                    break;
                case "cm":
                    conversion = kilometros * 100000;
                    break;
                case "mm":
                    conversion = kilometros * 1_000_000;
                    break;
                case "ft":
                    conversion = kilometros * 3280.84;
                    break;
                case "in":
                    conversion = kilometros * 39370.1;
                    break;
                case "millas":
                    conversion = kilometros * 0.621371;
                    break;
                case "yardas":
                    conversion = kilometros * 1093.61;
                    break;
                default:
                    throw new IllegalArgumentException("Unidad no válida");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }

        return conversion;
    }


public static double pulgadas(double pulgadas, String unidad) {
    double conversion = 0;

    try {
        switch (unidad.toLowerCase()) {
            case "m":
                conversion = pulgadas / 39.3701;
                break;
            case "cm":
                conversion = pulgadas * 2.54;
                break;
            case "mm":
                conversion = pulgadas * 25.4;
                break;
            case "ft":
                conversion = pulgadas / 12;
                break;
            case "km":
                conversion = pulgadas / 39370.1;
                break;
            case "millas":
                conversion = pulgadas / 63360;
                break;
            case "yardas":
                conversion = pulgadas / 36;
                break;
            default:
                throw new IllegalArgumentException("Unidad no válida");
        }

    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return 0;
    }
    
    return conversion;
    
}






public static double centimetros(double centimetros, String unidad) {
    double conversion = 0;

    try {
        switch (unidad.toLowerCase()) {
            case "m":
                conversion = centimetros / 100;
                break;
            case "mm":
                conversion = centimetros * 10;
                break;
            case "km":
                conversion = centimetros / 100000;
                break;
            case "in":
                conversion = centimetros / 2.54;
                break;
            case "ft":
                conversion = centimetros / 30.48;
                break;
            case "yardas":
                conversion = centimetros / 91.44;
                break;
            case "millas":
                conversion = centimetros / 160934;
                break;
            default:
                throw new IllegalArgumentException("Unidad no válida");
        }

    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return 0;
    }

return conversion;
}

public static double milimetros(double milimetros, String unidad) {
    double conversion = 0;

    try {
        switch (unidad.toLowerCase()) {
            case "m":
                conversion = milimetros / 1000;
                break;
            case "cm":
                conversion = milimetros / 10;
                break;
            case "km":
                conversion = milimetros / 1_000_000;
                break;
            case "in":
                conversion = milimetros / 25.4;
                break;
            case "ft":
                conversion = milimetros / 304.8;
                break;
            case "yardas":
                conversion = milimetros / 914.4;
                break;
            case "millas":
                conversion = milimetros / 1_609_344;
                break;
            default:
                throw new IllegalArgumentException("Unidad no válida");
        }

    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return 0;
    }

    return conversion;
}





public static double pies(double pies, String unidad) {
    double conversion = 0;

    try {
        switch (unidad.toLowerCase()) {
            case "m":
                conversion = pies / 3.28084;
                break;
            case "cm":
                conversion = pies * 30.48;
                break;
            case "mm":
                conversion = pies * 304.8;
                break;
            case "km":
                conversion = pies / 3280.84;
                break;
            case "in":
                conversion = pies * 12;
                break;
            case "yardas":
                conversion = pies / 3;
                break;
            case "millas":
                conversion = pies / 5280;
                break;
            default:
                throw new IllegalArgumentException("Unidad no válida");
        }

    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return 0;
    }

    return conversion;
}


public static double millas(double millas, String unidad) {
    double conversion = 0;

    try {
        switch (unidad.toLowerCase()) {
            case "km":
                conversion = millas * 1.60934;
                break;
            case "m":
                conversion = millas * 1609.34;
                break;
            case "cm":
                conversion = millas * 160934;
                break;
            case "mm":
                conversion = millas * 1_609_344;
                break;
            case "ft":
                conversion = millas * 5280;
                break;
            case "in":
                conversion = millas * 63_360;
                break;
            case "yardas":
                conversion = millas * 1760;
                break;
            default:
                throw new IllegalArgumentException("Unidad no válida");
        }

    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return 0;
    }

    return conversion;
}
 
public static double yardas(double yardas, String unidad) {
    double conversion = 0;

    try {
        switch (unidad.toLowerCase()) {
            case "m":
                conversion = yardas * 0.9144;
                break;
            case "cm":
                conversion = yardas * 91.44;
                break;
            case "mm":
                conversion = yardas * 914.4;
                break;
            case "km":
                conversion = yardas * 0.0009144;
                break;
            case "ft":
                conversion = yardas * 3;
                break;
            case "in":
                conversion = yardas * 36;
                break;
            case "millas":
                conversion = yardas / 1760;
                break;
            default:
                throw new IllegalArgumentException("Unidad no válida");
        }

    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return 0;
    }

    return conversion;
}


public static double kilogramos(double valor, String unidad) {
    double conversion = 0;

    try {
        switch (unidad.toLowerCase()) {
            case "kg":
                conversion = valor;
                break;
            case "g":
                conversion = valor * 1000;
                break;
            case "mg":
                conversion = valor * 1_000_000;
                break;
            case "lbs":
                conversion = valor * 2.20462;
                break;
            case "oz":
                conversion = valor * 35.274;
                break;
            case "ton":
                conversion = valor / 1000;
                break;
            default:
                throw new IllegalArgumentException("Unidad no válida");
        }

    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return 0;
    }

    return conversion;
}







public static double gramos(double gramos, String unidad) {
    double conversion = 0;

    try {
        switch (unidad.toLowerCase()) {
            case "kg":
                conversion = gramos / 1000;
                break;
            case "mg":
                conversion = gramos * 1000;
                break;
            case "lbs":
                conversion = gramos * 0.00220462;
                break;
            case "oz":
                conversion = gramos * 0.035274;
                break;
            case "ton":
                conversion = gramos / 1_000_000;
                break;
            default:
                throw new IllegalArgumentException("Unidad no válida");
        }

    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return 0;
    }

    return conversion;
}





public static double miligramos(double mg, String unidad) {
    double conversion = 0;

    try {
        switch (unidad.toLowerCase()) {
            case "kg":
                conversion = mg / 1_000_000;
                break;
            case "g":
                conversion = mg / 1000;
                break;
            case "ng":
                conversion = mg * 1_000_000;
                break;
            case "lbs":
                conversion = mg * 2.20462e-6;
                break;
            case "oz":
                conversion = mg * 3.5274e-5;
                break;
            case "ton":
                conversion = mg / 1_000_000_000;
                break;
            default:
                throw new IllegalArgumentException("Unidad no válida");
        }

    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return 0;
    }

    return conversion;
}




public static double libras(double libras, String unidad) {
    double conversion = 0;

    try {
        switch (unidad.toLowerCase()) {
            case "kg":
                conversion = libras / 2.20462;
                break;
            case "g":
                conversion = libras * 453.592;
                break;
            case "mg":
                conversion = libras * 453592.37;
                break;
            case "ng":
                conversion = libras * 4.53592e+8;
                break;
            case "oz":
                conversion = libras * 16;
                break;
            case "ton":
                conversion = libras / 2204.62;
                break;
            default:
                throw new IllegalArgumentException("Unidad no válida");
        }

    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return 0;
    }

    return conversion;
}


public static double onzas(double onzas, String unidad) {
    double conversion = 0;

    try {
        switch (unidad.toLowerCase()) {
            case "kg":
                conversion = onzas / 35.274;
                break;
            case "g":
                conversion = onzas * 28.3495;
                break;
            case "mg":
                conversion = onzas * 28349.5;
                break;
            case "ng":
                conversion = onzas * 2.83495e+7;
                break;
            case "lbs":
                conversion = onzas / 16;
                break;
            case "ton":
                conversion = onzas / 35_274;
                break;
            default:
                throw new IllegalArgumentException("Unidad no válida");
        }

    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return 0;
    }

    return conversion;
}
public static double toneladas(double toneladas, String unidad) {
    double conversion = 0;

    try {
        switch (unidad.toLowerCase()) {
            case "kg":
                conversion = toneladas * 1000;
                break;
            case "g":
                conversion = toneladas * 1_000_000;
                break;
            case "mg":
                conversion = toneladas * 1_000_000_000;
                break;
            case "ng":
                conversion = toneladas * 1e+12;
                break;
            case "lbs":
                conversion = toneladas * 2204.62;
                break;
            case "oz":
                conversion = toneladas * 35_274;
                break;
            default:
                throw new IllegalArgumentException("Unidad no válida");
        }

    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return 0;
    }

    return conversion;
}



public static double segundos(double segundos, String unidad) {
    double conversion = 0;

    try {
        switch (unidad.toLowerCase()) {
            case "min":
                conversion = segundos / 60;
                break;
            case "h":
                conversion = segundos / 3600;
                break;
            case "d":
                conversion = segundos / 86400;
                break;
            case "sem":
                conversion = segundos / 604800;
                break;
            case "mes":
                conversion = segundos / 2_629_746; // promedio de 30.44 días
                break;
            case "año":
                conversion = segundos / 31_557_600; // promedio de 365.25 días
                break;
            default:
                throw new IllegalArgumentException("Unidad no válida");
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return 0;
    }

    return conversion;
}

public static double horas(double horas, String unidad) {
    double conversion = 0;

    try {
        switch (unidad.toLowerCase()) {
            case "seg":
                conversion = horas * 3600;
                break;
            case "min":
                conversion = horas * 60;
                break;
            case "d":
                conversion = horas / 24;
                break;
            case "sem":
                conversion = horas / 168; // 24 * 7
                break;
            case "mes":
                conversion = horas / 730.001; // promedio: 30.44 días * 24
                break;
            case "año":
                conversion = horas / 8760; // 365 * 24
                break;
            default:
                throw new IllegalArgumentException("Unidad no válida");
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return 0;
    }

    return conversion;
}


public static double minutos(double minutos, String unidad) {
    double conversion = 0;

    try {
        switch (unidad.toLowerCase()) {
            case "seg":
                conversion = minutos * 60;
                break;
            case "h":
                conversion = minutos / 60;
                break;
            case "d":
                conversion = minutos / 1440; // 24 * 60
                break;
            case "sem":
                conversion = minutos / 10080; // 7 * 24 * 60
                break;
            case "mes":
                conversion = minutos / 43800; // promedio: 30.44 días * 24 * 60
                break;
            case "año":
                conversion = minutos / 525600; // 365 * 24 * 60
                break;
            default:
                throw new IllegalArgumentException("Unidad no válida");
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return 0;
    }

    return conversion;
}
public static double dias(double dias, String unidad) {
    double conversion = 0;

    try {
        switch (unidad.toLowerCase()) {
            case "seg":
                conversion = dias * 86400; // 24 * 60 * 60
                break;
            case "min":
                conversion = dias * 1440; // 24 * 60
                break;
            case "h":
                conversion = dias * 24;
                break;
            case "sem":
                conversion = dias / 7;
                break;
            case "mes":
                conversion = dias / 30.44; // promedio de días en un mes
                break;
            case "año":
                conversion = dias / 365.25; // año promedio con año bisiesto
                break;
            default:
                throw new IllegalArgumentException("Unidad no válida");
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return 0;
    }

    return conversion;
}
public static double semanas(double semanas, String unidad) {
    double conversion = 0;

    try {
        switch (unidad.toLowerCase()) {
            case "seg":
                conversion = semanas * 604800; // 7 * 24 * 60 * 60
                break;
            case "min":
                conversion = semanas * 10080; // 7 * 24 * 60
                break;
            case "h":
                conversion = semanas * 168; // 7 * 24
                break;
            case "d":
                conversion = semanas * 7;
                break;
            case "mes":
                conversion = semanas / 4.345; // promedio de semanas por mes
                break;
            case "año":
                conversion = semanas / 52.143; // semanas por año promedio
                break;
            default:
                throw new IllegalArgumentException("Unidad no válida");
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return 0;
    }

    return conversion;
}
public static double meses(double meses, String unidad) {
    double conversion = 0;

    try {
        switch (unidad.toLowerCase()) {
            case "seg":
                conversion = meses * 2_629_746; // promedio de 30.44 días
                break;
            case "min":
                conversion = meses * 43_829; // 30.44 * 24 * 60
                break;
            case "h":
                conversion = meses * 730.001; // 30.44 * 24
                break;
            case "d":
                conversion = meses * 30.44; // días promedio por mes
                break;
            case "sem":
                conversion = meses * 4.345; // semanas promedio por mes
                break;
            case "año":
                conversion = meses / 12;
                break;
            default:
                throw new IllegalArgumentException("Unidad no válida");
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return 0;
    }

    return conversion;
}
public static double anios(double anios, String unidad) {
    double conversion = 0;

    try {
        switch (unidad.toLowerCase()) {
            case "seg":
                conversion = anios * 31_557_600; // 365.25 * 24 * 60 * 60
                break;
            case "min":
                conversion = anios * 525_600; // 365 * 24 * 60
                break;
            case "h":
                conversion = anios * 8760; // 365 * 24
                break;
            case "d":
                conversion = anios * 365.25; // incluye años bisiestos
                break;
            case "sem":
                conversion = anios * 52.143; // semanas por año
                break;
            case "mes":
                conversion = anios * 12;
                break;
            default:
                throw new IllegalArgumentException("Unidad no válida");
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return 0;
    }

    return conversion;}

}
