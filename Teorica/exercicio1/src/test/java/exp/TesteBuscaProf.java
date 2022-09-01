package exp;

import org.junit.Before;
import org.junit.Test;

public class TesteBuscaProf {
    ServiceProf service;
    BuscaProf buscaProf;

    @Before
    public void setup(){
        service = new MockProfService();
        buscaProf = new BuscaProf(service);
    }

    //teste 1
    @Test
    public void testeBuscaProfA(){
        Professor A = buscaProf.buscaProf(1);

        assertEquals("A",A.getNome());
        assertEquals("20:00", A.getHorario());
        assertEquals("noturno", A.getPeriodo());
    }

    //teste2
    @Test
    public void testeBuscaProfB(){
        Professor B = buscaProf.buscaProf(2);

        assertEquals("B",B.getNome());
        assertEquals("10:00", B.getHorario());
        assertEquals("manha", B.getPeriodo());
    }

    //teste3
    @Test
    public void testeBuscaProfC(){
        Professor C = buscaProf.buscaProf(3);

        assertEquals("C",C.getNome());
        assertEquals("17:00", C.getHorario());
        assertEquals("integral", C.getPeriodo());
    }

    //teste 4
    @Test
    public void testeBuscaProfValido(){

        boolean profValido = buscaProf.verificaArrayListExistente(1);

        assertTrue(profValido);
    }

    //teste 5
    @Test
    public void testeBuscaProfValido(){

        boolean profValido = buscaProf.verificaArrayListExistente(2);

        assertTrue(profValido);
    }

    //teste 6
    @Test
    public void testeBuscaProfValido(){

        boolean profValido = buscaProf.verificaArrayListExistente(3);

        assertTrue(profValido);
    }

    //teste 7
    @Test
    public void testeBuscaProfInValido(){

        boolean profValido = buscaProf.verificaArrayListExistente(0);

        assertFalse(profValido);
    }

    //teste 8
    @Test
    public void testeBuscaProfInValido(){

        boolean profValido = buscaProf.verificaArrayListExistente(-5);

        assertFalse(profValido);
    }

    //teste 9
    @Test
    public void testeBuscaProfInValido(){

        boolean profValido = buscaProf.verificaArrayListExistente(1610);

        assertFalse(profValido);
    }
}
