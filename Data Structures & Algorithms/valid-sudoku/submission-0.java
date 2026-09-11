class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> set = new HashSet<>();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                if (board[row][col] == '.') {
                    continue;
                }

                char num = board[row][col];

                String rowCheck = num + " in row " + row;
                String colCheck = num + " in col " + col;
                String boxCheck = num + " in box " + (row / 3) + "-" + (col / 3);

                if (!set.add(rowCheck) ||
                    !set.add(colCheck) ||
                    !set.add(boxCheck)) {
                    return false;
                }
            }
        }

        return true;
    }
}