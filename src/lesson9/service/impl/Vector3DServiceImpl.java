package lesson9.service.impl;

import lesson9.model.Vector;

import lesson9.service.VectorService;

import java.math.BigDecimal;

public class Vector3DServiceImpl implements VectorService {
    public BigDecimal calculateVectorLength(Vector v) {
        return BigDecimal.valueOf(Math.sqrt(Math.pow(v.getX().doubleValue(), 2) + Math.pow(v.getY().doubleValue(), 2)) + Math.pow(v.getZ().doubleValue(), 2));


    }

    public BigDecimal calculateScalarProduct(Vector vectorFirst, Vector vectorSecond) {
        return null;
    }

    public String calculateSumOfVectors(Vector vectorFirst, Vector vectorSecond) {
        return "SumOfVectors A and B = {" + vectorFirst.getX().add(vectorSecond.getX()) + "; " + vectorFirst.getY().add(vectorSecond.getY()) + "; " + vectorFirst.getZ().add(vectorSecond.getZ()) + "}";
    }

    public String calculateDifferenceOfVectors(Vector vectorFirst, Vector vectorSecond) {
        return "DifferenceOfVectors A and B = {" + vectorFirst.getX().subtract(vectorSecond.getX()) + "; " + vectorFirst.getY().subtract(vectorSecond.getY()) + "; " + vectorFirst.getZ().subtract(vectorSecond.getZ()) + "}";
    }


}
