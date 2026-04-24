public class identity_matrix {
    public static void main(String[] args) {
        double[][] A = {
            {1,0,5},
            {9,6,4},
            {2,8,2}
        };
        for(int j=0; j<3;j++){
            A[2][j] = A[2][j] * (1.0/2);
        }
        for(int j=0;j<3;j++){
            A[2][j] = A[2][j] - A[0][j];
        }
        for(int j=0;j<3;j++){
            A[1][j] = A[1][j] - 9.0*A[0][j];
        }
        for(int j=0;j<3;j++){
            A[2][j] = A[2][j] * (1.0/4);
        }
        for(int j=0;j<3;j++){
            A[1][j] = A[1][j] * (1.0/6);
        }
        for(int j=0;j<3;j++){
            A[2][j] = A[2][j] - A[1][j];
        }
        for(int j=0;j<3;j++){
            A[2][j] = A[2][j] * (6.0/35);
        }
        for(int j=0;j<3;j++){
            A[0][j] = A[0][j] - 5.0*A[2][j];
        }
        for(int j=0;j<3;j++){
            A[1][j] = A[1][j] + (41.0/6)*A[2][j];
        }
        System.out.println("Your resultant matrix is:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}