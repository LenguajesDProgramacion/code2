
import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona{
    private List<Materia> materias;

    public Estudiante(String nombre, String apellido, int ci, int edad){
        super(nombre, apellido, ci, edad);
        this.materias = new ArrayList<>();
    }

    //agregar materias
    public void addMateria(Materia materia){
      this.materias.add(materia);
    }

    //Metodo
    public String getMateria(String key, List<Materia> materias){
        String detalle = "";
        //recorreindo materia por materia
        for (Materia materia: materias) {
            if (materia.getKey().equals(key)){
                detalle = materia.getKey()+"\n"+materia.getNombre()+"\n"+materia.getNota();
                break;
            }
        }
        return detalle;
    }
}
