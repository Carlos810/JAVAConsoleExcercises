package JavaExcercises;

import Exceptions.InvalidUserInputException;

import java.util.Scanner;

public class Calculator {

    public static void ProcessNumbers() throws InvalidUserInputException {
        Scanner sc = new Scanner(System.in);
        try{
            // Pedimos los números
            System.out.print("Ingresa el primer número: ");
            double a = sc.nextDouble();

            System.out.print("Ingresa el segundo número: ");
            double b = sc.nextDouble();

            // Menú de opciones
            System.out.println("Elige una operación:");
            System.out.println("1 - Suma");
            System.out.println("2 - Resta");
            System.out.println("3 - Multiplicación");
            System.out.println("4 - División");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + (a + b));
                    break;

                case 2:
                    System.out.println("Resultado: " + (a - b));
                    break;

                case 3:
                    System.out.println("Resultado: " + (a * b));
                    break;

                case 4:
                    if (b != 0) {
                        System.out.println("Resultado: " + (a / b));
                    } else {
                        System.out.println("Error: no se puede dividir entre cero");
                    }
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        }catch (Exception e){
            new InvalidUserInputException("Error: "+e);
        }finally{
            sc.close();
        }
    }
}
