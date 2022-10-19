package lesson9.service.impl;

import lesson9.model.Vector;
import lesson9.model.Vector2D;
import lesson9.service.VectorService;

import java.math.BigDecimal;

public class Vector2DServiceImpl implements VectorService {

    public BigDecimal calculateVectorLength(Vector v) {
        return BigDecimal.valueOf(Math.sqrt(Math.pow(v.getX().doubleValue(), 2) + Math.pow(v.getY().doubleValue(), 2)));
    }

    public BigDecimal calculateScalarProduct(Vector vectorFirst, Vector vectorSecond) {
        return calculateVectorLength(vectorFirst).multiply(calculateVectorLength(vectorSecond)).multiply(Vector.COS60);
    }

    public String calculateSumOfVectors(Vector vectorFirst, Vector vectorSecond) {
        return "SumOfVectors A and B = {" + vectorFirst.getX().add(vectorSecond.getX()) + "; " + vectorFirst.getY().add(vectorSecond.getY()) + "}";
    }

    public String calculateDifferenceOfVectors(Vector vectorFirst, Vector vectorSecond) {
        return "DifferenceOfVectors A and B = {" + vectorFirst.getX().subtract(vectorSecond.getX()) + "; " + vectorFirst.getY().subtract(vectorSecond.getY())+ "}";
    }

    public Vector[] getArrayOfRandomVectors(final int arraySize) {
        Vector[] vectors = new Vector[arraySize];
        for (int i = 0; i < arraySize; i++) {
            vectors[i] = new Vector2D(Math.random(), Math.random());
        }
        return vectors;
    }

}
