public  class GrupoA extends Cliente {
    public double montoapagar;

    public GrupoA(String nombre, int claveDeCliente, double montoapagar){
        super(nombre,claveDeCliente);
        this.montoapagar = montoapagar;
    }


    public double totalaPagar(){
         return (montoapagar >= 10000 ? montoapagar*0.9 : montoapagar);
    }
}
