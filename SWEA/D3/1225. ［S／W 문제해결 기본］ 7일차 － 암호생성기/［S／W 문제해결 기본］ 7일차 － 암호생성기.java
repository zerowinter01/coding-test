import java.util.*;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int test = sc.nextInt();
			List<Integer> list = new ArrayList<>();
			
			for(int i = 0; i<8; i++) {
				list.add(sc.nextInt());
			}
			
			w : while (true) {
				for (int i = 1; i<=5 ; i++) {
					if (list.get(0) - i > 0) {
						list.add(list.get(0)-i);
						list.remove(0);
					} else {
						list.add(0);
						list.remove(0);
						break w;
					};
				}
			}
			
			System.out.print( "#" + test_case + " ");
			
			for(int d : list) {
				System.out.print(d + " ");
			}
			System.out.println();
		}
	}
}