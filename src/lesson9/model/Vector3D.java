package lesson9.model;

import java.math.BigDecimal;

public class Vector3D extends Vector {
    private final BigDecimal  z;
    private final BigDecimal x;
    private final BigDecimal y;
    private static final String DESCRIPTION_3D = "Это вектор для трехмерной системы координат";

    public Vector3D(final double x, final double y, final double z) {
        this.x = BigDecimal.valueOf(x);
        this.y = BigDecimal.valueOf(y);
        this.z = BigDecimal.valueOf(z);
    }

    public BigDecimal getX() {
        return this.x;
    }

    public BigDecimal getY() {
        return this.y;
    }

    public BigDecimal getZ() {
        return this.z;
    }

    public String toString() {
        return DESCRIPTION_3D + "с координатами: " +
                "x=" + this.x +
                ", y=" + this.y +
                ", z=" + this.z;
    }

}
