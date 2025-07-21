
        //2d array question 

        //same box small column same row  the same  box then it is not called valid soduku
        // the basic formula is r/3 plus c/3 * 3 else condition then simply you have to contniue formward and return else and else then add in the hashmap;
        import java.util.HashMap;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        // HashMaps to store characters for each row, column and box
        HashMap<Integer, HashMap<Character, Boolean>> rows = new HashMap<>();
        HashMap<Integer, HashMap<Character, Boolean>> cols = new HashMap<>();
        HashMap<Integer, HashMap<Character, Boolean>> boxes = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            rows.put(i, new HashMap<>());
            cols.put(i, new HashMap<>());
            boxes.put(i, new HashMap<>());
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                
                if (ch == '.') continue;

                // Box index is calculated using (i / 3) * 3 + (j / 3)
                int boxIndex = (i / 3) * 3 + (j / 3);

                // Check for duplicates
                if (rows.get(i).containsKey(ch) || 
                    cols.get(j).containsKey(ch) || 
                    boxes.get(boxIndex).containsKey(ch)) {
                    return false;
                }

                // Mark as seen
                rows.get(i).put(ch, true);
                cols.get(j).put(ch, true);
                boxes.get(boxIndex).put(ch, true);
            }
        }
        return true;
    }
}
