package lesson9;

import lesson9.model.Vector;
import lesson9.model.Vector2D;
import lesson9.model.Vector3D;
import lesson9.service.VectorService;
import lesson9.service.impl.Vector2DServiceImpl;
import lesson9.service.impl.Vector3DServiceImpl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vector vector2DFirst = new Vector2D(3, 4);
        System.out.println(vector2DFirst);
        Vector vector2DSecond = new Vector2D(3, 6);
        System.out.println(vector2DSecond);
        VectorService service = new Vector2DServiceImpl();
        System.out.println("VectorLength = " + service.calculateVectorLength(vector2DFirst));
        System.out.println("VectorLength = " + service.calculateVectorLength(vector2DSecond));
        System.out.println("ScalarProduct = " + service.calculateScalarProduct(vector2DFirst, vector2DSecond));
        System.out.println(service.calculateSumOfVectors(vector2DFirst, vector2DSecond ));
        System.out.println(service.calculateDifferenceOfVectors(vector2DFirst, vector2DSecond));
        System.out.println("ArrayOfRandomVector 2D : " + Arrays.toString(service.getArrayOfRandomVectors(5)));
        Vector vector3DFirst = new Vector3D(3, 4, 1 );
        System.out.println(vector3DFirst);
        Vector vector3DSecond = new Vector3D(3, 6,8);
        System.out.println(vector3DSecond);
        service = new Vector3DServiceImpl();
        System.out.println("VectorLength= " + service.calculateVectorLength(vector3DFirst));
        System.out.println("ScalarProduct= " + service.calculateScalarProduct(vector3DFirst, vector3DSecond));
        System.out.println(service.calculateSumOfVectors(vector3DFirst, vector3DSecond ));
        System.out.println(service.calculateDifferenceOfVectors(vector3DFirst, vector3DSecond));
        System.out.println("ArrayOfRandomVector 3D : " + Arrays.toString(service.getArrayOfRandomVectors(5)));


    }

}
