package Validations;

public class InputsConsole {
    public static boolean isNumeric(String cadena) {
        Boolean IsNumber;
        try{
            Double number = Double.parseDouble(cadena); // Intenta convertir a double
            IsNumber = true;
        }catch (Exception e){
            IsNumber = false;
        }
        return IsNumber;
    }
}
