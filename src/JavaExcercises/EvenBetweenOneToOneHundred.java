package JavaExcercises;

import Exceptions.InvalidUserInputException;

import java.util.Scanner;

public class EvenBetweenOneToOneHundred {

    public void Run() throws InvalidUserInputException {
        Scanner sc= new Scanner(System.in);
        try{
            int contador = 0;

            // Recorremos del 1 al 100
            for (int i = 1; i <= 100; i++) {

                // Verificamos si es par
                if (i % 2 == 0) {
                    System.out.println(i);
                    contador++;
                }
            }
        }
        catch(Exception e)
        {
            throw new InvalidUserInputException("Error: "+e);
        }
        finally{
            sc.close();
        }
    }
}
