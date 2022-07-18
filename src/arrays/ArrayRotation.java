package arrays;

public class ArrayRotation {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5};

        rotateAnticlockwise(input, input.length, 1);
        for (int i: input) {
            System.out.print(i+" ");
        }

        System.out.println("");
        rotateClockwise(input, input.length, 2);
        for (int i: input) {
            System.out.print(i+" ");
        }


    }

    static void rotateAnticlockwise(int[] arr, int n, int d){
        //if d > n
        d = d % n;

        //if d is not a multiple of n then rotate
        if(d>0){
            for (int i = 0; i < d; i++) {
                int temp = arr[n-1];
                for (int j = n-1; j > 0; j--) {
                    arr[j] = arr[j-1];
                }
                arr[0] = temp;
            }
        }
    }

    static void rotateClockwise(int[] arr, int n, int d){
        //if d > n
        d = d % n;

        //if d is not a multiple of n then rotate
        if(d>0){
            for (int i = 0; i < d; i++) {
                int temp = arr[0];
                for (int j = 0; j < n-1; j++) {
                    arr[j] = arr[j+1];
                }
                arr[n-1] = temp;
            }
        }

    }
}
