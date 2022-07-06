package arrays;

import java.util.Collection;

public class Arrays {

    public static void main(String[] args) {

        // primitive type arrays

        byte byteArraY[] = new byte[10];
        short shortArr[] = new short[20];
        int intArr[] ={2,2,3,3,4,3,23,2};
        long longArr[] = new long[34];
        double doubleArr[] = new double[4];
        char charArr[] = new char[12];
        float floatArr[] = new float[34];

        Object objs[] = new Object[20];

        CustomType customType[];
        Collection collection[];

        System.out.println(intArr.getClass());
        System.out.println(intArr.getClass().getSuperclass());
        System.out.println(getArrayOfLen(1).getClass());

    }

    static int[] getArrayOfLen(int len){
        return new int[len];
    }
}

class CustomType{}
