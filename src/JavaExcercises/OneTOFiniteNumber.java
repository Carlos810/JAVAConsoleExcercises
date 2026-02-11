package JavaExcercises;

import Exceptions.InvalidUserInputException;

import java.util.Scanner;

public class OneTOFiniteNumber {

    public void PrintManyNumbers() throws InvalidUserInputException {
        Scanner sc= new Scanner(System.in);
        try{
            System.out.print("Ingresa un número N: ");
            int n = sc.nextInt();

            int suma = 0;

            // Bucle desde 1 hasta N
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
                suma += i;
            }

            System.out.println("La suma total es: " + suma);
        }
        catch(Exception e){
            throw new InvalidUserInputException("Error"+e);
        }finally{
            sc.close();
        }

    }
}
