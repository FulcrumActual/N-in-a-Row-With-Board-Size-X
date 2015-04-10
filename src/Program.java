
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //Game parameters
        int numPlayer;
        int boardSize;
        int numInRow;
	InARowBoard board;
	
	//Input
	int move = 0;
	String lastInput = "";
	
	//Choose number of players
	System.out.println("Number of players?");
	numPlayer = console.nextInt();
	
	//Choose size of board
	System.out.println("Board size?");
	boardSize = console.nextInt();
	
	//Choose number in a row needed
	System.out.println("Number in a row needed?");
	numInRow = console.nextInt();
	
	//Initiate game with correct parameters
	board = new InARowBoard(numPlayer, boardSize, numInRow);
	
	while (!lastInput.toUpperCase().equals("QUIT")) {
            System.out.println(board);
            System.out.println("Player " + move % numPlayer + "'s turn:");
            move++;
            lastInput = console.next();
            
	}
	
	
	
	
	
	console.close();
    }
}
