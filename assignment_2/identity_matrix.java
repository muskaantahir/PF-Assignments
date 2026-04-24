package assignment_2;
public class identity_matrix {
    public static void main(String[] args) {
        double[][] A = {
            {1,0,5},
            {9,6,4},
            {2,8,2}
        };
        // R3 = R3*1/2
        for(int j=0; j<3;j++){
            A[2][j] = A[2][j] * (1.0/2);
        }
        // R3 = R3-R1
        for(int j=0;j<3;j++){
            A[2][j] = A[2][j] - A[0][j];
        }
        // R2 = R2 - 9R1
        for(int j=0;j<3;j++){
            A[1][j] = A[1][j] - 9.0*A[0][j];
        }
        // R3 = R3*1/4
        for(int j=0;j<3;j++){
            A[2][j] = A[2][j] * (1.0/4);
        }
        // R2 = R2*1/6
        for(int j=0;j<3;j++){
            A[1][j] = A[1][j] * (1.0/6);
        }
        // R3 = R3 - R2
        for(int j=0;j<3;j++){
            A[2][j] = A[2][j] - A[1][j];
        }
        // R3 = R3*6/35
        for(int j=0;j<3;j++){
            A[2][j] = A[2][j] * (6.0/35);
        }
        // R1 = R1 - 5R3
        for(int j=0;j<3;j++){
            A[0][j] = A[0][j] - 5.0*A[2][j];
        }
        // R2 = R2 + (41/6)*R3
        for(int j=0;j<3;j++){
            A[1][j] = A[1][j] + (41.0/6)*A[2][j];
        }
        //  print result 
        System.out.println("Your resultant matrix is:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}
