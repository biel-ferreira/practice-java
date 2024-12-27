package je_25_java_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateSample {
    public static void main(String[] args) {
        LocalDate myAnniversary = LocalDate.of(2024,5,8);

        System.out.println(myAnniversary.getDayOfMonth());
        System.out.println(myAnniversary.getDayOfWeek());
        System.out.println(myAnniversary.getDayOfYear());
        System.out.println(myAnniversary.getMonth());
        System.out.println(myAnniversary.getYear());
        // .....

        String stringData = "2023-05-08";
        String stringDataBrazil = "08/05/2000";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate convertedStringFormatter = LocalDate.parse(stringDataBrazil, formatter);

        LocalDate convertedStringData = LocalDate.parse(stringData);

        LocalDate gabiAniverssary = LocalDate.of(2000, 5, 8);

        LocalDate NextYears = gabiAniverssary.plusYears(24);

        LocalDate PreviousYears = gabiAniverssary.minusYears(7);


        LocalDate dataOne = LocalDate.of(2024, 8, 5);
        LocalDate dataTwo = LocalDate.of(2023, 8, 5);
        System.out.println(dataOne.isAfter(dataTwo));
        System.out.println(dataOne.isBefore(dataTwo));
        System.out.println(dataOne.isEqual(dataTwo));

        DateTimeFormatter inverseConvertData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate anniversaryUSA = LocalDate.of(2000, 8, 5);

        String anniversaryConvertBR = inverseConvertData.format(anniversaryUSA);

        System.out.println(myAnniversary);
        System.out.println(convertedStringData);
        System.out.println(convertedStringFormatter);
        System.out.println(anniversaryConvertBR);

        System.out.println(gabiAniverssary);
        System.out.println(NextYears);
        System.out.println(PreviousYears);
    }
}
