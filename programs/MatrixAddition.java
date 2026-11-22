import java.util.*;
class MatrixAddition{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m,n;
        System.out.println("Enter the rows and coloumns");
        m = s.nextInt();
        n = s.nextInt();

        
         int[][] a=new int[m][n];
         int[][] b = new int[m][n];
         int[][] c = new int[m][n];

        System.out.println("Enter the elements of A matrix");
        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j] = s.nextInt();
            }
        }

        System.out.println("Enter the elements of B matrix");
        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                b[i][j] = s.nextInt();
                
            }
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                c[i][j] = a[i][j]+b[i][j];
            }
        }
        System.out.println("The sum of the A and B is");
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");
        }
        s.close();
    }
}
