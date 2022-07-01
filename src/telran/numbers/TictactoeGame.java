package telran.numbers;

public class TictactoeGame {
/**
 * 
 * @param matrix square matrix (nRows == nColumns; where nRows >= 3)
 * @param nRow (number of row)
 * @param nCol (number of column)
 * @param symb (being filled symbol either 'x' or '0')
 * @return 0 - game isn't over; 1 - game is over with the winner's move; 2 - game is over with draw
 */
	public static int tictactoeMove(char matrix[][], int nRow, int nCol, char symb) {
		matrix [nRow][nCol]=symb;
		int res=0;
		if(isInRowWin(matrix,nRow) || isInColumnWin(matrix,nCol) || isInDiogWin(matrix)) {
			res=1;
		}
		//if(isMatrixFull(matrix)) {
		//	res=2;
		
		return res;
	}
	public static boolean isInRowWin(char matrix[][], int nRow) {
		boolean isFullRow=true;
		for(int i=1; i<matrix.length; i++) {
			if(matrix[nRow][i-1]!=matrix[nRow][i]) {
				isFullRow=false;
			}
		}
		
		return isFullRow;
	}
	public static boolean isInColumnWin(char matrix[][],int nCol) {
		boolean isFullColumn=true;
		for(int i=1;i<matrix.length;i++) {
			if(matrix[nCol][i-1]!=matrix[nCol][i]) {
				isFullColumn=false;
			}
		}
		return isFullColumn;
	}
	public static boolean isInDiogWin(char matrix[][]) {
		boolean isFullDiog=true;
		for(int i=0;i<matrix.length;i++) {
			if(matrix[i][i]!=matrix[i+1][i+1]) {
				isFullDiog=false;
			}
			if(matrix[matrix.length-1-i][i]!=matrix[matrix.length-i][i-1]) {
				isFullDiog=false;
			}	
		}
		return isFullDiog;
	}
}