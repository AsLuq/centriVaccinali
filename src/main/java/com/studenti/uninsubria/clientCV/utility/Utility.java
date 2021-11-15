package com.studenti.uninsubria.clientCV.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author luqmanasghar
 * @author Cristian Zuffellato
 */
public class Utility {

    public boolean isEmailValid (String email){
        String  EMAIL_PATTERN = ("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean isCFValid(String cf){
        String CF_PATTERN = ("^(?:[A-Z][AEIOU][AEIOUX]|[B-DF-HJ-NP-TV-Z]{2}[A-Z]){2}(?:[\\dLMNP-V]{2}(?:[A-EHLMPR-T](?:[04LQ][1-9MNP-V]" +
                "|[15MR][\\dLMNP-V]|[26NS][0-8LMNP-U])|[DHPS][37PT][0L]|[ACELMRT][37PT][01LM]|[AC-EHLMPR-T][26NS][9V])|(?:[02468LNQSU][048LQU]|" +
                "[13579MPRTV][26NS])B[26NS][9V])(?:[A-MZ][1-9MNP-V][\\dLMNP-V]{2}|[A-M][0L](?:[1-9MNP-V][\\dLMNP-V]|[0L][1-9MNP-V]))[A-Z]+$");
        Pattern pattern = Pattern.compile(CF_PATTERN);
        Matcher matcher = pattern.matcher(cf);
        return matcher.matches();
    }

    /**
     * Controlla che la lunghezza del civico non sia superiore a 5 caratteri.
     * Controlla che il civico non superi il 14159, che è il numero civico max italiano.
     * @param civico
     * @return boolean
     */

    public boolean isCivicoValid(String civico){
        if(civico.length() <= 5 && Integer.parseInt(civico) <= 14159){
            return true;
        }
        return false;
    }

    /**
     * controlla che la lunghezza della provincia sia di due caratteri ed inoltre che non vengano inseriti caratteri al di fuori di lettere
     * @return boolean
     */

    public boolean isProvinciaValid(String provincia){

        if(provincia.length() < 2 && provincia.matches("^[a-zA-Z]+$")){
            return true;
        }
        return false;
    }

    /**
     * Controlla se il cap è minore di 98168, in quanto numero di cap maggiore in Italia;
     * controlla se il cap è maggiore di 9, in quanto è il numero minore di cap presente in Italia;
     * Controlla se la sua lunghezza è uguale 5.
     *
     * @return boolean
     */

    public boolean isCapValid(String cap){
        if(Integer.parseInt(cap) < 98168 && Integer.parseInt(cap) > 9 && cap.length() == 5){
            return true;
        }
        return false;
    }

}
