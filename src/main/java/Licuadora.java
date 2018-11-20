public class Licuadora  extends Electrodomestico{

    private int tamaño;
    private int tiempoDeGarantia;

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setTiempoDeGarantia(int tiempoDeGarantia) {
        this.tiempoDeGarantia = tiempoDeGarantia;
    }

    public Licuadora(String marca, String modelo, String color, int peso, int tamaño){
        super(marca,modelo,color,peso);
        this.tamaño = tamaño;
    }


}
