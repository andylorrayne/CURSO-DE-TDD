package CamelCase;

import java.util.ArrayList;
import java.util.stream.Collectors;

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
                    camelCaseConvertido.add(novaPalavra.toString());
                    novaPalavra.setLength(0);
                    //novaPalavra.append(c);
                    
                }
                
                
            }
            //novaPalavra.append(c);//adiciona o caracter atual na palavra nova            
            //condição que inicia a string numerica
            if (Character.isDigit(c)) {
                 if (novaPalavra.length() > 0) {
                    camelCaseConvertido.add(novaPalavra.toString());
                    novaPalavra.setLength(0);
                    
                }
                novaPalavra.append(c);

                while (i + 1 < frase.length() && Character.isDigit(frase.charAt(i + 1))) {
                    novaPalavra.append(frase.charAt(++i));
                }
                    
                //camelCaseConvertido.add(novaPalavra.toString());
                //novaPalavra.setLength(0);

                 
            }else{
                
                novaPalavra.append(c);
            }
                
        }
        if(novaPalavra.length()>0){
            camelCaseConvertido.add(novaPalavra.toString());

        }
        
        camelCaseConvertido = camelCaseConvertido.stream()
                                .map(String::toLowerCase)
                                .collect(Collectors.toCollection(ArrayList::new));

        return camelCaseConvertido;

    }
   
}


