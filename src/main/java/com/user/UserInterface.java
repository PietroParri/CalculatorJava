package main.java.com.user;
import main.java.com.service.OperationService;
import main.java.com.validation.Validation;

import java.util.Scanner;

public class UserInterface {
    OperationService _service = new OperationService();
    Validation _validation = new Validation();
    Scanner sc = new Scanner(System.in);

    //vars
    String input, x, y;
    float result;

    public void Program(){
        ShowOptions();
        OptionPick();
    }

    public void ShowOptions(){
        System.out.println("Calculator");
        System.out.println("(1) Sum");
        System.out.println("(2) Subtraction");
        System.out.println("(3) Multiplication");
        System.out.println("(4) Division");
        System.out.println("\n(0) Close application");
        System.out.println("Choose an option: ");
    }

    public void OptionPick(){
        input = sc.next();
        input = _validation.InputValidation(input);

        if (input.isEmpty())
            OptionPick();

        System.out.printf("Insert the first value: ");

        x = sc.next();
        while (_validation.Validate(x).isEmpty()){
            System.out.println("Input must be a number!");
            x = sc.next();
        }

        System.out.printf("Insert the second value: ");

        y = sc.next();
        while (_validation.Validate(y).isEmpty()){
            System.out.println("Input must be a number!");
            y = sc.next();
        }

        switch (input){
            case "1":
                result = _service.Sum(x,y);
                break;
            case "2":
                result = _service.Sub(x,y);
                break;
            case "3":
                result = _service.Multi(x,y);
                break;
            case "4":
                result = _service.Div(x,y);
                break;
        }

        System.out.println("The result of the operation is: " + result);
    }
}
