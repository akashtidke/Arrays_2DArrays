import java.util.Scanner;

public class matrix_Multiplication {
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        int r1=scn.nextInt();
        int c1=scn.nextInt();
        int[][]f1=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                f1[i][j]=scn.nextInt();
            }
        }

        int r2=scn.nextInt();
        int c2=scn.nextInt();
        int[][]f2=new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                f2[i][j]=scn.nextInt();
            }
        }
        if(c1!=r2){
            System.out.println("Invalid input");
            return;
        }
        int [][]ans=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    ans[i][j]+=f1[i][k]*f2[k][j];
                }
            }
        }

        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

}