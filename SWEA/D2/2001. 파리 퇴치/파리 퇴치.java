import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int size = sc.nextInt();
            int kill = sc.nextInt();
            int[][] map = new int[size][size];
            
            for(int i = 0; i<size; i++){
            	for(int j = 0; j<size; j++){
                	map[i][j] = sc.nextInt();
                }
            }
            
            int max = 0;
            
            for( int i = 0; i<=size - kill; i++){
                for(int l = 0; l<=size - kill; l++){
                	int temp = 0;
                    for(int j = 0; j<kill; j++){
                        for(int k = 0; k<kill; k++){
                            temp += map[i+j][l+k];
                        }
                    }
                    if (max < temp) max = temp;
                }
            }
			System.out.println("#" + test_case + " " + max);
		}
	}
}