package sample9.basic5;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class User {
    private static int idCounter = 1;

    private int id;
    private String firstName;
    private String familyName;
    private LocalDate birthDate;

    public User(String firstName, String familyName,LocalDate birthDate) {
        this.id = idCounter;
        this.firstName = firstName;
        this.familyName = familyName;
        this.birthDate = birthDate;

        idCounter++;
    }

    public String getName() {
        return String.format("%s %s", familyName, firstName);
    }

    public String getAge(LocalDate when) {
        return String.format("%s", ChronoUnit.YEARS.between(this.birthDate, when));
    }
}