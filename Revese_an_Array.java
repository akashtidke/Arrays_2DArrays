import java.util.Arrays;
import java.util.Scanner;

public class Revese_an_Array {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= scn.nextInt();
        }
        reverse(arr);
        display(arr);
//        System.out.println(Reverse(arr));
    }

    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] arr){
        // write your code here
        int left=0;
        int right=arr.length-1;
        while (left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            right--;
            left++;
        }




    }
}
