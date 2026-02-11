package JavaExcercises;

import Exceptions.InvalidUserInputException;
import Statics.Console_Methods;

import java.util.Scanner;

import static Statics.Console_Methods.PrintMessage;

import polimorfism.*;

public class InteractiveMenu {
    public void Run() throws InvalidUserInputException{
        Scanner sc = new Scanner(System.in);
        try{
            int optionNumber = 0;

            do {
                optionNumber = showMenuAndCaptureOption(sc);
                if((optionNumber >= 1 && optionNumber <=3)){
                    //Ingresa 2 numeros
                    PrintMessage("Ingresa el 1° número: ");
                    Double firstNumber = Console_Methods.CatchNumber(sc.nextLine().trim());
                    PrintMessage("Ingresa el 2° número: ");
                    Double SecondNumber = Console_Methods.CatchNumber(sc.nextLine().trim());

                    if (firstNumber == 0 && SecondNumber == 0) {
                        throw new InvalidUserInputException("Ambos números no pueden ser cero");
                    }
                    //Operar aritmeticos
                    Double resp = 0.0;
                    String operationName = "";
                    switch(optionNumber){
                        case 1:
                            operationName = "Sumar";
                            resp = Calculate.execute(new Adition(),firstNumber,SecondNumber);
                            break;
                        case 2:
                            operationName = "Restar";
                            resp = Calculate.execute(new Subtraction(),firstNumber,SecondNumber);
                            break;
                        case 3:
                            operationName = "Multiplicar";
                            resp = Calculate.execute(new Multiplication(),firstNumber,SecondNumber);
                    }
                    String finalText = String.format("El resultado de %s , es: %.2f",operationName,resp);
                    PrintMessage(finalText);
                }else if(optionNumber == 4){
                    PrintMessage("Saliendo, hasta pronto");
                    break;
                }
                else{
                    PrintMessage("Ingresa un número válido");
                    break;
                }
            }while (optionNumber !=4);
        } catch (Exception e) {
            throw new InvalidUserInputException("Error: "+e.getMessage());
        }finally{
            sc.close();
        }
    }

    private int showMenuAndCaptureOption(Scanner sc){
        int result = 0;
        PrintMessage("Elige una opción: ");
        PrintMessage("1.Sumar números.");
        PrintMessage("2.Restar números.");
        PrintMessage("3.Multiplcar números.");
        PrintMessage("4.Salir.");


        String into = sc.nextLine().trim();
        result = Integer.parseInt(into);
        return result;
    }
}
