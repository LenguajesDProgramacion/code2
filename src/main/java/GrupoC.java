public class GrupoC extends Cliente{
    public double montoapagar;

    public GrupoC(String nombre, int claveDeCliente, double montoapagar){
        super(nombre,claveDeCliente);
        this.montoapagar = montoapagar;
    }


    public double totalaPagar(){
        return (montoapagar >= 10000 ? montoapagar*0.98 : montoapagar);
    }
}
