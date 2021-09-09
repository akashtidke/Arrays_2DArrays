import java.util.Arrays;
import java.util.Scanner;

public class swapArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int []arr={1,3,23,9,18};

swap(arr,1,4);
System.out.println(Arrays.toString(arr));




    }
    static  void swap(int []arr,int first,int second){
int temp=arr[first];
arr[first]=arr[second];
arr[second]=temp;
    }

}
