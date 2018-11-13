public class Programador extends Empleado{
    int lineasDeCodigoPorHora;
    String lenguajeDominante;

    public  Programador(String nombre, String cedula, int edad, boolean casado, double salario, int lineasDeCodigoPorHora, String lenguajeDominante){

        super.nombre = nombre;
        super.cedula = cedula;
        super.edad = edad;
        super.casado = casado;
        super.salario = salario;
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public Programador(){
    }
}
