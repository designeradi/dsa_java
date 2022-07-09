package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class SubArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,7,5);

        //approach 1
        System.out.println("result 1: " + subArraySum(list, list.size(), 12));

        //approach 2
        System.out.println("result 2: " + firstSubArraySum(list, list.size(), 12));
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

    static ArrayList<Integer> firstSubArraySum(List<Integer> arr, int n, int s){
        ArrayList<Integer> originalArr = new ArrayList<>(arr.size());
        originalArr.addAll(arr);
        ArrayList<Integer> subArr = new ArrayList<>();

    loop:   for (int i = 0; i < n; i++) {
                for(int size = 0; size < n - i; size++) {
                    int sum = getSubArrSum(originalArr, i, i+size);
//                    System.out.println(getSubArr(originalArr, i, size+i));
                    if(sum == s){
                        subArr = getSubArr(originalArr, i, size+i);
                        break loop;
                    }
                }
            }

        return subArr;
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

