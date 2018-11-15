public abstract class Cliente {
    private String nombre;
    private int claveDeCliente;

    public Cliente(String nombre, int claveDeCliente){
        this.nombre=nombre;
        this.claveDeCliente=claveDeCliente;
    }

    public abstract double totalaPagar();
}
