import java.util.ArrayList;

public class Alien {
	//Initializing the Variables
	ArrayList<Integer> RowFull = new ArrayList<Integer>();
	ArrayList<Integer> RowEmpty = new ArrayList<Integer>();
	ArrayList<ArrayList<Integer>> Board = new ArrayList<ArrayList<Integer>>();
	
	//Creating the board
	public void createBoard(){
		//creating the row
		for (int i = 0; i < 10; i++) {
			RowFull.add(1);
			RowEmpty.add(0);
		}
		//adding the row to the board
		for (int x = 0; x <6;x++) {
			Board.add(new ArrayList<Integer>(RowEmpty));
		}
		for (int x = 0; x <4;x++) {
			Board.add(new ArrayList<Integer>(RowFull));
		}
	}
	public int takeDamage(int xPos) {
		//scans through the 2d array until it has found a 1 then replaces it with a 0
		for(ArrayList<Integer> x: Board) {
			if(x.get(xPos) == 1) {
				x.add(xPos, 0);
				x.remove(xPos+1);
				return 10;
			}
		}
		return 0;
	}
	//prints the rows of the board
	public void printBoard() {
		for(ArrayList<Integer> x: this.Board) {
			System.out.println(x);
		}
	}

}

