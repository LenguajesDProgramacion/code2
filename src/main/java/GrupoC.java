public class GrupoC extends Cliente{
    public double montoapagar;

    public GrupoC(String nombre, int claveDeCliente, double montoapagar){
        super(nombre,claveDeCliente);
        this.montoapagar = montoapagar;
    }

    public void nombre(){
        System.out.print("El nombre del cliente es: ");
    }

    public double totalaPagar(){
        if (montoapagar > 10000){
            return (montoapagar*0.02);
        }else {
            return montoapagar;
        }
    }
}
