package JavaExcercises;

import Exceptions.InvalidUserInputException;

import java.util.Scanner;

import static Statics.Console_Methods.PrintMessage;

public class AddAndPrint {

    public void Result() throws InvalidUserInputException {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        try{

            Double sum = 0.0;
            String option = "";

            if(counter == 1){
                System.out.println("Enter a number for sum");
                sum = sc.nextDouble();
                sc.nextLine();
                counter++;
                PrintMessage("value of sum is: "+sum);
            }

            while(sum > 0.0 && counter > 1){
                PrintMessage("Do you want to continue add a new number for accumulate it? (YES / NO)");
                option = sc.nextLine().trim().toUpperCase();

                switch(option){
                    case "YES" :
                        PrintMessage("Enter other number: ");
                        String number = sc.nextLine();
                        try{
                            sum += Double.parseDouble(number);
                            PrintMessage("value of sum is: "+sum);
                            counter++;
                        } catch (Exception e) {
                            PrintMessage("Error parsin text to decimal: "+e.getMessage());
                        }
                        break;
                    case "NO" :
                        PrintMessage("See you later, thanks for play today!");
                        sum = -1.0;
                        break;
                    default:
                        PrintMessage("enter a valid number, try again please ");
                        sum = -1.0;
                        break;
                }
            }
        }catch(Exception e){
            throw new InvalidUserInputException("Error: "+e.getMessage());
        }finally {
            sc.close();
        }
    }
}
