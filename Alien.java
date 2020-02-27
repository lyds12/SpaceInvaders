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
		for (int x = 0; x <4;x++) {
			Board.add(new ArrayList<Integer>(RowFull));
		}
		for (int x = 0; x <6;x++) {
			Board.add(new ArrayList<Integer>(RowEmpty));
		}
		//default location of ship at Column 0 for gameplay
		ArrayList<Integer> RowShip = Board.get(Board.size() - 1);
		RowShip.set(0, 2);
	}
	

	public int takeDamage(int xPos) {
		//scans through the 2d array until it has found a 1 then replaces it with a 0
		//will remove the lowermost 1 
		for(int i = this.Board.size() - 1; i >= 0; i--){
			ArrayList<Integer> x = this.Board.get(i);
			if(x.get(xPos) == 1) {
				x.add(xPos, 0);
				x.remove(xPos+1);
				return 10;
			}
		}
		return 0;
	}
}
