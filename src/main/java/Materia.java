public class Materia {
    private String nombre;
    private String key;
    private double nota;

    public Materia(String nombre, String key, double nota) {
        this.nombre = nombre;
        this.key = key;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
