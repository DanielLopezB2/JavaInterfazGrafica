
package clases;


public class Lavadora extends Electrodomestico {
    
    //Definición del atributo carga
    private int carga;
    
    //Método constructor por defecto
    public Lavadora() {
        super();
        this.carga = 5;
        
    }
    
    //Método constructor con el precio y peso
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = 5;
    }
    
    //método constructor con la carga y el resto de los atributos heredados
    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    
    //Métodos set y get del atributo carga
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    //Este método sobrescribe el método "precioFinal()" de la clase "Electrodomestico" y llama al método "precioFinal()" 
    //de la clase padre para aplicar las condiciones de la clase padre. 
    //Luego, si la carga es mayor de 30 kg, se aumenta el precio en 50 pesos. 
    //Finalmente, se devuelve el precio final de la lavadora.
    
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (carga > 30) {
            precioFinal += 50;
        }
        return precioFinal;
    }
    
}
