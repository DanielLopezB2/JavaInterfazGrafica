
package clases;

import java.time.temporal.TemporalQueries;


public class Electrodomestico {
    
    //Atributos de la clase Electrodomestico
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    
    //Clase que define los valores válidos para el atributo "color"
    public enum Color {
        BLANCO, NEGRO, ROJO, AZUL, GRIS
    }
    
    //Método constructor por defecto que inicializa los valores por defecto
    public Electrodomestico() {
        this.precioBase = 100;
        this.color = "Blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
        
    }
    
    //Método constructor con precio y peso
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.color = "Blanco";
        this.consumoEnergetico = 'F';
        this.peso = peso;
    }
    
    //Método constructor con todos los atributos
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    
    //Métodos get y set de cada atributo    
    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    //Métodos de la superclase
    
    //Método para verificar que la letra proporcionada como parámetro está entre las letras válidas (A, B, C, D, E, F)
    private char comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return 'F';
        }
    }
    
    //Método para verificar que el color proporcionado como parámetro es uno de los colores válidos 
    //(blanco, negro, rojo, azul y gris), y que en caso contrario devuelva el color por defecto (blanco)
    private Color comprobarColor(String color) {
        try {
            return Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            return Color.BLANCO;
        }
    }
    
    //Método para calcular el precio final del producto según el consumo energético, 
    //que aumentará su precio, y según su tamaño, también.
    public double precioFinal() {
        double precio = precioBase;

        // Incremento por consumo energético
        switch(consumoEnergetico) {
            case 'A':
                precio += 100;
                break;
            case 'B':
                precio += 80;
                break;
            case 'C':
                precio += 60;
                break;
            case 'D':
                precio += 50;
                break;
            case 'E':
                precio += 30;
                break;
            case 'F':
                precio += 10;
                break;
        }

        // Incremento por peso
        if (peso >= 0 && peso < 20) {
            precio += 10;
        } else if (peso >= 20 && peso < 50) {
            precio += 50;
        } else if (peso >= 50 && peso < 80) {
            precio += 80;
        } else if (peso >= 80) {
            precio += 100;
        }

        return precio;
    }
    
}
