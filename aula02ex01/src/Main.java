import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        String initialPhrase = input.next();
        String[] splitting = initialPhrase.split(",");
        for(String item : splitting)
            System.out.println(item.trim());
        String[][] splitMatrix = new String[splitting.length][2];
        int i;
        for(i = 0; i < splitting.length; i++)
            splitMatrix[i] = splitting[i].trim().split(": ");
        int soma = 0;
        for(i = 0; i< splitting.length; i++)
            soma += Integer.parseInt(splitMatrix[i][1]);
        System.out.println("Total: " + soma);
    }
}