import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LavadoraTest {

    @Test
    public void getCapacidadMaxima() {
        Lavadora lavadora = new Lavadora("Samsumg","AG45","Blanco",45 ,15);

        Assert.assertEquals("exedio la capacidad maxima",lavadora.getCapacidadMaxima(20));
    }
}