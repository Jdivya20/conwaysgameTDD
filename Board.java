/** 
 * 
 * @author divya
 *
 */
public class Board {
	/**
	 * @param args
	 */
	int boardsize;
	boolean[][]arr;
//	public Board(int n) {
//		boardsize=n;
//	}
	public Board(int n,int[][]l) {
		boardsize=n;
		this.arr=new boolean[n][n];
		for(int i=0;i<l.length;i++) {
			
			
			arr[l[i][0]][l[i][1]]=true;
		}
	}
	
//	 public String createBoard(int n, boolean arr[][]) {
//		 //StringBuffer sd = new StringBuffer();
//		 for(int i=0;i<this.arr.length;i++){
//		        for(int j=0;j<this.arr[i].length;j++) {
//		        	arr[i][j]=false;
//		        }
//		        }
//		 return arr.toString();
//	    }
	 public String displayBoard() {
		 StringBuffer sd = new StringBuffer();
			//boolean [][] board=new boolean[this.dim][this.dim];
			for(int i=0;i<this.arr.length;i++){
		        for(int j=0;j<this.arr[i].length;j++){
		            if(this.arr[i][j]){
		                //System.out.print("*");
		                sd.append("*");
		            }
		            else{
	                //System.out.print(".");
		            	sd.append(".");
		            }
		        } 	
			}
			return sd.toString();


		        	
		        }
		        
		 
	 }

