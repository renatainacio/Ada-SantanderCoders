import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Main {
    public static void main(String[] args) {
        Instant nowInstant = Instant.now();
        LocalDateTime nowDateTime;
        nowDateTime = LocalDateTime.ofInstant(nowInstant, ZoneId.systemDefault());
        System.out.println("Instant to DateTime:");
        System.out.println("Instant:       " + nowInstant);
        System.out.println("LocalDateTime: " + nowDateTime);

        System.out.println();
        System.out.println("DateTime to Instant:");
        LocalDateTime nowDateTime2 = LocalDateTime.now();
        Instant nowInstant2 = nowDateTime2.toInstant(ZoneId.systemDefault().getRules().getOffset(nowDateTime2));
        System.out.println("LocalDateTime: " + nowDateTime2);
        System.out.println("Instant:       " + nowInstant2);
    }
}