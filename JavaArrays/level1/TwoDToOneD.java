import java.util.Scanner;
public class TwoDToOneD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] mat=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int[] arr=new int[rows*cols];
        int k=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[k++]=mat[i][j];
            }
        }
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    }
}
