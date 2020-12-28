//import org.junit.jupiter.api.Assertions;
//
//import org.junit.jupiter.api.Test;
//
//
//class GameTest {
//
//	@Test
//	public void GameTestCols() {
//		Cell c = new Cell(1,1);
//		System.out.println("****TEST CASE ONE EXECUTED ****");
//		Assertions.assertEquals(1,c.cols(1));
//	   }
//	@Test
//	public void GameTestRows() {
//		Cell c = new Cell(2,3);
//		System.out.println("****TEST CASE TWO EXECUTED ****");
//		Assertions.assertEquals(2,c.rows(2));
//	   }
//	@Test
//	public void GameTestAlive() {
//		Cell c = new Cell(1,1,true);
//		System.out.println("****TEST CASE THREE EXECUTED ****");
//		Assertions.assertEquals(true,c.isAlive(true));
//	   }
//	
//	@Test
//	public void GameBoard() {
//		int[][] l = {{0,0},{1,1},{2,2},{2,0},{1,2}}; 
//		Board b1 = new Board(4,l); 
//		//b1.createBoard(4,l);
//		System.out.println("Current Generation");
//		System.out.println(b1.toString());
//		
//		Assertions.assertEquals("*...\n.**.\n*.*.\n....\n",b1.toString());
//		b1.nextgen();
//		System.out.println(b1.toString());
//		Assertions.assertEquals(".*..\n*.*.\n..*.\n....\n",b1.toString());
//		
//		}
//	@Test
//	public void GameBoard1() {
//		int[][] l = {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}}; 
//		Board b1 = new Board(10,l); 
//		//b1.createBoard(4,l);
//		System.out.println("Current Generation");
//		System.out.println(b1.toString());
//		
//		Assertions.assertEquals("..........\n...**.....\n....*.....\n..........\n..........\n"
//				+ "...**.....\n..**......\n.....*....\n....*.....\n..........\n",b1.toString());
//		b1.nextgen();
//		System.out.println(b1.toString());
//		Assertions.assertEquals("..........\n...**.....\n...**.....\n..........\n..........\n"
//				+ "..***.....\n..**......\n...**.....\n..........\n..........\n",b1.toString());
//	}
//
//}
