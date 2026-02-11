package JavaExcercises;

import Exceptions.InvalidUserInputException;

import java.util.Scanner;

public class MatTables {

    public void Build() throws InvalidUserInputException {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Ingresa un número para la tabla: ");
            int numero = sc.nextInt();

            System.out.print("¿Hasta qué número deseas multiplicar?: ");
            int limite = sc.nextInt();

            // Generamos tabla
            for (int i = 1; i <= limite; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }

        }catch(Exception e){
            throw new InvalidUserInputException("Error: "+e);
        }
        finally {
            sc.close();
        }
    }
}
