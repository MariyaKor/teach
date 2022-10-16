package lesson7.task1;

import java.math.BigDecimal;

public class Triangle extends Figure {

    private final BigDecimal firstSide;
    private final BigDecimal secondSide;
    private final BigDecimal thirdSide;
    private static final BigDecimal DIVISOR = BigDecimal.valueOf(2);

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = BigDecimal.valueOf(firstSide);
        this.secondSide = BigDecimal.valueOf(secondSide);
        this.thirdSide = BigDecimal.valueOf(thirdSide);
    }

    @Override
    public BigDecimal getPerimeter() {
        return this.firstSide.add(this.secondSide).add(this.thirdSide);
    }

    @Override
    public BigDecimal getArea() {
        BigDecimal semiPerimeter = this.getPerimeter().divide(DIVISOR);
        BigDecimal firstDifference = semiPerimeter.subtract(this.firstSide);
        BigDecimal secondDifference = semiPerimeter.subtract(this.secondSide);
        BigDecimal thirdDifference = semiPerimeter.subtract(this.thirdSide);
        double area = Math.sqrt((semiPerimeter.multiply(firstDifference).multiply(secondDifference).multiply(thirdDifference)).doubleValue());
        return BigDecimal.valueOf(area);
    }

}
