import java.util.Scanner;

public class inverseArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int []ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int pos=arr[i];
            ans[pos]=i;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
