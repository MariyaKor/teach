package lesson7.task1;

import java.math.BigDecimal;

public class Circle extends Figure {

    private final BigDecimal radius;
    private static final BigDecimal CONST_PI = BigDecimal.valueOf(Math.PI);
    private static final BigDecimal MULTIPLIER = BigDecimal.valueOf(2);

    public Circle(int radius) {
        this.radius = BigDecimal.valueOf(radius);
    }

    @Override
    public BigDecimal getPerimeter() {
        return radius.multiply(MULTIPLIER).multiply(CONST_PI);
    }

    @Override
    public BigDecimal getArea() {
        return BigDecimal.valueOf(Math.pow(this.radius.doubleValue(), 2)).multiply(CONST_PI);
    }

}
