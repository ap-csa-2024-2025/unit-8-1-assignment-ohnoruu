import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int [][] matrix1 = { {8,7,5,8}, {1,3,9,5}, {3,4,6,2}};
    System.out.println(sumOfDiag(matrix1));
    System.out.println(productTable(6,5));
  }


  public static int sumOfDiag(int[][] matrix)
  {
    int sum=0;
    for (int i=0; i<matrix.length; i++){
      sum+=matrix[i][i];
    }
    return sum;
  }

  public static int[][] productTable(final int numRows, final int numCols)
  {
    int [][] table = new int[numRows][numCols];
    for (int row=0; row<numRows; row++){
      for (int col=0; col<numCols; col++){
        table[row][col] = row*col;
        System.out.print(row*col);
      }
      System.out.println();
    }
    return table;
  }
}
