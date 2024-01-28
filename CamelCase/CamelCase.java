package CamelCase;

import java.util.ArrayList;

public class CamelCase {

    //public String frase;

    public static boolean validaFrase(String entrada) {
        String frase = entrada;
        for(int i=0; i < frase.length(); i++){
            char c = frase.charAt(i);
            if( i == 1 && Character.isDigit(c)){
                return false;
            }
            else if(!Character.isLetterOrDigit(c)){
                return false;
            }
        }
            
        return true;
    }

    public static ArrayList<String> converterCamelCase(String original) {
        String frase = original;
        StringBuilder novaPalavra = new StringBuilder();
        ArrayList<String> camelCaseConvertido = new ArrayList<>();

        for(int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);
            //primeira condição pra formar nova palavra é ser UpperCase
            if(Character.isUpperCase(c)){
                if (novaPalavra.length()>0) {
                    camelCaseConvertido.add(novaPalavra.toString().toLowerCase());
                    novaPalavra.setLength(0);
                }
                
            }
            novaPalavra.append(c);
        }
        if(novaPalavra.length()>0){
            camelCaseConvertido.add(novaPalavra.toString().toLowerCase());

        }
        
        return camelCaseConvertido;

    }
   
}

