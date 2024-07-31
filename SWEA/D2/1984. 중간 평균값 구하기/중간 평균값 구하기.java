import java.util.*;
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
            int[] arr = new int[10];
            for(int i = 0; i<10; i++){
            	arr[i] = sc.nextInt();
            }
            
            Arrays.sort(arr);
            int sum = 0;
            for(int i = 1; i<9; i++){
            	sum += arr[i];
            }
            
            System.out.println("#" + test_case + " " +(int)Math.round((double)sum/8));
		}
	}
}