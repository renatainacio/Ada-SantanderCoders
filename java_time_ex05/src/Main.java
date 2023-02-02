import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert the amount of seconds to be converted:");
        long second = input.nextLong();
        long secondAux = second;
        long day = second/86400;
        secondAux -= day * 86400;
        long hour = secondAux/3600;
        secondAux -= hour * 3600;
        long minute = secondAux/60;
        secondAux -= minute * 60;
        System.out.println(second + " seconds is equivalent to:");
        System.out.println(day + " days, " + hour + " hours, " + minute + " minutes, " + secondAux + " seconds.");

    }
}