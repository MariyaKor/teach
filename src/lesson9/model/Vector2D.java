package lesson9.model;

import java.math.BigDecimal;

public class Vector2D extends Vector {
    private final BigDecimal x;
    private final BigDecimal y;

    private static final BigDecimal Z = null;


    private static final String DESCRIPTION_2D = "Это вектор для двумерной системы координат";

    public Vector2D(final double x, final double y) {
        this.x = BigDecimal.valueOf(x);
        this.y = BigDecimal.valueOf(y);
    }

    public BigDecimal getX() {
        return this.x;
    }

    public BigDecimal getY() {
        return this.y;
    }

    public BigDecimal getZ() {
        return Z;
    }
    public static Vector[] getArrayOfRandomVectors(final int arraySize) {
        Vector[] vectors = new Vector[arraySize];
        for (int i = 0; i < arraySize; i++) {
            vectors[i] = new Vector2D(Math.random(), Math.random());
        }
        return vectors;
    }

    @Override
    public String toString() {
        return DESCRIPTION_2D + " с координатами: " +
                "x=" + this.x +
                ", y=" + this.y;
    }
}
