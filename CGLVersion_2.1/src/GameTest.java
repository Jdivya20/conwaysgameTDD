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
//	@Test
//	public void GameBoard() {
//		int[][] l = {{0,0},{1,1},{2,2},{2,0},{1,2}}; 
//		Board b1 = new Board(3,l); 
//		b1.displayBoard();
//		System.out.println(b1.displayBoard());
//		Assertions.assertEquals("*...***.*",b1.displayBoard());
//		}
	@Test
	 public void testCGLOne() {
	 Board b = new Board();
	 System.out.println("****TEST CASE FOUR EXECUTED ****");
	 System.out.println(b.displayBoard(null)); 
	 Assertions.assertEquals("Board printed",b.displayBoard(null));
	}

	 @Test
	 public void testCGLTwo() {
	 Board b = new Board();
	 System.out.println("****TEST CASE FIVE EXECUTED ****");
	 Assertions.assertSame(false,b.createBoard(-5,null));
	 
	 
	 }
	@Test
	 public void testCGLThree() {
	 Board b = new Board();
	 System.out.println("****TEST CASE SIX EXECUTED ****");
	 Assertions.assertSame(true,b.createBoard(5,null));
	 }
	@Test
	public void testCGLFour() {
		Board b = new Board();
		System.out.println("****TEST CASE SEVEN EXECUTED ****");
		int [][] l = {{1,1},{2,2},{3,3},{4,4}};
		Assertions.assertSame(true, b.createBoard(5,l));
	}
//	@Test
//	public void testNextgen() {
//		int l[][]= {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
//		Board b = new Board(10,l);
////		b.createBoard(10,);
//		b.displayBoard();
////		b.nextGen();
//		System.out.println("======NEXT GEN CASE EXECUTION=======");
//		System.out.println(g.nextGen(null));
//		Assertions.assertEquals(null,g.nextGen(null));
//	}


}
