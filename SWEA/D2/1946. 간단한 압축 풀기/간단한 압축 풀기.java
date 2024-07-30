import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int size = sc.nextInt();
			String[] lan = new String[size];
			int[] cnt = new int[size];
			
			for (int i = 0; i<size; i++) {
				lan[i] = sc.next();
				cnt[i] = sc.nextInt();
			}
			
			int idx = 0;
			System.out.println("#" + test_case);
			while (cnt[size-1] != 0) {
				for(int i = 0; i<10; i++) {
					if(cnt[idx] != 0) {
						System.out.print(lan[idx]);
						cnt[idx]--;
					} else {
						if(idx != size-1) {
							idx += 1;
							System.out.print(lan[idx]);
							cnt[idx]--;
						} else break;
					}
				}
				System.out.println();
			}
		}
	}
}