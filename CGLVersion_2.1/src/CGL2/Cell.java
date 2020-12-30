package CGL2;
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

	/**
	 * 
	 * @param rows
	 * @param cols
	 */

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
	public boolean isAlive() {
		return alive;
	}

	
}