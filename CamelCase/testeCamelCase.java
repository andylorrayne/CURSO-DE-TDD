package CamelCase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class testeCamelCase {

    @Test
    public void validandoEntrada(){
         
        assertTrue(CamelCase.validaFrase("Andressa"));
        assertFalse(CamelCase.validaFrase("1111ansdd"));
        assertFalse(CamelCase.validaFrase("andr$ssaSil@"));   
    }

    @Test
    public void validandoSaida(){
        ArrayList<String> listaEsperada = new ArrayList<>(Arrays.asList("andressa","l","figueiredo"));
        ArrayList<String> listaAtual = CamelCase.converterCamelCase("AndressaLFigueiredo");
        assertEquals(listaEsperada, listaAtual);

        ArrayList<String> listaEsperada2 = new ArrayList<>(Arrays.asList("andressa","lorrayne","123", "cpfgg","lorrayne"));
        ArrayList<String> listaAtual2 = CamelCase.converterCamelCase("AndressaLorrayne123CPFGGLorrayne");
        //assertEquals(listaEsperada2, listaAtual2);
        
    }
       
}
