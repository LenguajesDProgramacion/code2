public class Empleado {
    String nombre;
    String cedula;
    int edad;
    boolean casado;
    double salario;

    public Empleado() {
    }

    private String getNombre(){
        return nombre;
    }

    private void setNombre(String nombre){
        this.nombre = nombre;
    }

    private String getCedula(){
        return cedula;
    }

    private void setCedula(String cedula){
        this.cedula = cedula;
    }

    private int getEdad(){
        return edad;
    }
    private void setEdad(int edad){
        this.edad = edad;
    }
    private boolean getCasado(){
        return casado;
    }

    private void setCasado(boolean casado){
        this.casado = casado;
    }

    private double getSalario(){
        return salario;
    }

    private void setSalario(double salario){
        this.salario = salario;
    }

    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario){
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public String Clasificacion(){
        String c="";
        if (edad <= 21){
            c = "Principiante";
        }
        if ((edad >=22) & (edad <= 35)){
            c = "Intermedio";
        }
        if (edad > 35){
            c = "Senior";
        }
        return c;
    }

    public void ImprimirEmpleado(){
        System.out.println(this.nombre);
        System.out.println(this.cedula);
        System.out.println(this.edad);
        if (casado) {
            System.out.println("Casado");
        }
        else
        {
            System.out.println("Soltero");
        }
        System.out.println(this.salario);
    }

    public void AumentarSalario(double incremento){
        salario = salario * (1 + incremento);
    }

}
