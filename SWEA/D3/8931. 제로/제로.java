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
            List<Integer> list = new ArrayList<>();
            int write = sc.nextInt();
			for (int i = 0; i<write; i++){
            	int call = sc.nextInt();
                if (call == 0) list.remove(list.size()-1);
                else list.add(call);
            }
            
            int result = 0; 
            if (list.size() != 0) {
            	for(int i = 0; i<list.size(); i++){
                	result += list.get(i);
                }
            } 
            
            System.out.println("#" + test_case + " " + result);

		}
	}
}