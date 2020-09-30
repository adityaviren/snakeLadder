package snakeAndLadder;

import java.util.*;

public class SnakeAndLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int position = 0,temp_position=0,no_of_rolls=0;
		while (position != 100) {
			no_of_rolls++;
			temp_position=position;
			System.out.println("position is " + position);
			Random random = new Random();
			int dice_roll = (int) random.nextInt(6) + 1;
			int position_roll = positionRoll();
			temp_position += dice_roll * position_roll;
			if(temp_position<=0)
				position=0;
			else if(temp_position>100) {}
			else
				position=temp_position;
		}
		System.out.println("player reached "+position+" in "+no_of_rolls+" turns.");
	}

	private static int positionRoll() {
		Random random = new Random();
		int position_roll = (int) random.nextInt(3) - 1;
		return position_roll;
	}
}
