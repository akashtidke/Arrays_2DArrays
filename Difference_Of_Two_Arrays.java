import java.util.Scanner;

public class Difference_Of_Two_Arrays {
    public static void main(String[] args) {
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
        int[]ans=new int[n2];
        int borrow=0;
        int i=a1.length-1;
        int j=a2.length-1;
        int k=ans.length-1;

        while (k>=0){
            int sub=(a2[j]-borrow);
            if(i>=0){
                sub=sub-a1[i];
            }
            if(sub>=0){
                borrow=0;

            }else {
                borrow=1;
                sub+=10;
            }
            ans[k]=sub;
            i--;
            j--;
            k--;
        }
        for (int l = 0; l <ans.length ; l++) {
            if(l==0&&ans[0]==0){

            }else {
                System.out.println(ans[l]);
            }
        }
    }
}
