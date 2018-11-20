public class Lavadora extends Electrodomestico{

    private int capacidad;

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


    public Lavadora(String marca, String modelo, String color, int peso, int capacidad){
        super(marca,modelo,color,peso);
        this.capacidad = capacidad;
    }


    public String getCapacidadMaxima(int pesoingresado){
        if (capacidad <  pesoingresado){
            return "exedio la capacidad maxima";
        }else {
            return "la capacidad esta en el rango";
        }
    }


}
