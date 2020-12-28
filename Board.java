/** 
 * 
 * @author divya
 *
 */
public class Board {

	/**
	 * board size for n*n size
	 * a boolean array for board creation
	 */
	Cell cell=new Cell();
	int boardsize;
	boolean[][]arr;

	/**
	 * 
	 * @param n
	 * @param arr
	 * @return
	 * this method creates a board
	 */
	 public boolean createBoard(int n,int l[][]) {
		 if(n<=0) {
			 return false;
		 }
		 else {
			 if(l==null)
					return true;
			 boolean arr[][]=new boolean[n][n];
			 for(int i=0;i<l.length;i++){
			        for(int j=0;j<l[i].length;j++) {
			        	arr[i][j]=false;
			        }
			      }
			 for(int i=0;i<l.length;i++) {
					
					
					arr[l[i][0]][l[i][1]]=true;
				}
//			 System.out.println("NextGeneration");
//			 displayBoard(cell.nextgen(arr));
//			 System.out.println("CurrentGenration");
//			 displayBoard(arr); // prints current generation.
			 for(int i=0;i<=5;i++) // this loop is used to print five generations.
			 {
				 int count=0;
				 for(int k=0;k<n;k++) // checks whether the board is existed or not.
				 {
					 for(int j=0;j<n;j++) {
						 if(arr[k][j]==true)
							 count=1;
					 }
				 }
				 if(count==0)
					 break;
//	        System.out.println("NextGenration");
	        arr=cell.nextgen(arr);
	        displayBoard(arr); // prints next generation.
	        }
		
		       
		return true;
		 }
	 }
		 
	    
/*This display method used to display the created board*/
	 public String displayBoard(boolean[][]board) {
		if(board==null)
				return "Board printed";
		else {
		for(int i=0;i<board.length;i++){
		        for(int j=0;j<board[i].length;j++){
		            if(arr[i][j]==true){
		                System.out.print("*");
		                
		            }
		            else{
	                System.out.print(".");
		            	
		            }
		        } 
		        System.out.println("");
			}
			return " ";	
		}
		  }	 
}

