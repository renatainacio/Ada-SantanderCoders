import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira uma data (dd/mm/aaaa): ");
        String inputDate1 = input.nextLine();
        System.out.println("Insira outra data (dd/mm/aaaa): ");
        String inputDate2 = input.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1 = LocalDate.parse(inputDate1, formatter);
        LocalDate date2 = LocalDate.parse(inputDate2, formatter);
        Period period = Period.between(date1, date2);
        System.out.println("A diferença entre as duas datas é de " +
                period.getYears() + "anos, " + period.getMonths() + "meses e " +
                period.getDays() + "dias");
    }
}