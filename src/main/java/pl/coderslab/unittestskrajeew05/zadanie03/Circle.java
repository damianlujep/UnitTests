package pl.coderslab.unittestskrajeew05.zadanie03;

public class Circle {

    public double circleArea(double r){
        if (r < 0){
            throw new IllegalArgumentException("r must be greater than 0");
        }
        double area = Math.PI * Math.pow(r, 2);
        return (double) Math.round(area * 100) / 100;
    }

}
