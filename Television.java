package clases;


public class Television extends Electrodomestico {
    
    //Se declaran los atributos de la clase
    private int resolucion; // en pulgadas
    private boolean sintonizadorTDT;
    
    
    // Método Constructor por defecto
    public Television() {
        super();
        this.resolucion = 20; // Valor por defecto
        this.sintonizadorTDT = false; // Valor por defecto
    }
    
    // Método constructor con precio y peso
    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = 20; // Valor por defecto
        this.sintonizadorTDT = false; // Valor por defecto
    }
    
    //Método constructor con todos los valores heredados de la superclase y los atributos de esta subclase
    public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT) {
    super(precioBase, color, consumoEnergetico, peso);
    this.resolucion = resolucion;
    this.sintonizadorTDT = sintonizadorTDT;
    }
    
    
    //Metodos get y set de los atributos resolucion y sintonizadorTDT
    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }
    
    //devuelve un valor booleano que indica si la televisión tiene sintonizador TDT
    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    
    //se utiliza el método super.precioFinal() para calcular el precio según las condiciones de la clase Electrodomestico. 
    //Luego, si la resolución es mayor de 40 pulgadas, se incrementa el precio en un 30% multiplicando el precio final por 1.3. 
    //Finalmente, si tiene sintonizador TDT, se incrementa el precio en 50 pesos sumando 50 al precio final.
    
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal(); // Precio según las condiciones de la clase Electrodoméstico
        if (resolucion > 40) {
            precioFinal *= 1.3; // Incremento del 30% por resolución mayor de 40 pulgadas
        }
        if (sintonizadorTDT) {
            precioFinal += 50; // Incremento de 50 pesos por sintonizador TDT incorporado
        }
        return precioFinal;
    }
    
}
