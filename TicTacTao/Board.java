import java.util.Scanner;

public class Board {

    private final int row = 3;
    private final int col = 3;
    PlayersStrategy player1;
    PlayersStrategy player2;

    String[][] grid = new String[row][col];

    Board() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                grid[i][j] = Symbols.Empty.toString();
            }
        }

        player1 = new HumanPlayer(Symbols.X);
        player2 = new HumanPlayer(Symbols.O);
    }

    void play() {
        Scanner scanner = new Scanner(System.in);
        int row = 0, col = 0;
    
        while (true) {
            // Player 1's turn
            System.out.println("Enter row and column (0-2) for player 1:");
    
            // Ensure player 1 makes a valid move
            while (true) {
                row = scanner.nextInt();
                col = scanner.nextInt();
    
                if (makeMove(row, col, player1.getSymbol())) {
                    System.out.println("Player 1 made a move.");
                    printBoard();
                    break; // exit the loop when the move is valid
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }
    
            // Check if Player 1 wins
            if (checkWin(player1.getSymbol())) {
                System.out.println("Player 1 wins!");
                break;
            }
    
            // Check if the board is full (draw)
            if (isBoardFull()) {
                System.out.println("It's a draw!");
                break;
            }
    
            // Player 2's turn
            System.out.println("\nEnter row and column (0-2) for player 2:");
    
            // Ensure player 2 makes a valid move
            while (true) {
                row = scanner.nextInt();
                col = scanner.nextInt();
    
                if (makeMove(row, col, player2.getSymbol())) {
                    System.out.println("\nPlayer 2 made a move.");
                    printBoard();
                    break; // exit the loop when the move is valid
                } else {
                    System.out.println("\nInvalid move. Try again.");
                }
            }
    
            // Check if Player 2 wins
            if (checkWin(player2.getSymbol())) {
                System.out.println("\nPlayer 2 wins!");
                break;
            }
    
            // Check if the board is full (draw)
            if (isBoardFull()) {
                System.out.println("It's a draw!");
                break;
            }
        }
    }
    

    private boolean makeMove(int row, int col, Symbols symbol) {
        if (row < 0 || row >= this.row || col < 0 || col >= this.col) {
            System.out.println("\nInvalid move. Try again.");
            return false;
        }
        if (grid[row][col].equals(Symbols.Empty.toString())) {
            grid[row][col] = symbol.toString();
            return true;
        } else {
            System.out.println("Cell already occupied. Try again.");
            return false;
        }

    }

    private void printBoard() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    private boolean checkWin(Symbols symbol) {
        // Check rows and columns
        for (int i = 0; i < row; i++) {
            if ((grid[i][0].equals(symbol.toString()) && grid[i][1].equals(symbol.toString())
                    && grid[i][2].equals(symbol.toString())) ||
                    (grid[0][i].equals(symbol.toString()) && grid[1][i].equals(symbol.toString())
                            && grid[2][i].equals(symbol.toString()))) {
                return true;
            }
        }

        // Check diagonals
        if ((grid[0][0].equals(symbol.toString()) && grid[1][1].equals(symbol.toString())
                && grid[2][2].equals(symbol.toString())) ||
                (grid[0][2].equals(symbol.toString()) && grid[1][1].equals(symbol.toString())
                        && grid[2][0].equals(symbol.toString()))) {
            return true;
        }

        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j].equals(Symbols.Empty.toString())) {
                    return false;
                }
            }
        }
        return true;
    }
}
