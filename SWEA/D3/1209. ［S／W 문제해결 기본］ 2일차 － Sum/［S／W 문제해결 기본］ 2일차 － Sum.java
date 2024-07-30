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
            
            for(int i = 0; i<100; i++){
            	int temp = 0;
            	for(int j = 0; j<100; j++){
                	temp += arr[i][j];
                }
            	if(temp > row) row = temp;
            }
            
            // 세로 합 구하기 
            int col = 0;
            for(int i = 0; i<100; i++){
            	int temp = 0;
            	for(int j = 0; j<100; j++){
            		temp += arr[j][i];
                }
            	if(temp > row) row = temp;
            }
            
            // 대각선 합 구하기 
            int down = 0;
            int up = 0;
            
            for(int i = 0; i<100; i++){
            	down += arr[i][i];
            }
            for(int i = 99; i>=0; i--){
            	up += arr[i][i];
            }
            
            
            int result = Math.max(col, Math.max(row, Math.max(up, down)));
            
            System.out.println("#"+test_case+ " " + result);
            
            
		}
	}
}