package Karat;

import java.util.HashSet;
import java.util.Set;

public class validSudoku {
	
	public boolean isValidSudoku(char[][] board) {
		int numRows = board.length;
		int numCols = board[0].length;
		int blocksPerRow = (int) Math.sqrt(numRows);
		int blocksPerCol = (int) Math.sqrt(numCols);

		Set<String> log = new HashSet<>();
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				char c = board[i][j];
				if (!Character.isDigit(c))
					continue;
				if (!log.add("R" + i + ":" + c) || !log.add("C" + j + ":" + c)
						|| !log.add(i / blocksPerRow + "," + j / blocksPerCol + ":" + c)) {
					return false;
				}
			}
		}
		return true;
	}
}
