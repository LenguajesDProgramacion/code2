public class Electrodomestico {
    String marca;
    String modelo;
    String color;
    int peso;

    private String getMarca(){
        return marca;
    }

    private String getModelo(){
        return modelo;
    }

    private String getColor(){
        return color;
    }

    private int getPeso(){
        return peso;
    }

    private void setMarca(String marca){
        this.marca = marca;
    }

    private void setModelo (String modelo){
        this.modelo =modelo;
    }

    private void setColor(String color){
        this.color = color;
    }

    private void setPeso(int peso){
        this.peso = peso;
    }

    public Electrodomestico(String marca, String modelo, String color, int peso){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.peso = peso;
    }
}
