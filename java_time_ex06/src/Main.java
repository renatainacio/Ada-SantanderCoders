import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor insira a data de vacinação utilizando o padrão dd/mm/aaaa:");
        String dataVacina = input.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataVacina, formatter);
        LocalDate vacina;
        for (int i = 0; i < 3; i++) {
            vacina = data.plusMonths(i + 1);
            if (vacina.getDayOfWeek() == DayOfWeek.SATURDAY)
                vacina = vacina.minusDays(1);
            if (vacina.getDayOfWeek() == DayOfWeek.SUNDAY)
                vacina = vacina.plusDays(1);
            System.out.println(vacina.format(formatter) + " - " + vacina.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.getDefault()));
        }
    }
}