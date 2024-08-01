import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ts = Integer.parseInt(br.readLine().trim());
		StringTokenizer st;
		
		for(int test_case = 1; test_case <= ts; test_case++)
		{	
			int[] cal = {0, 31, 28,  31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			
			
			int result = 0;
		
			st = new StringTokenizer(br.readLine());
			int	firstm = Integer.parseInt(st.nextToken());
			int	firstd = Integer.parseInt(st.nextToken());
			int	lastm = Integer.parseInt(st.nextToken());
			int	lastd = Integer.parseInt(st.nextToken());

			for(int i = firstm; i < lastm; i++) {
				result += cal[i];
			}
				
			if(firstd > lastd) result = result - (firstd - lastd) + 1 ;
			else if (firstd<lastd) result = result + (lastd - firstd) + 1; 
			
			
			System.out.println("#" + test_case + " " + result );
		}
	}
}