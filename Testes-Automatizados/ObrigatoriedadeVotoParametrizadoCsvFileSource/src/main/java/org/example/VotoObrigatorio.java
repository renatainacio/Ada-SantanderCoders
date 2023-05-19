package org.example;

public class VotoObrigatorio {
    public static String checarObrigatoriedade(int idade)
    {
        if (idade < 16)
            return("Sem direito a votar");
        else if (idade >= 18 && idade <= 70)
            return("Voto obrigatório");
        else
            return("Voto facultativo");
    }
}
