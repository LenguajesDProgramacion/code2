public abstract class SeleccionFutbol {
    private int id;
    private String nombre;
    private String apellidos;
    private  int edad;

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public abstract boolean viajar();

    public abstract void consentrase();

    public abstract void entrenamiento();

    public abstract void partidoFutbol();
}
