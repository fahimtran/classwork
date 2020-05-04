import java.util.Scanner;

/**
 * A Tic-Tac-Toe Solver class.
 */
public class TTTSolver {

    /**
     * The entry point for the program.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an initial board state " +
                           "using 9 consecutive characters. Valid "  +
                           "characters are X, O, and -.");
        String board = promptBoard(input);
        System.out.println("\nExisting outcomes: ");
        printAllBoards(board);
        
        System.out.print("\nEvaluate X or O? ");
        char player = input.next().charAt(0);
        System.out.println("\nWinning Boards: ");
        int winningBoards = countAllWinningBoards(board, player);

        System.out.println("\n" + player + " has " + winningBoards + " winning boards.");
    } // main

    /**
     * Prompt the user for a valid board configuration.
     * @param input an input scanner
     * @return the board configuration
     */
    public static String promptBoard(Scanner input) {
        String board = input.nextLine();
        while (!TTTUtility.validGame(board)) {
            System.out.println("Invalid board. Try again.");
            board = input.nextLine();
        } // while
        return board;
    } // promptBoard

    /**
     * Given an initial board state, this method prints
     * all board states that can be reached via valid
     * sequence of moves by each player. Therefore, the
     * printout includes both intermediate board states
     * as well as completed board states.
     *
     * @param board the game board
     */
    public static void printAllBoards(String board) {
        boolean checkWinner = TTTUtility.isWinner(board, 'X') || TTTUtility.isWinner(board, 'O');
        if (checkWinner || TTTUtility.isCat(board) == true) {
            System.out.println();
            TTTUtility.printSquare(board);
            System.out.println("\n--END--");
        } else {
            System.out.println();
            TTTUtility.printSquare(board);

            int[] indexes = new int[TTTUtility.count(board, '-')];
            int tempIndex = board.indexOf("-");
            indexes[0] = tempIndex;
            for (int i = 1; i < indexes.length; i++) {
                if (tempIndex >= 0 && tempIndex <= board.length() - 1) {
                    tempIndex = board.indexOf("-", tempIndex + 1);
                    indexes[i] = tempIndex;
                }
            }    

            String nextBoard = "";
            char nextTurn = TTTUtility.whoseTurn(board);
            for (int i = 0; i < indexes.length; i++) {
                nextBoard = board.substring(0, indexes[i]);
                nextBoard += nextTurn + board.substring(indexes[i] + 1);
                printAllBoards(nextBoard);
            }
        }
    } // printAllBoards

    public static int countAllWinningBoards(String board, char player) {
        int counter = 0;
        boolean isEnd = TTTUtility.isWinner(board, 'O') || TTTUtility.isWinner(board, 'X');
        isEnd = isEnd || TTTUtility.isCat(board);
        if (TTTUtility.isWinner(board, player)) {
            System.out.println();
            TTTUtility.printSquare(board);
            return 1;
        } else if (isEnd){
            return 0;
        } else {
            int[] indexes = new int[TTTUtility.count(board, '-')];
            int tempIndex = board.indexOf("-");
            indexes[0] = tempIndex;
            for (int i = 1; i < indexes.length; i++) {
                if (tempIndex >= 0 && tempIndex <= board.length() - 1) {
                    tempIndex = board.indexOf("-", tempIndex + 1);
                    indexes[i] = tempIndex;
                }
            }    

            String nextBoard = "";
            char nextTurn = TTTUtility.whoseTurn(board);
            for (int i = 0; i < indexes.length; i++) {
                nextBoard = board.substring(0, indexes[i]);
                nextBoard += nextTurn + board.substring(indexes[i] + 1);
                counter += countAllWinningBoards(nextBoard, player);
            }
        }
        return counter;
    } // countAllWinningBoards


} // TTTSolver
