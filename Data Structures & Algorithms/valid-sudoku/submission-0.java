class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[][] boxes = new HashSet[3][3];
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boxes[i][j] = new HashSet<>();
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char temp = board[i][j];
                if(temp == '.') continue;
                if (!rows[i].add(temp) || !cols[j].add(temp) || !boxes[i/3][j/3].add(temp)) {
                    return false;
                }
            }
        }
        return true;
    }
}
