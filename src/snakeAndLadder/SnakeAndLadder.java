package snakeAndLadder;

import java.util.*;
public class SnakeAndLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int position = 0;
		System.out.println("position is "+position);
		Random random=new Random();
		int dice_roll= (int) random.nextInt(6) +1;
		System.out.println("Dice shows "+dice_roll);
	}
}
