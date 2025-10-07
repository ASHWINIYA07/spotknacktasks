import java.util.Scanner;
public class diagnolsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of matrix");
        int n =sc.nextInt();
        int[][] array=new int[n][n];
        System.out.println("enter the elements of the matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                array[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=array[i][i];
        }                   
    }  
}
