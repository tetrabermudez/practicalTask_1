package com.example.newServlet.logic;

public class Calculator {

    private static double firstNum;
    private static double secondNum;
    private static String operator;

    public double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public static double calculate(double x, double y, String operator) {
        double result = 0;

        if("+".equals(operator)){
            result = x + y;
        }else if("-".equals(operator)){
            result = x - y;
        }else if("*".equals(operator)){
            result = x * y;
        }else if("/".equals(operator)){
            result = x / y;
        }

        return result;
    }
}
