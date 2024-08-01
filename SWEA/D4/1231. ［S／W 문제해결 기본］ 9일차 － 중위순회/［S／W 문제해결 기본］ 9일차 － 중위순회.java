import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        for(int test_case = 1; test_case <= 10; test_case++)
		{
        	int size = Integer.parseInt(br.readLine().trim());
        	String[] word = new String[size];
        	String followmap = "";
        	
        	for(int i = 0; i<size; i++) {
        		st = new StringTokenizer(br.readLine());
        		String find = st.nextToken()+",";
        		word[i] = st.nextToken();
        		
        		String temp = find;
        		
        		if(st.hasMoreTokens()) {
	        		String f = st.nextToken()+",";
	        		if(st.hasMoreTokens()) {
	        			String b = st.nextToken()+",";
	        			temp = temp + b;
	        		}
	        		temp = f + temp;
        		}
        		
        		if(!followmap.contains(find)) {
        			followmap += find;
        		}
        		followmap = followmap.replace(find, temp);
        	}
        	
        	String[] map = followmap.split(",");
        	
        	System.out.print("#"+test_case + " ");
        	for(int i = 0; i<word.length; i++) {
        		System.out.print(word[Integer.parseInt(map[i]) - 1 ]);
        	}
        	
        	System.out.println();
        }
    }
}