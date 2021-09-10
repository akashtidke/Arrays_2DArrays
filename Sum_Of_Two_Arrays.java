import java.util.Scanner;

public class Sum_Of_Two_Arrays {
    public static void main(String[] args) {
//     1. You are given a number n1, representing the size of array a1.
//2. You are given n1 numbers, representing elements of array a1.
//3. You are given a number n2, representing the size of array a2.
//4. You are given n2 numbers, representing elements of array a2.
//5. The two arrays represent digits of two numbers.
//6. You are required to add the numbers represented by two arrays and print the
//arrays.
        Scanner scn=new Scanner(System.in);
        int n1= scn.nextInt();

        int []a1=new int [n1];

        for (int i = 0; i < a1.length ; i++) {
            a1[i]=scn.nextInt();
        }
        int n2=scn.nextInt();
        int []a2=new int [n2];
        for (int i = 0; i <a2.length ; i++) {
a2[i]=scn.nextInt();
        }
        int maxSize=Math.max(n1,n2)+1;
        int []ansArr=new int [maxSize];
        int i=a1.length-1;
        int j=a2.length-1;
        int k=ansArr.length-1;
        int carry=0;
        while (k>=0){
            int sum=0;
            if(i>=0){
                sum+=a1[i];
            }if(j>=0){
                sum+=a2[j];
            }
            if(sum>10){
                carry=1;
                sum=sum-10;
            }else {
                carry=0;
            }
            ansArr[k]=sum;
            i--;
            j--;
            k--;
        }
        for( i=0;i<ansArr.length;i++){
            if(i==0&&ansArr[0]==0){

            }else{
                System.out.println(ansArr[i]);
            }

        }

    }

}