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
        ArrayList<String> listaEsperada = new ArrayList<>(Arrays.asList("andressa","l", "s","figueiredo"));
        ArrayList<String> listaAtual = CamelCase.converterCamelCase("AndressaLSFigueiredo");
        assertEquals(listaEsperada, listaAtual);

        ArrayList<String> listaEsperada2 = new ArrayList<>(Arrays.asList("ana","g" ,"125","luz","588"));
        ArrayList<String> listaAtual2 = CamelCase.converterCamelCase("AnaG125Luz588");
        assertEquals(listaEsperada2, listaAtual2);
        
    }
       
}
