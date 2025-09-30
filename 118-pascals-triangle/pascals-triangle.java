//class MyTriangle {
    //public int[][] generateArray(int numRows) {
      //  int[][] result = new int[numRows][];

       // for (int i = 0; i < numRows; i++) {
            //result[i] = new int[i + 1];


           // int j = 0;
           // while (j <= i) {
               // if (j == 0 || j == i) {
                   // result[i][j] = 1;
                //} else {
                    //result[i][j] = result[i - 1][j - 1] + result[i - 1][j];
                //}
              //  j++;
           // }
        //}
       /// return result;
  //  }
//}

//in this question we are putting the i and the last row as 1 and the next row i+1 greater than the current row and hence we can find the rest as result[i][j] = result[i-1][j-1] + result[i-1][j];
import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            int j = 0;
            while (j <= i) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
                j++;
            }

            result.add(row);
        }
        return result;
    }
}
