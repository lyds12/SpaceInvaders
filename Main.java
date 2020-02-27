
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main (String args[]){
		System.out.println("Space Invaders: The board has columns 0 to 9. Enter a number between 0 and 9.");
		
		Scanner reader = new Scanner(System.in);
		String turn;
		
		Alien alien = new Alien();
		Ship the_ship = new Ship();
		
		alien.createBoard();
		ArrayList<ArrayList<Integer>> board = alien.Board;
		
		the_ship.printBoard(board);
		
		while(true){ // Later on: replace true with non-winning condition (<400 points) so that it exits these steps when the game is over? Many ways to implement gameover part
			
			
			//alien.printBoard(); I used to call Stu's board but we're using Sanjita's now so maybe this can be made into a method since it is called in 3 different places and then I can call that method here instead
			System.out.print("Enter m for move or f for fire and S to check your score ");
			turn = reader.nextLine(); //prompt for what to do 
			
			
			if(turn.contentEquals("m") || turn.contentEquals("M") ){ //not case-sensitive :)
				int column = col_move(reader);
				the_ship.move(board, column); //return column of attack as an integer to move method in Ship class
			}
			
			else if(turn.contentEquals("f") || turn.contentEquals("F")){
				int column_fire = the_ship.fire(board); // invoke fire method (using previous number entered as the position..)
				alien.takeDamage(column_fire);
				the_ship.printBoard(board);
				
			}
		   
			if(turn.contentEquals("s") || turn.contentEquals("S")){
				int column_score = col_score1(null); // get number from attacked ships
				alien.takeDamage(column_score);

			}
			else {
				System.out.println("Invalid input. Try again. ");
				
			}
		
		}
	}
	
	public static int col_move(Scanner reader){
		while(true) {
			System.out.print("What column do you want to move to? ");
			
			int col_number = Integer.parseInt(reader.nextLine());
			
			if(col_number < 0 || col_number > 9) {
				System.out.println("That column does not exist. Please enter a column between 0 and 9.");
			}
			else {
				
			}
				return col_number; 
		}
	
}
	// Score Display
	
	public static int col_score1(Scanner score){
		while(true) {
			System.out.print("Your Score is");
			
			int col_number = Integer.parseInt(score.nextLine());
			
			if(col_number < 0 || col_number > 9) {
				System.out.println("That column does not exist. Please enter a column between 0 and 9.");
			}
			else {
				
			}
				return col_number; 
		}
	
}



	//get the score from the column_fire every time f is pressed it regesters the score
	
	public static int col_score(Scanner score){
		while(true) {
			
			int column_fire  = col_score1(score);
			
			if(column_fire  < 0 || column_fire  > 9) {
				System.out.println("That column does not exist. Please enter a column between 0 and 9.");
			}
			else {
				return column_fire;
				
			}
	
}

	}
	
	}
	
					
				
		
