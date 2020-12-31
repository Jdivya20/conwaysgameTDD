package CGL2;
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
	
	int boardsize;
	boolean[][]arr;

	/**
	 * 
	 * @param n
	 * @param arr
	 * @return
	 * this method creates a board
	 */
	

	public Board(int boardsize, int l[][]) {
	    this.boardsize = boardsize ;
	    this.arr = new boolean[boardsize ][boardsize ];
	    for (int i = 0; i < arr.length; i++) {
	        for (int j = 0; j < arr.length; j++) {
	          arr[i][j] = false;
	        }
	      }
	    for (int k = 0; k < l.length; k++) {
	        arr[l[k][0]][l[k][1]]= true;
	      }
	    
	  }
//	public Board(int boardSizeHeight,filename) {
//		// TODO Auto-generated method stub
//		this.boardsize = boardSizeHeight ;
//	    this.arr = new boolean[boardsize ][boardsize ];
//		
//	}
	    
/*This display method used to display the created board*/
	 public String displayBoard(boolean[][] arr) {
		 String s = new String();
		for(int i=0;i<arr.length;i++){
		        for(int j=0;j<arr[i].length;j++){
		            if(arr[i][j]==true){
		               s+="*";
		                
		            }
		            else{
	                s+=".";
		            	
		            }
		        } 
		       s+="\n";
			}
		return s;
				
		  }	
	 public boolean [][] nextgen(){//this method display the next generation cells.
		    int n=arr.length;
	        boolean[][] nextgen=new boolean[n][n];
	        System.out.println("NextGenration");
	        
	        
	        for(int l=0;l<n;l++){
	            for(int m=0;m<n;m++){
	                int adjacentlife=0;
	            for(int i=-1;i<=1;i++){
	                for(int j=-1;j<=1;j++){
	                	if(l + i>=0 && l + i<this.boardsize && m + j>=0 && m + j<this.boardsize) {
	                	
	                    if(arr[l+i][m+j]){
	                        adjacentlife=adjacentlife+1;
	                    }
	                	}
	                }
	            }
	        
	                    if(arr[l][m]){
	                        adjacentlife=adjacentlife-1;
	                    }
	                    if((arr[l][m]==false)&&(adjacentlife==3)){
	                    nextgen[l][m]=true;
	                    }
	                    else if((arr[l][m]==true)&&(adjacentlife<2)){
	                    nextgen[l][m]=false;
	                    }
	                    else if((arr[l][m]==true)&&(adjacentlife>3)){
	                    nextgen[l][m]=false;
	                    }
	                    else
	                    nextgen[l][m]=arr[l][m];
	                }
	            }
	             
	       arr=nextgen;
	    
		
		
		return arr;
		
	}

		
}

