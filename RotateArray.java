import java.util.Arrays;;
public class RotateArray {
    //first method to rotate array
    public static void leftRotate(int []A, int a, int k){
        int c= k%a;
        int[] D = A.clone();
        rotateArr(D, 0, c-1);
        rotateArr(D, c, a-1);
        rotateArr(D, 0, a-1);
        System.out.print(Arrays.toString(D));
        System.out.println();

    }

    public static int[] rotateArr(int[] A, int start, int end){
        while(start < end){
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
        return A;
    }
    // second method to rotate left array
    public static void leftRotateArray(int A[], int n, int k){
        for(int i =k;i<n+k;i++){
          System.out.print(A[i%n] + " ");
           
        }
    }
     public static void main(String[] args) {
        int A[] = {1,3,5,7,9};
        int n= A.length;
        int k =2;
         leftRotate(A, n, k);
        //  k =3;
        // leftRotate(A, n, k);
        //  k =4;
        // leftRotate(A, n, k);

        leftRotateArray(A, n, k);
        

    }
}