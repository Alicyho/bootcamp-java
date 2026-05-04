public class Demo2DArr {
  public static void main(String[] args) {
    int[][] arr = new int[2][3];
    // 2 rows x 3 columns

    // First Row
    arr[0][0] = 100;
    arr[0][1] = 100;
    arr[0][2] = 100; 

    // Second Row
    arr[1][0] = 100;
    arr[1][1] = 100;
    arr[1][2] = 100; 

    int[][] arr2 = new int[][] {
      {100, 100, 100},
      {100, 100, 100},
    };

    // Print 
    // 2D Array -> arr.length -> number of rows
    // 2D Array -> arr[0].length -> number of columns of that row

    for (int i = 0; i < arr.length; i++) { // 0 - 1
      for (int j = 0; j < arr[i].length; j++) {
        System.out.println(arr[i][j]);
      }
    }

    // 3D Arr
    int[][][] arr5 = new int[2][3][4];
    // for loop i,j,k
  }
}