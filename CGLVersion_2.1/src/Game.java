import java.util.Scanner;
/**
 * ****************Conways Game Of Life***********************************
 * Initially, there is a board with some cells which may be alive or dead. 
 * Task is to generate the next generation of cells based on the following rules: 
 *     
 * Rule 1: Any live cell with fewer than two live neighbors dies, as if caused by under
 * population. 
 * Rule 2:Any live cell with two or three live neighbors lives on
 * to the next generation. 
 * Rule 3: Any live cell with more than three live  neighbors dies, as if by overpopulation. 
 * Ruele 4: Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * 
 * Step 1 => find the no Of Neighbours that are alive; 
 * Step 2 => apply rules of game to get next genration by use the if conditions
 * to check all neighbors exluding it self as given video lecture
 * 
 * *************Rules of Life********************* 
 * Lonely cell will die ==> aliveNeighbours < 2 ;
 * Cell will die due to overpopulation ==> aliveNeighbours > 3 
 * A new cell will born ==> if currently dead cell have aliveNeighbours == 3
 */
public class Game {
	
	int kthgen;
//	public Game() {
//		
//	}
	Board b;
	/**
	 * 
	 * @param kthgen
	 */
	public Game(int kthgen) {
		this.kthgen=kthgen;
	}
		/**
	 * 
	 * @param args
	 */
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        // Reading size of the Board
	        int n = sc.nextInt();
	        
	        // Reading no. of initial live cells
	        int m = sc.nextInt();
	        int[][] l = new int[m][2];
	        int i = 0;
	        
	        // Reading Live cells
	        while (sc.hasNextInt()) {
	            l[i][0] = sc.nextInt();
	            l[i++][1] = sc.nextInt();
	        }
	        
	        // creating instance to CGLVersion2
	        Game c = new Game(1);
	        c.b= new Board(n,l);
	        c.b.createBoard(n,arr);
	        
	        // creating nextgenratin by calling nextgenration method
	        c.generateNextGeneration(c.Board(n, l));
	        sc.close();
	    }	
}


