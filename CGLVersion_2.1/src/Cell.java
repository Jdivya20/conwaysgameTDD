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
	public boolean isAlive(boolean alive) {
		return alive;
	}
	
}
