package snakeAndLadder;

import java.util.*;

public class SnakeAndLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int position[] = new int[2];
		int no_of_rolls[] = new int[2];
		int temp_position,temp_change,dice_roll,position_roll,toggle=0; // 0 means player 1
		boolean toggle_player=false; // false means player 1
		while (position[0] != 100 && position[1] !=100) {
			no_of_rolls[toggle]++;
			temp_position=position[toggle];
			Random random = new Random();
			dice_roll = (int) random.nextInt(6) + 1;
			position_roll = (int) random.nextInt(3) - 1;
			temp_change=dice_roll*position_roll;
			temp_position += temp_change;
			if(temp_position<=0)
				position[toggle]=0;
			else if(temp_position>100) {}
			else
				position[toggle]=temp_position;
			System.out.println("Position of player "+(toggle+1)+" is "+position[toggle]);
			toggle_player = (temp_change > 0) ? toggle_player : !toggle_player;
			toggle=(toggle_player)? 1 : 0;
		}
		if(position[0]==100)
			System.out.println("Player 1 won the game in "+(no_of_rolls[0]+no_of_rolls[1]));
		else
			System.out.println("Player 2 won the game in "+(no_of_rolls[0]+no_of_rolls[1]));
	}
	
}
