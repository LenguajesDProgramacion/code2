public class Masajista extends SeleccionFutbol{
    private String titulacion;
    protected int aniosExperiencia;

    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosExperiencia){
        super(id,nombre,apellido,edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMsaje(){

    }
}
