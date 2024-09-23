import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for(int test_case = 1; test_case <= T; test_case++) {
			int[] boxes = new int[3];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < 3; i++) {
				boxes[i] = Integer.parseInt(st.nextToken());
			}
			
			int idx = 2;
			int cnt = 0;
			boolean flag = true;
			
			W : while(idx > 0) {
				if(boxes[idx] > boxes[idx-1]) {

				} else {
					int tmp = boxes[idx-1];
					if(boxes[idx] - 1 != 0) {
						boxes[idx-1] = boxes[idx]-1;
						cnt += tmp - boxes[idx-1];
					} else {
						flag = false;
						break W;
					}
				}
				
				idx--;
			}
			
			if(flag) System.out.println("#" + test_case + " " + cnt);
			else System.out.println("#" + test_case + " -1");
		}
		
	}
}