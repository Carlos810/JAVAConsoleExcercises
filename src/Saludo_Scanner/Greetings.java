package Saludo_Scanner;

import Exceptions.InvalidUserInputException;

import java.time.LocalDate;

import static Statics.Console_Methods.*;

public class Greetings {
    // We need to catch info user and show grettings by console
    public static void Excecute() throws InvalidUserInputException {
        String UserName = CatchStringInfoUser("Capture your Name: ");
        Double Edad = CatchAgeNumber("Capture your current age: ");

        int BirthYear = (LocalDate.now().getYear() - Edad.intValue());
        String Welcome = "Hi, "+UserName+", currently you are "+Edad+" years old, welcome to JAVA! and you was born in: "+BirthYear;
        PrintMessage(Welcome);
    }

}
