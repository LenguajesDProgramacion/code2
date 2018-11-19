public abstract class Cliente {
    private String nombre;
    private int claveDeCliente;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClaveDeCliente() {
        return claveDeCliente;
    }

    public void setClaveDeCliente(int claveDeCliente) {
        this.claveDeCliente = claveDeCliente;
    }

    public Cliente(String nombre, int claveDeCliente){
        this.nombre=nombre;
        this.claveDeCliente=claveDeCliente;
    }

    public abstract double totalaPagar();
}
