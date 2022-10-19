package lesson9.model;

import java.math.BigDecimal;

public abstract class Vector {

    public static final BigDecimal COS60 = BigDecimal.valueOf(0.5);
    public abstract BigDecimal getX();

    public abstract BigDecimal getY();

    public abstract BigDecimal getZ();

}
