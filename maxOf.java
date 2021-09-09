import java.util.Scanner;

public class maxOf {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
System.out.println(max(arr));


    }

    private static int max(int[] arr) {
  int maxNo=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maxNo){
                maxNo=arr[i];
            }
        }
        return maxNo;
}

}



