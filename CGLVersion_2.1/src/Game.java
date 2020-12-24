
public class Game {
	/**
	 * @param args
	 */
	int kthgen;
//	public Game() {
//		
//	}
	public Game(int kthgen) {
		this.kthgen=kthgen;
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
	public boolean[][]nextGen(boolean board[][]){
		  int n=board.length;
	        boolean[][] nextgen=new boolean[n][n];
	        System.out.println("NextGenration");
	        
	        for(int l=1;l<n-1;l++){
	            for(int m=1;m<n-1;m++){
	                int adjacentlife=0;
	            for(int i=-1;i<=1;i++){
	                for(int j=-1;j<=1;j++){
	                    if(board[l+i][m+j]){
	                        adjacentlife=adjacentlife+1;
	                    }
	                }
	            }
	        
	                    if(board[l][m]){
	                        adjacentlife=adjacentlife-1;
	                    }
	                    if((board[l][m]==false)&&(adjacentlife==3)){
	                    nextgen[l][m]=true;
	                    }
	                    else if((board[l][m]==true)&&(adjacentlife<2)){
	                    nextgen[l][m]=false;
	                    }
	                    else if((board[l][m]==true)&&(adjacentlife>3)){
	                    nextgen[l][m]=false;
	                    }
	                    else
	                    nextgen[l][m]=board[l][m];
	                }
	            }
	             
//	        for (int i = 0; i <board.length; i++) 
//	        { 
//	            for (int j = 0; j <board[i].length; j++) 
//	            { 
//	                if (nextgen[i][j] ==false) 
//	                    System.out.print("."); 
//	                else
//	        	            System.out.print("*"); 
//	            } 
//	            System.out.println(); 
//	        } 
	        return nextgen;
	
	}
}


