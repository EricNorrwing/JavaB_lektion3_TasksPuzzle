package com.EricNorrwing.TasksPuzzle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calculator calc = new calculator();

        System.out.println("insert the first number");
        calc.a = scanner.nextInt();
        System.out.println("insert the second number");
        calc.b = scanner.nextInt();
        System.out.println("What do you want to do ? (+ - * /");

        var result = switch (scanner.next()){
            case "*" -> calc.multiplication();
            case "/" -> calc.division();
            case "+" -> calc.addition();
            case "-" -> calc.subtraction();
            default -> throw new
                    IllegalStateException("Unexpected value: ");
        };
        System.out.println(result);





    }


}
