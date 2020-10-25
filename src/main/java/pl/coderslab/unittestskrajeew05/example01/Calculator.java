package pl.coderslab.unittestskrajeew05.example01;

public class Calculator {
    public double add(double a, double b){
        return a+b;
    }

    public double subtract (double a, double b){
        return a-b;
    }

    public double multiply(double a, double b){
        return a*b;
    }

    public double divide(double a, double b){
        if (Math.abs(b)<.000000001){
            throw new IllegalArgumentException("Division by zero");
        }

        return a/b;
    }

    public boolean graterDouble(double a , double b, double delta){
        return a - b > delta;
    }

    public boolean greater(int a, int b){
        return a>b;
    }
}
