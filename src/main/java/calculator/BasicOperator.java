package calculator;

import java.util.Arrays;

public enum BasicOperator implements Operator {
    PLUS("+") {
        @Override
        public double apply(double x, double y) { return x + y; }
    },
    MINUS("-") {
        @Override
        public double apply(double x, double y) { return x - y; }
    },
    TIMES("*") {
        @Override
        public double apply(double x, double y) { return x * y; }
    },
    DIVIDE("/") {
        @Override
        public double apply(double x, double y) { return x / y; }
    };

    private final String operator;

    BasicOperator(String operator) {
        this.operator = operator;
    }

    public static double calculate(String operator, double x, double y) {
        return getOperator(operator).apply(x, y);
    }

    private static BasicOperator getOperator(String operator) {
        return Arrays.stream(values())
                .filter(o -> o.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 연산자가 아닙니다."));
    }
}
