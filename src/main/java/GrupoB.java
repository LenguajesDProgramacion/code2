public abstract class GrupoB extends Cliente{
    public double montoapagar;

    public GrupoB(String nombre, int claveDeCliente, double montoapagar){
        super(nombre,claveDeCliente);
        this.montoapagar = montoapagar;
    }

    public void nombre(){
        System.out.print("El nombre del cliente es: ");
    }

    public double totalaPagar(){
        if (montoapagar > 10000){
            return (montoapagar*0.05);
        }else {
            return montoapagar;
        }
    }
}
