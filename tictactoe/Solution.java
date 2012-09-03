package tictactoe;

import java.util.Scanner;

public class Solution {

    static int calculate_bid(int player, int pos,int[] first_moves,int[] second_moves) {
    	
    	int player1 = 100;
    	int player2 = 100;
    	
    	for (int i = 0; i < first_moves.length; i++) {
			if(first_moves[i] > 0) {
				player1 -= first_moves[i];
			}
    	}
    	
    	for (int i = 0; i < second_moves.length; i++) {
    		if(second_moves[i] > 0) {
    			player2 -= second_moves[i];
    		}
    	}
    	
    	int bid = 1;
		
    	if(player == 1 && player1 >= player2) {
			bid = (int) (player1*0.30);
		}
    	else if (player == 1 && player1 < player2) {
			bid = (int) (player1*0.25);
		}
    	else if (player == 2 && player2 >= player1) {
			bid = (int) (player2*0.30);
		}
    	else if (player == 2 && player2 < player1){
			bid = (int) (player2*0.25);
		}
    	
    	if(bid <= 1) bid = 2;
        return bid;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int player = in.nextInt();                     //1 if first player 2 if second
        int scotch_pos = in.nextInt();                 //position of the scotch
        int bid = 0;                                   //Amount bid by the player
        int[]first_moves = new int[100];
        int[] second_moves = new int[100];
        in.useDelimiter("\n");
        String first_move = in.next();
        String[] move_1 = first_move.split(" ");
        String second_move = in.next();
        String[] move_2= second_move.split(" ");
        for (int i=0;i<move_1.length;i++) {
            first_moves[i] = Integer.parseInt(move_1[i]);
            second_moves[i] = Integer.parseInt(move_2[i]);
        }
        bid = calculate_bid(player,scotch_pos,first_moves,second_moves);
        System.out.print(bid);
    }
}
