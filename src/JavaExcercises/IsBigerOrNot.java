package JavaExcercises;

import Exceptions.InvalidUserInputException;

import java.util.Scanner;

public class IsBigerOrNot {
    public void Result() throws InvalidUserInputException {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Ingresa el primer número: ");
            int a = sc.nextInt();

            System.out.print("Ingresa el segundo número: ");
            int b = sc.nextInt();

            System.out.print("Ingresa el tercer número: ");
            int c = sc.nextInt();

            // Verificamos si hay números iguales
            if (a == b || a == c || b == c) {
                System.out.println("Hay números iguales entre los valores ingresados");
                return;
            }

            // Usamos Math.max para encontrar el mayor
            int mayor = Math.max(a, Math.max(b, c));

            System.out.println("El número mayor es: " + mayor);

        }catch(Exception e){
            throw new InvalidUserInputException("Error: " + e);
        }finally {
            sc.close();
        }
    }

}
