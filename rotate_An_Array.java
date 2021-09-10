import java.util.Scanner;

public class rotate_An_Array {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int [n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=scn.nextInt();


        }
        int k=scn.nextInt();
        rotate(arr, k);
        display(arr);
    }
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }
    public static void rotate(int[] a, int k){
        // write your code here
        k=k%a.length;
        if(k<0){
            k+=a.length;
        }
        reverse(a,0,a.length-1);
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
    }
    public static void reverse(int [] a, int i,int j){
        int left=i;
        int right=j;
        while(left<right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
    }
}
