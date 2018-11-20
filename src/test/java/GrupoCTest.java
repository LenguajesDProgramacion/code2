import org.junit.Test;

import static org.junit.Assert.*;

public class GrupoCTest {

    @Test
    public void totalaPagar() {
        Cliente cliente1 = new GrupoA("Raul",123,10500);
        Cliente cliente2 = new GrupoB("Sofia",456,2);
        Cliente cliente3 = new GrupoC("Andrea",789,20000);


        System.out.println(cliente1.totalaPagar());
        System.out.println(cliente2.totalaPagar());
        System.out.println(cliente3.totalaPagar());
    }
}