package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class SubArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,7);

        System.out.print(subArraySum(list, list.size(), 12));
    }

    static ArrayList<Integer> subArraySum(List<Integer> arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer> intList = new ArrayList<>(arr.size());
        ArrayList<Integer> arrayList = new ArrayList<>();

        intList.addAll(arr);
        loop: for (int size = 0; size < n; size++) {
            for (int j = 0; j < n-size; j++) {
                int sum = getSubArrSum(intList, j, size+j);
                if(sum == s){
                    arrayList = getSubArr(intList, j, size+j);
                    break loop;
                }
            }
        }
        return arrayList;
    }

    static int getSubArrSum(ArrayList<Integer> arr, int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    static ArrayList<Integer> getSubArr(ArrayList<Integer> arr, int start, int end){
        ArrayList<Integer> subArr = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            subArr.add(arr.get(i));
        }
        return subArr;
    }

}

