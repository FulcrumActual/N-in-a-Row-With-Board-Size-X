
public class InARowBoard {
    private String board = "";
    private String[][] input; //Up to 26 different input forms (26 players), A through Z
    private int numPlayer; //Class-Invariant: [2, +Infinity)
    private int boardSize; //Class-Invariant: [3, +Infinity)
    private int numInRow; //Class-Invariant: [3, this.boardSize]
    
    
    public InARowBoard(int numPlayer, int boardSize, int numInRow) {
        if (checkNumPlayer(numPlayer)) {
            this.numPlayer = numPlayer;
        } else {
            throw new IllegalArgumentException("Invalid number of players.");
        }
        if (checkBoardSize(boardSize)) {
            this.boardSize = boardSize;
        } else {
            throw new IllegalArgumentException("Invalid board size.");
        }
        if (checkNumInRow(numInRow)) {
            this.numInRow = numInRow;
        } else {
            throw new IllegalArgumentException("Illegal connected number.");
        }
        
        
    }
    
    public String process(String input) {
	if (input.toUpperCase().equals("QUIT")) {
            return "Game Over";
	}
	
	
	return "";
    }
    
    public String toString() {
	for (int row = 0; row < this.boardSize; row++) {
            this.board += "|";
            for (int column = 0; column < this.boardSize; column++) {
		this.board += " ";
            }
            this.board += "|\n";
	}
	
        return this.board;
    }
    
    public String toString(String[][] input) {
	
        
        return "";
    }
    
    public int getNumPlayer() {
	return this.numPlayer;
    }
    
	public int getBoardSize() {
		return this.boardSize;
	}
	
	public int getNumInRow() {
		return this.numInRow;
	}
	
	private boolean checkNumPlayer(int numPlayer) {
		return numPlayer >= 2;
	}
	
	private boolean checkBoardSize(int boardSize) {
		return boardSize >= 3;
	}
	
	//Pre-Condition: this.boardSize is set
	private boolean checkNumInRow(int numInRow) {
		return numInRow >= 3 && numInRow <= this.boardSize;
	}
}