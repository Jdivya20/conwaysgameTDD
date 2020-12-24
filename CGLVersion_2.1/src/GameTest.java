import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;


class GameTest {

	@Test
	public void GameTestCols() {
		Cell c = new Cell(1,1);
		System.out.println("****TEST CASE ONE EXECUTED ****");
		Assertions.assertEquals(0,c.cols(0));
	   }
	@Test
	public void GameTestRows() {
		Cell c = new Cell(1,1);
		System.out.println("****TEST CASE TWO EXECUTED ****");
		Assertions.assertEquals(0,c.rows(0));
	   }
	@Test
	public void GameTestAlive() {
		Cell c = new Cell(1,1,true);
		System.out.println("****TEST CASE THREE EXECUTED ****");
		Assertions.assertEquals(true,c.isAlive(true));
	   }
	@Test
	public void GameBoard() {
		int[][] l = {{0,0},{1,1},{2,2},{2,0},{1,2}}; 
		Board b1 = new Board(3,l); 
		b1.displayBoard();
		System.out.println(b1.displayBoard());
		Assertions.assertEquals("*...***.*",b1.displayBoard());
		}
	@Test
	public void testNextgen() {
		Game g = new Game(4);
		System.out.println("======NEXT GEN CASE EXECUTION=======");
		System.out.println(g.nextGen(null));
		Assertions.assertEquals(null,g.nextGen(null));
	}


}
