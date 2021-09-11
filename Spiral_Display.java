import java.util.Scanner;

public class Spiral_Display {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][]arr=new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=scn.nextInt();
            }
        }
      int rmin=0;
        int rmax=n-1;
        int cmin=0;
        int cmax=m-1;
        int count=0;

        while(count < n*m){

            //left
            for (int i = rmin; i <=rmax && count < n*m; i++) {
                System.out.println(arr[i][cmin]);
                count++;
            }
            cmin++;
            //bottom
            for (int i = cmin; i <=cmax && count < n*m; i++) {
                System.out.println(arr[rmax][i]);
                count++;
            }
           rmax--;
            //right
            for (int i = rmax; i >=rmin && count < n*m; i--) {
                System.out.println(arr[i][cmax]);
                count++;
            }
           cmax--;
            for (int i = cmax; i >=cmin && count < n*m; i--) {
                System.out.println(arr[rmin][i]);
                count++;
            }
            rmin++;
        }


    }
}
