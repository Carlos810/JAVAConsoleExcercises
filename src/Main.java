import Exceptions.InvalidUserInputException;
import customMenuConsole.PrintOptions;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvalidUserInputException {
        List<String> arrOpcions = List.of(
                "Greeting","Calculator","OddOrEven","IsBiggerOrNot","OneTO_N_Number","MatTables","1_To_100",
                "AddAndPrintNumbers","IsThatYourNumber","InteractiveMenu");
        new PrintOptions()
                .Show(new ArrayList<>(arrOpcions));
    }
}