package customMenuConsole;

import Exceptions.InvalidUserInputException;
import JavaExcercises.*;
import Saludo_Scanner.Greetings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Statics.Console_Methods.PrintMessage;

public class PrintOptions {
    public void Show(ArrayList<String> lista) throws InvalidUserInputException {
        if(lista.stream().count() == 0){
            PrintMessage("There is no element in this Array");
        }

        PrintMessage("Enter a valid menu option: ");
        for(int i = 0; i < lista.size() ; i++){
            PrintMessage("  ["+(i+1)+"] "+lista.get(i).toUpperCase());
        }

        String MenuOption = new Scanner(System.in).nextLine().trim();
        int numberOption = Integer.parseInt(MenuOption);

        switch(numberOption){
            case 1:
                Greetings.Excecute();
                break;
            case 2:
                new Calculator().ProcessNumbers();
                break;
            case 3:
                new ModuleOperator().OddOrEven();
                break;
            case 4:
                new IsBigerOrNot().Result();
                break;
            case 5:
                new OneTOFiniteNumber().PrintManyNumbers();
                break;
            case 6:
                new MatTables().Build();
                break;
            case 7:
                new EvenBetweenOneToOneHundred().Run();
                break;
            case 8:
                new AddAndPrint().Result();
                break;
            case 9:
                new IsThatYourNumber().Run();
                break;
            case 10:
                new InteractiveMenu().Run();
                break;
        }
    }
}
