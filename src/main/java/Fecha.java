public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año){
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }

    //setters
    public void setDia(int d){
        dia = d;
    }

    public void setMes(int m){
        mes = m;
    }

    public void  setAño(int a){
        año = a;
    }
    //getters
    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAño(){
        return año;
    }

    //metodo para Fecha correcta
    private boolean fechaCorrecta(){
        return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
    }

    //metodo para modificar fecha

    public void diaSiguiente(){
        dia++;
        if (!fechaCorrecta()){
            dia = 1;
            mes++;
            if (!fechaCorrecta()){
                mes = 1;
                año++;
            }
        }
    }
}
