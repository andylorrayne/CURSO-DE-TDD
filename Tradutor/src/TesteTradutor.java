import static org.junit.Assert.*;


public class TesteTradutor {
    
    public void tradutorSemPalavras(){
        Tradutor t = new Tradutor();
        assertTrue(t.estaVazio());
    }
}
