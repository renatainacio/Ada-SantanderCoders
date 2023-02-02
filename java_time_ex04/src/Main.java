import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        Instant instant1 = Instant.now();
        Instant instant2 = instant1.plusSeconds((int)(Math.random()*100));

        Duration duration = Duration.between(instant1, instant2);
        System.out.println("Seconds between instants: " + duration.toSeconds());
    }
}