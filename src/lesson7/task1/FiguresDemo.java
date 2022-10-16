package lesson7.task1;

import java.math.BigDecimal;

/**
 * 1. Написать иерархию классов «Фигуры».
 * Фигура -> Треугольник -> Прямоугольник -> Круг.
 * Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет
 * периметра.
 * Создать массив из 5 фигур.
 * Вывести на экран сумму периметра всех фигур в массиве.
 */

public class FiguresDemo {

    public static void main(String[] args) {
        Figure rectangle = new Rectangle(5, 8);
        System.out.println("Perimeter of restangle = " + rectangle.getPerimeter() + ", Area = " + rectangle.getArea());
        Figure triangleOne = new Triangle(5, 6, 8);
        System.out.println("Perimeter of triangle = " + triangleOne.getPerimeter() + ", Area = " + triangleOne.getArea());
        Figure triangleTwo = new Triangle(5, 6, 8);
        System.out.println("Perimeter of triangle = " + triangleTwo.getPerimeter() + ", Area = " + triangleTwo.getArea());
        Figure circleOne = new Circle(3);
        System.out.println("Perimeter of circle = " + circleOne.getPerimeter() + ", Area = " + circleOne.getArea());
        Figure circleTwo = new Circle(3);
        System.out.println("Perimeter of circle = " + circleTwo.getPerimeter() + ", Area = " + circleTwo.getArea());
        Figure[] arrayOfFigures = {rectangle, triangleOne, triangleTwo, circleOne, circleTwo};
        System.out.println("sumOfPerimeters = " + calculateSumOfPerimeters(arrayOfFigures));

    }

    private static BigDecimal calculateSumOfPerimeters(Figure[] arrayOfFigures) {
        BigDecimal sumOfPerimeters = BigDecimal.ZERO;
        for (Figure figure : arrayOfFigures) {
            sumOfPerimeters = sumOfPerimeters.add(figure.getPerimeter());
        }
        return sumOfPerimeters;
    }
}
