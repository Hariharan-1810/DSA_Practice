// nqueens problem using recursion

import java.util.*;

public class nqueens {
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of queens: ");
        int n = scanner.nextInt();

        if (n > 3 && n < 10) {
            solveNQueens(n, new ArrayList<>());
            System.out.println("Total number of solutions: " + count);
        } else {
            System.out.println("Please enter a number between 4 and 9.");
        }
        scanner.close();
    }

    private static void solveNQueens(int n, List<Integer> queens) {
        if (queens.size() == n) {
            printSolution(queens);
            count++;
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isSafe(queens, i)) {
                queens.add(i);
                solveNQueens(n, queens);
                queens.remove(queens.size() - 1);
            }
        }
        return;
        }
        
    private static boolean isSafe(List<Integer> queens, int col) {
        int row = queens.size();
        
        for (int i = 0; i < row; i++) {
            int diffCol = Math.abs(col - queens.get(i));
            int diffRow = row - i;
            
            if (diffCol == 0 || diffRow == diffCol) {
                return false;
            }
        }
        
        return true;
        }
        
    private static void printSolution(List<Integer> queens) {
        int n = queens.size();
        
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (j == queens.get(i)) {
                    row.append("Q ");
                } else {
                    row.append("- ");
                }
            }
            System.out.println(row.toString());
        }
        System.out.println();
    }
    
} // end of class nqueens

