package problems;

public class prob73 {
    public static void main(String[] args) {
        int [][] matrix={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
         setZeroes(matrix);

        }
        public static void setZeroes(int [][] matrix){
         int[] rows = new int[matrix.length];
         int[] cols = new int[matrix[0].length];
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
          if(matrix[i][j]==0){
             rows[i]=1;
             cols[j]=1;
           }
            }
         }
         

         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(rows[i]==1 || cols[j]==1){
                    matrix[i][j]=0;
                }
            }
         }
          

         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
         }


           
         }
        }
    
    


//not understand


// public static void setZeroes(int[][] matrix) {

//     boolean firstRowZero = false;
//     boolean firstColZero = false;

//     // Check first row
//     for(int j = 0; j < matrix[0].length; j++) {
//         if(matrix[0][j] == 0) {
//             firstRowZero = true;
//         }
//     }

//     // Check first column
//     for(int i = 0; i < matrix.length; i++) {
//         if(matrix[i][0] == 0) {
//             firstColZero = true;
//         }
//     }

//     // Create markers
//     for(int i = 1; i < matrix.length; i++) {
//         for(int j = 1; j < matrix[0].length; j++) {

//             if(matrix[i][j] == 0) {
//                 matrix[i][0] = 0;
//                 matrix[0][j] = 0;
//             }
//         }
//     }

//     // Use markers
//     for(int i = 1; i < matrix.length; i++) {
//         for(int j = 1; j < matrix[0].length; j++) {

//             if(matrix[i][0] == 0 || matrix[0][j] == 0) {
//                 matrix[i][j] = 0;
//             }
//         }
//     }

//     // First row
//     if(firstRowZero) {
//         for(int j = 0; j < matrix[0].length; j++) {
//             matrix[0][j] = 0;
//         }
//     }

//     // First column
//     if(firstColZero) {
//         for(int i = 0; i < matrix.length; i++) {
//             matrix[i][0] = 0;
//         }
//     }
// }
//         }
    
    

