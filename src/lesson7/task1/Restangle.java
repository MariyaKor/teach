package lesson7.task1;

import java.math.BigDecimal;

public class Restangle extends Figure {
    private final  BigDecimal height;
    private final BigDecimal width;
    private static final BigDecimal MULTIPLIER = BigDecimal.valueOf(2);


    public Restangle(int height, int width) {
        this.height = BigDecimal.valueOf(height);
        this.width = BigDecimal.valueOf(width);
    }


    @Override
    public BigDecimal getPerimeter() {
        return MULTIPLIER.multiply(this.height.add(this.width));
    }

    @Override
    public BigDecimal getArea() {
        return this.height.multiply(this.width);
    }

}
