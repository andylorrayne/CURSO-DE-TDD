import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TesteTradutor {

    private Tradutor t;

    @Before
    public void criarTradutor(){
        t = new Tradutor();
    }

    @Test
    public void tradutorSemPalavras(){
        assertTrue(t.estaVazio());
    }

    @Test
    public void umaTraducao(){
        t.adicionaTraducao("bom", "good");
        assertFalse(t.estaVazio());
        assertEquals("good",t.traduzir("bom"));
    }

    @Test
    public void duasTraducoes(){
        t.adicionaTraducao("bom", "good");
        t.adicionaTraducao("mau", "bad");
        assertEquals("good",t.traduzir("bom"));
        assertEquals("bad",t.traduzir("mau"));
    }

    @Test
    public void duasMesmaPalavraTraducoes(){
        t.adicionaTraducao("bom", "good");
        t.adicionaTraducao("bom", "nice");
        assertEquals("good, nice",t.traduzir("bom"));
       
    }

    @Test
    public void traduzirFrase(){
        t.adicionaTraducao("olá", "hello");
        t.adicionaTraducao("mundo", "world");
        assertEquals("hello world",t.traduzirFrase("olá mundo"));
    }


    @Test
    public void traduzirFraseComDuasTraducoesMesmaPalavra(){
        t.adicionaTraducao("paz", "peace");
        t.adicionaTraducao("é", "is");
        t.adicionaTraducao("bom", "good");
        t.adicionaTraducao("bom", "nice");
        assertEquals("peace is good",t.traduzirFrase("paz é bom"));
    }

}
