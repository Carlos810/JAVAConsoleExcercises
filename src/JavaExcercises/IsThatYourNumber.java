package JavaExcercises;

import Exceptions.InvalidUserInputException;

import java.util.Scanner;

public class IsThatYourNumber  {

    public static void Run()  throws InvalidUserInputException {
        Scanner sc = new Scanner(System.in);
        try{
            // Generando un número aleatorio entre 1 y 50
            int numeroSecreto = (int) (Math.random() * 50) + 1;

            int intento;
            int contadorIntentos = 0;

            System.out.println("Adivina el número (entre 1 y 50)");

            // Bucle hasta que el usuario adivine el número
            while (true) {

                System.out.print("Ingresa tu número: ");
                intento = sc.nextInt();
                contadorIntentos++;

                if (intento > numeroSecreto) {
                    System.out.println("El número es MENOR");
                } else if (intento < numeroSecreto) {
                    System.out.println("El número es MAYOR");
                } else {
                    System.out.println("¡Correcto! Adivinaste el número.");
                    break; // Sale del bucle
                }
            }

            System.out.println("Intentos usados: " + contadorIntentos);
        }catch(Exception e){
                throw new InvalidUserInputException("Error: "+e);

        }finally{
            sc.close();
        }

    }
}
