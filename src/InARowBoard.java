
public class InARowBoard {
    private String board = "";
    private String[][] input; //Up to 26 different input forms (26 players), A through Z
    private int numPlayer; //Class-Invariant: [2, +Infinity)
    private int boardSize; //Class-Invariant: [3, +Infinity)
    private int numInRow; //Class-Invariant: [3, this.boardSize]
    
    public InARowBoard(int numPlayer, int boardSize, int numInRow) {
        if (InARowBoard.checkNumPlayer(numPlayer)) {
            this.numPlayer = numPlayer;
        } else {
            throw new IllegalArgumentException("Invalid number of players.");
        }
        if (InARowBoard.checkBoardSize(boardSize)) {
            this.boardSize = boardSize;
        } else {
            throw new IllegalArgumentException("Invalid board size.");
        }
        if (InARowBoard.checkNumInRow(numInRow, boardSize)) {
            this.numInRow = numInRow;
        } else {
            throw new IllegalArgumentException("Illegal connected number.");
        }
        
        this.input = new String[this.boardSize][this.boardSize];
        this.board = InARowBoard.makeBoard(this.input);
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
    
    //Reinitialize board with known input
    private static String makeBoard(String[][] input) {
        
        
        return "";
    }
    
    private static boolean checkNumPlayer(int numPlayer) {
        return numPlayer >= 2;
    }
    
    private static boolean checkBoardSize(int boardSize) {
        return boardSize >= 3;
    }
    
    private static boolean checkNumInRow(int numInRow, int boardSize) {
        return numInRow >= 3 && numInRow <= boardSize;
    }
}
