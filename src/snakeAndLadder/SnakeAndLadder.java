package snakeAndLadder;

import java.util.*;

public class SnakeAndLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int position = 0;
		while (position != 100) {
			System.out.println("position is " + position);
			Random random = new Random();
			int dice_roll = (int) random.nextInt(6) + 1;
			System.out.println("Dice shows " + dice_roll);
			int position_roll = positionRoll();
			System.out.println("Play option is " + position_roll);
			position += dice_roll * position_roll;
			if(position<=0)
				position=0;
		}
	}

	private static int positionRoll() {
		Random random = new Random();
		int position_roll = (int) random.nextInt(3) - 1;
		return position_roll;
	}
}
