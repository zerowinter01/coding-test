import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String[] game = new String[sc.nextInt()];
        
        for(int i = 0; i < game.length; i++) {
            game[i] = (i+1) + "";
            for(int j = 0; j < game[i].length(); j++) {
                char temp = game[i].charAt(j);
                if (temp == '3' || temp == '6' || temp == '9') {
                    game[i] = game[i].replace(String.valueOf(temp), "-"); 
                }
            }
            if(!game[i].equals("--") && game[i].contains("-")) {
            	game[i] = "-";
            }
            System.out.print(game[i] + " ");
        }
    }
}