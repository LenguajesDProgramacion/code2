public abstract class Entrenador extends SeleccionFutbol{
    private int idFederacion;

    public Entrenador(int id, String nombre, String apellido, int edad, int idFederacion){
        super(id,nombre,apellido,edad);
        this.idFederacion=idFederacion;
    }
    public void planificarEntrenamiento(){

    }
}
