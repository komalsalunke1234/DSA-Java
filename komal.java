
    import java.util.Scanner;

public class komal {

    // Directions for up, down, left, right (for movement in matrix)
    private static final int[] rowDir = {-1, 1, 0, 0};
    private static final int[] colDir = {0, 0, -1, 1};

    // Function to check if a cell is within bounds
    private static boolean isValid(int x, int y, int N) {
        return x >= 0 && x < N && y >= 0 && y < N;
    }

    // Function to perform Depth-First Search (DFS)
    private static double dfs(char[][] grid, int startX, int startY, int endX, int endY, int N, boolean[][] visited) {
        visited[startX][startY] = true;

        // If we reach the closing terminal, return resistance of 0 (end point)
        if (startX == endX && startY == endY) {
            return 0;
        }

        double currentResistance = 0;
        // Explore all 4 directions (up, down, left, right)
        for (int i = 0; i < 4; i++) {
            int newX = startX + rowDir[i];
            int newY = startY + colDir[i];
            if (isValid(newX, newY, N) && !visited[newX][newY]) {
                char currentChar = grid[newX][newY];
                if (currentChar == '-' || currentChar == '|') {
                    // Resistor found, traverse this path
                    double resistorResistance = 1;
                    currentResistance += resistorResistance + dfs(grid, newX, newY, endX, endY, N, visited);
                }
            }
        }

        return currentResistance;
    }

    // Find the equivalent resistance using DFS
    private static double findResistance(char[][] grid, int startX, int startY, int endX, int endY, int N) {
        boolean[][] visited = new boolean[N][N];
        return dfs(grid, startX, startY, endX, endY, N, visited);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Read the circuit matrix
        char[][] grid = new char[N][N];
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < N; j++) {
                grid[i][j] = line.charAt(j);
            }
        }

        // Find the opening and closing terminals
        int startX = -1, startY = -1, endX = -1, endY = -1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == '.') {
                    if (startX == -1) {
                        startX = i;
                        startY = j;
                    } else {
                        endX = i;
                        endY = j;
                    }
                }
            }
        }

        // Use DFS to find the circuit path and reduce the resistance
        double totalResistance = findResistance(grid, startX, startY, endX, endY, N);
        System.out.println((int) totalResistance);

        scanner.close();
    }
}

