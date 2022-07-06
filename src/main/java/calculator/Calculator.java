package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("식을 입력해주세요.");
        String input = sc.nextLine();
        String[] values = input.split(" ");

        double result = Double.parseDouble(values[0]);
        for (int i = 1; i < values.length / 2; i++) {
            String op = values[(i * 2) - 1];
            double num = Double.parseDouble(values[(i * 2)]);
            result = BasicOperator.calculate(op, result, num);
        }
        System.out.println(result);
    }
}