package lesson9.service;

import lesson9.model.Vector;

import java.math.BigDecimal;

public interface VectorService {

    BigDecimal calculateVectorLength(Vector vector);

    BigDecimal calculateScalarProduct(Vector vectorFirst, Vector vectorSecond);

    String calculateSumOfVectors(Vector vectorFirst, Vector vectorSecond);

    String calculateDifferenceOfVectors(Vector vectorFirst, Vector vectorSecond);

}
