/** 
 * 
 * @author divya
 *
 */
public class Cell {
	/**
	 * @param args
	 */
	int rows;
	int cols;
	boolean alive;

//	public Cell() {
//		
//	}
	/**
	 * 
	 * @param rows
	 * @param cols
	 */
	public Cell() {
		
	}
	public Cell(int rows,int cols) {
		this.rows=rows;
		this.cols=cols;
	}
	public Cell(int rows,int cols,boolean alive) {
		this.alive=alive;
		this.rows=rows;
		this.cols=cols;
	}
	public int rows(int rows) {
		return rows;
	}
	public int cols(int cols) {
		return cols;
	}
	/**
	 * 
	 * @param alive
	 * @return
	 * checks alive or not
	 */
	public boolean isAlive(boolean alive) {
		return alive;
	}
	public boolean [][] nextgen(boolean[][]board){
		return null;
	}
	
	public int countlivecells(int row,int col, boolean[][] board)
	{
	 int aliveNeighbours = 0;
	 if(board!= null)
	 {
	          for (int x = -1; x <= 1; x++){
	              for (int y = -1; y <= 1; y++)
	              {
	                 if(board[row+x][col+y])
	                 {
	                  aliveNeighbours++;
	                 }
	              }
	          }
	          if(board[row][col])
	          {
	              aliveNeighbours--;
	          }
	 }
	return aliveNeighbours;
	}
	
	
	
}
