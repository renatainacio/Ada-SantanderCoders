import java.time.Duration;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime beginning = LocalDateTime.now();
        for (int i = 0; i < 1000; i++)
            System.out.println("Hello world!");
        LocalDateTime end = LocalDateTime.now();
        Duration executionTime = Duration.between(beginning, end);
        System.out.println("Execution time : " + executionTime.toMillis() + " milliseconds");
    }
}