import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for(int test_case = 1; test_case <= T; test_case++) {
			
			String text = br.readLine();
			int N = text.length();
			
			
			boolean flag = true;
			for(int i = 0; i < (N-1)/2; i++) {
				if(text.charAt(i) != text.charAt(N-1-i)) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				int hahalf = (N-1)/2;
				for(int i = 0; i < hahalf/2; i++) {
					if(text.charAt(i) != text.charAt(hahalf-1-i)) {
						flag = false;
						break;
					}
				}
				if(flag) {
					for(int i = 0; i < hahalf/2; i++) {
						if(text.charAt(hahalf + 1 + i) != text.charAt(N-1-i)) {
							flag = false;
							break;
						}
					}
				}
			}
			
			if(flag) System.out.println("#" + test_case + " YES");
			else System.out.println("#" + test_case + " NO");
		}
		
	}
}