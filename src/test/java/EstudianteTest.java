import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EstudianteTest {
    @Test
    public void estudiante(){
        Estudiante estudiante = new Estudiante("Raul", "Arispe",7970718, 27);
        Materia materia1 = new Materia("Ingles","123A", 55);
        Materia materia2 = new Materia("Lenguaje","123B", 98);
        Materia materia3 = new Materia("Fisica","123C", 87);

        List<Materia> m = new ArrayList<>();
        m.add(materia1);
        m.add(materia2);
        m.add(materia3);

        System.out.println(estudiante.getMateria("123B",m));
        Assert.assertEquals(("123C"+"\n"+"Fisica"+"\n"+87.0), estudiante.getMateria("123C",m));
    }

}