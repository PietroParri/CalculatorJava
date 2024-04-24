package main.java.com.validation;
import java.util.Arrays;

public class Validation {
    int[] options = { 1, 2, 3, 4 };
    public String InputValidation(String input){
        if (isNumeric(input)){
            if (Arrays.binarySearch(options, Integer.parseInt(input)) >= 0)
                return input;
            else if (input.equals("0"))
                CloseApp();
        }

        System.out.println("Your input must be a valid number!");
        System.out.printf("Please, try again: ");

        return "";
    }

    public String Validate(String input){
        if (isNumeric(input)){
            return input;
        }
        else{
            return "";
        }
}

    public void CloseApp(){
        System.out.println("\u001B[31mThe application has been closed.\u001B[0m");
        System.exit(0);

        return;
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

}
