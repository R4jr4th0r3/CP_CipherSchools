import java.util.*;

class SpiralMatrix{
	
	static void spiralMatrix(int re,int ce, int arr[][]){
		int i;
		int rs = 0;
		int cs = 0;
		while(rs < re && cs < ce){
			for(i=cs;i<ce;++i){
				System.out.print(arr[rs][i]+" ");
			}
			rs++;
			for(i = rs; i<re;++i){
				System.out.print(arr[i][ce-1]+" ");
			}
			ce--;
			if(rs < re){
				for(i = ce-1;i>=cs;--i){
					System.out.print(arr[re-1][i]+" ");
				}
				re--;
			}
			if(cs < ce){
				for(i = re-1;i>=rs;--i){
					System.out.print(arr[i][cs]+" ");
				}
				cs++;
			}
		}
	}



	public static void main(String[] args){
		int row = 4;
        int column = 4;
        int a[][] = { { 1, 2, 3, 4},
        			  { 5, 6, 7, 8},
                      { 9, 10, 11, 12},
                      { 13, 14, 15, 16}
                      };

                      spiralMatrix(row,column,a);
	}
}