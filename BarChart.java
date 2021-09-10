import java.util.Scanner;

public class BarChart {
//    1. You are given a number n, representing the size of array a.
//2. You are given n numbers, representing elements of array a.
//3. You are required to print a bar chart representing value of arr a.
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
//        System.out.println(max);
        for(int i=max;i>=1;i--){
            for(int j=0;j<arr.length;j++){
                if(i>arr[j]){
                    System.out.print("	");
                }else{
                    System.out.print("*	");
                }
            }
            System.out.println();
        }
    }
}
