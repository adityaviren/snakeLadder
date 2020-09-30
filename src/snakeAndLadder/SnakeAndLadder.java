package snakeAndLadder;

public class SnakeAndLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int position_1 = 0, position_2 = 0, temp_change_position, temp_position, no_of_dice_rolls_1 = 0,no_of_dice_rolls_2=0;
		boolean toggle_player = true; // true means player 1
		while (position_1 != 100 && position_2 != 100) {
			if (toggle_player) {
				no_of_dice_rolls_1++;
				temp_position = position_1;
				temp_change_position = diceRoll() * positionRoll();
				temp_position += temp_change_position;
				if (temp_position <= 0)
					position_1 = 0;
				else if (temp_position > 100) {
				} else
					position_1 = temp_position;
				toggle_player = (temp_change_position >0) ? true : false ;
				System.out.println("Position of player 1 is "+position_1);
			}
			else {
				no_of_dice_rolls_2++;
				temp_position = position_2;
				temp_change_position = diceRoll() * positionRoll();
				temp_position += temp_change_position;
				if (temp_position <= 0)
					position_2 = 0;
				else if (temp_position > 100) {
				} else
					position_2 = temp_position;
				toggle_player = (temp_change_position >0) ? false : true ;
				System.out.println("Position of player 2 is "+position_2);
			}
		}
		String message = (position_1==100) ? "Player 1 " : "Player 2 ";
		System.out.println(message+" won the game in "+(no_of_dice_rolls_1+no_of_dice_rolls_2)+" dice rolls");
	}

	private static int positionRoll() {
		int pos_generator = (int) ((Math.random() * 30) % 3);
		int pos_roll;
		switch (pos_generator) {
		case 1:
			pos_roll = 1;
			break;
		case 2:
			pos_roll = -1;
			break;
		default:
			pos_roll = 0;
			break;
		}
		return pos_roll;
	}
	

}
