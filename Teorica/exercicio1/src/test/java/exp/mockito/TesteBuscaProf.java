package exp.mockito;
import org.junit.Test;
import exp.BuscaProf;
import exp.ProfConst;
import exp.Professor;
import exp.ServiceProf;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TesteBuscaProf {

    @Mock
    private ServiceProf service;
    private BuscaProf buscaProf;

    @Before
    public void setup(){
        buscaProf = new BuscaProf(service);
    }

    @Test
    public void testeBuscaProfA(){

        Mockito.when(service.busca(1)).thenReturn(ProfConst.A);

        Professor A = buscaProf.buscaProf(1);

        assertEquals("A",A.getNome());
        assertEquals("20:00", A.getHorario());
        assertEquals("noturno", A.getPeriodo());
    }

    @Test
    public void testeBuscaProfB(){
        Mockito.when(service.busca(2)).thenReturn(ProfConst.B);

        Professor B = buscaProf.buscaProf(2);

        assertEquals("B",B.getNome());
        assertEquals("10:00", B.getHorario());
        assertEquals("manha", B.getPeriodo());
    }

    @Test
    public void testeBuscaProfC(){
        Mockito.when(service.busca(3)).thenReturn(ProfConst.C);

        Professor C = buscaProf.buscaProf(3);

        assertEquals("C",C.getNome());
        assertEquals("17:00", C.getHorario());
        assertEquals("integral", C.getPeriodo());
    }

    @Test
    public void testeBuscaProfValido(){

        Mockito.when(service.profExistente(1)).thenReturn(true);

        boolean profValido = service.profExistente(1);

        assertTrue(profValido);
    }

    @Test
    public void testeBuscaProfInvalido(){

        Mockito.when(service.busca(0)).thenReturn(ProfConst.INEXISTENTE);

        Professor A = buscaProf.buscaProf(0);

        assertEquals("Inexistente", A.getNome());
        assertEquals(0, A.getHorario(), 0.1);
        assertEquals("Inexistente", A.getPeriodo());
    }

}
