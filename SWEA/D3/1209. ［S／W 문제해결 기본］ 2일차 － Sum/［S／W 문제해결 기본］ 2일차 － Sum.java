import java.util.*;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int tcs = sc.nextInt();
            int[][] arr = new int[100][100];
            
            // 배열 선언 
            for(int i = 0; i<100; i++){
                for(int j = 0; j<100; j++){
                	arr[i][j] = sc.nextInt();
                }
            }
            
            // 가로 합 구하기 
            int row = 0;
            int col = 0;
            for(int i = 0; i<100; i++){
            	int rtemp = 0;
                int ctemp = 0;
            	for(int j = 0; j<100; j++){
                	rtemp += arr[i][j];
                    ctemp += arr[j][i];
                }
            	if(rtemp > row) row = rtemp;
                if(ctemp > col) col = ctemp;
            }
            
            // 대각선 합 구하기 
            int down = 0;
            int up = 0;
            
            for(int i = 0; i<100; i++){
            	down += arr[i][i];
      			up += arr[99-i][99-i];
            }            
            
            int result = Math.max(col, Math.max(row, Math.max(up, down)));
            
            System.out.println("#"+test_case+ " " + result);
            
            
		}
	}
}