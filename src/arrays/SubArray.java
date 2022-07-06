package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class SubArray {
    public static void main(String[] args) {
        List list = Arrays.asList(1,2,3,4,5,6,7,8);

        printAllSubArrays(list, list.size());
    }

    static void printAllSubArrays(List arr, int len){
        for (int size = 0; size < len; size++) {
            List arrayList;
            printMsg("subArr of size: " + (size+1));

            for (int j = 0; j < len-size; j++) {
                arrayList = getSubArr(arr, j, size+j);
                printArr(arrayList);
            }

        }
    }

    static ArrayList<Integer> getSubArr(List arr, int start, int end){
        ArrayList subArr = new ArrayList<Integer>();
        for (int i = start; i <= end; i++) {
            subArr.add(arr.get(i));
        }
        return subArr;
    }

    static void printMsg(String msg){
        System.out.println(msg);
    }

    static void printArr(List arr){
        System.out.println(arr);
    }
}
