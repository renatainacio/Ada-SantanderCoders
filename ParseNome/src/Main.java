import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        String name = input.next();
        String[] arrayNomes = name.split(" ");
        for(String item : arrayNomes)
            System.out.printf("!%s ", item);
        System.out.println("\n");
    }
}