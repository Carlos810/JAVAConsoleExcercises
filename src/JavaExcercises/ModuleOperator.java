package JavaExcercises;

import Exceptions.InvalidUserInputException;

import java.util.Scanner;

public class ModuleOperator {

    public void OddOrEven() throws InvalidUserInputException {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Ingresa un número entero: ");
            int numero = sc.nextInt();

            // Verificamos si es par o impar
            if (numero % 2 == 0) {
                System.out.println("El número es par");
            } else {
                System.out.println("El número es impar");
            }

            // Verificamos el signo
            if (numero > 0) {
                System.out.println("El número es positivo");
            } else if (numero < 0) {
                System.out.println("El número es negativo");
            } else {
                System.out.println("El número es cero");
            }
        }catch(Exception e){
            new InvalidUserInputException("Error: "+e);
        }finally {
            sc.close();
        }
    }
}
