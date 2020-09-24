package snakeAndLadder;
import java.util.Scanner;
public class SnakeAndLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int position=0;
		diceRoll();
		positionRoll();
	}
	private static int diceRoll() {
		int random_generator = (int) ((Math.random()*60)%6);
		int dice_roll;
		switch (random_generator) {
		case 1:
			dice_roll=1;
			break;
		case 2:
			dice_roll=2;
			break;
		case 3:
			dice_roll=3;
			break;
		case 4:
			dice_roll=4;
			break;
		case 5:
			dice_roll=5;
			break;
		default :
			dice_roll=6;
			break;
		}
		return dice_roll;
	}
	private static int positionRoll() {
		int pos_generator = (int) ((Math.random()*30)%3);
		int pos_roll;
		switch (pos_generator) {
		case 1:
			pos_roll=1;
			break;
		case 2:
			pos_roll=-1;
			break;
		default :
			pos_roll=0;
			break;
		}
		return pos_roll;
	}

}
