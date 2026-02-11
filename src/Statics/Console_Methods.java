package Statics;

import Exceptions.InvalidUserInputException;
import Validations.InputsConsole;

import java.util.Scanner;


public class Console_Methods {

    public static String CatchStringInfoUser(String indicationMessage ) throws InvalidUserInputException {
        if(indicationMessage == null || indicationMessage.isEmpty())
            throw new InvalidUserInputException("Input cannot be empty");

        System.out.println(indicationMessage);
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public static Double CatchAgeNumber(String indicationMessage)throws InvalidUserInputException {
        if(indicationMessage == null || indicationMessage.isEmpty())
            throw new InvalidUserInputException("Indication Was not received");
        System.out.println(indicationMessage);

        Scanner sc = new Scanner(System.in);
        String numberCaptured = sc.next();
        boolean condition = InputsConsole.isNumeric(numberCaptured);
        if(!condition) throw new InvalidUserInputException("Capture a valid number");

        Double Age = Double.parseDouble(numberCaptured);
        if(Age <= 0 || Age >= 101) throw new InvalidUserInputException("Capture a valid age, between 1 to 100 years old");
        return Age;
    }

    public static Double CatchNumber(String numberToParse)throws InvalidUserInputException {
        if(numberToParse == null || numberToParse.isEmpty())
            throw new InvalidUserInputException("Indication Was not received");

        Double capturedNumber = 0.0;
        try{
            boolean condition = InputsConsole.isNumeric(numberToParse);
            if(!condition) throw new InvalidUserInputException("Capture a valid number");

            capturedNumber = Double.parseDouble(numberToParse);
            if(capturedNumber == 0 || capturedNumber == null) throw new InvalidUserInputException("Capture a valid number diferent to null or 0");
        } catch (Exception e) {
            throw new InvalidUserInputException("Error: "+e.getMessage());
        }
        return capturedNumber;
    }

    public static void PrintMessage(String message){
        System.out.println(message);
    }
}
