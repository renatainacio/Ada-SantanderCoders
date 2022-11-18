import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String[][] validationMatrix = new String[4][9];
        validationMatrix[0] = new String[]{"1", "7", "15", "16", "17", "71", "18", "45", "70"};
        validationMatrix[1] = new String[]{"Sem direito a votar", "Sem direito a votar", "Sem direito a votar",
                "Voto facultativo", "Voto facultativo", "Voto facultativo",
                "Voto obrigatório", "Voto obrigatório", "Voto obrigatório"};
        int i = 0;
        for (i = 0; i < 9; i++)
            validationMatrix[2][i] = (checkIdade(Integer.parseInt(validationMatrix[0][i])));
        for (i = 0; i < 9; i++) {
            if (validationMatrix[2][i].contentEquals(validationMatrix[1][i]))
                validationMatrix[3][i] = "Sucesso";
            else
                validationMatrix[3][i] = "Falhou";
        }
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";
        String color;
        for(i = 0; i < 9; i++) {
            if (validationMatrix[3][i].contentEquals("Sucesso"))
                color = ANSI_GREEN;
            else
                color = ANSI_RED;
            System.out.printf("Teste %d: | Idade: %s | Check: %s%s%s\n", i, validationMatrix[0][i],
                    color, validationMatrix[3][i], ANSI_RESET);
        }
        int countOk = 0;
        for (String item: validationMatrix[3])
        {
            if (item == "Sucesso")
                countOk++;
        }
        double successRate = (double)countOk / (double) validationMatrix[3].length;
        System.out.printf("\nResultado Final: O programa passou em %.2f%% (%d/%d) dos testes.\n\n", successRate*100,
                countOk, validationMatrix[3].length);
        if (successRate == 1)
            System.out.println("Testes executados com sucesso.");
        else {
            System.out.println("Os seguintes testes falharam:");
            for (i = 0; i < 9; i++) {
                if (validationMatrix[3][i] != "Sucesso") {
                    System.out.printf("Teste %d: - Resultado: %s - Correto: %s\n",
                            i, validationMatrix[2][i], validationMatrix[1][i]);
                }
            }
        }
    }
    private static String checkIdade (Integer idade) {
        return ((idade >= 18 && idade <= 70) ?  "Voto obrigatório" :
                ((idade >= 16 || idade > 70) ? "Voto facultativo" : "Sem direito a votar"));
    }
}