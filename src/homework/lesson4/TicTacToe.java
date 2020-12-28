package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final int SIZE = 3;
    private static final char[][] map = new char[SIZE][SIZE];

    private static final char DOT_EMPTY = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';

    public static final Scanner SCANNER = new Scanner(System.in);


    public static void main(String[] args) {
        initializeGame();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkEndGame(DOT_X)) {
                break;
            }

            computerTurn();
            printMap();
            if (checkEndGame(DOT_O)) {
                break;
            }
        }
    }

    private static boolean checkEndGame(char symbol) {
        if (checkWin(symbol)) {
            System.out.println(isHumanTurn(symbol) ? "Человек победил!" : "Машина победила!");
            return true;
        }
        if (isMapFull()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    private static boolean isMapFull() {
        for (char[] row : map) {
            for (char cellValue : row) {
                if (cellValue == DOT_EMPTY) {
                    return false;
                }
            }
        }

//        for (int rowIndex = 0; rowIndex < map.length; rowIndex++) {
//            char[] row = map[rowIndex];
//            for (int colIndex = 0; colIndex < row.length; colIndex++) {
//                if (row[colIndex] == DOT_EMPTY) {
//                    return false;
//                }
//            }
//        }

        return true;
    }

    private static boolean checkWin(char symbol) {
        //check rows
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j <SIZE - 1; j++) {
                if (map[i][j] == map[i][j+1] && map[i][j] != DOT_EMPTY) {
                   // return true;
                    if(map[i][0] == map[i][SIZE-1]){
                        return true;
                    }
                }
            }
        }
        for (int i = 0; i < SIZE - 1; i++) {
            for (int j = 0; j <SIZE; j++) {
                if (map[i][j] == map[i+1][j] && map[i][j] != DOT_EMPTY) {
                    // return true;
                    if(map[0][j] == map[SIZE-1][j]){
                        return true;
                    }
                }
            }
        }
        for (int i = 0; i < SIZE - 1; i++) {
            for (int j = 0; j <SIZE - 1; j++) {
                if (map[i][j] == map[i+1][j+1] && map[i][j] != DOT_EMPTY) {
                    // return true;
                    if(map[i][j] == map[SIZE - 1][SIZE-1]){
                        return true;
                    }
                }
            }
        }
        for (int i = 0, j = SIZE-1; i < SIZE - 1 && j >= 0; i++, j--) {
            if (map[i][j] == map[i+1][j-1] && map[i][j] != DOT_EMPTY && map[SIZE-1][0] == map[0][SIZE-1]) {
                return true;
            }
        }
       //if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) return true;
       //if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) return true;
       //if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) return true;

        // check columns
      //if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) return true;
      //if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) return true;
      //if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) return true;

        // check diagonals
       // if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) return true;
       // if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) return true;

        return false;
    }

    private static void humanTurn() {
        int rowIndex = -1;
        int colIndex = -1;

//        String data = SCANNER.nextLine();//1-3
//        String[] parts = data.split("-");
//        int rowIndex = Integer.parseInt(parts[0]) - 1;
//        int colIndex = Integer.parseInt(parts[1]) - 1;

        do {
            System.out.print("Введите номер строки: ");
            if (!SCANNER.hasNextInt()) {
                SCANNER.nextLine();
                System.out.println("Введите число!");
                continue;
            }
            rowIndex = SCANNER.nextInt() - 1;

            System.out.print("Введите номер столбца: ");
            if (!SCANNER.hasNextInt()) {
                SCANNER.nextLine();
                System.out.println("Введите число!");
                continue;
            }
            colIndex = SCANNER.nextInt() - 1;
        } while (!isCellValid(rowIndex, colIndex, DOT_X));

        map[rowIndex][colIndex] = DOT_X;
    }

    private static void computerTurn() {
        int rowIndex = -1;
        int colIndex = -1;
        Random rand = new Random();
        do {
            rowIndex = rand.nextInt(SIZE);
            colIndex = rand.nextInt(SIZE);
        } while (!isCellValid(rowIndex, colIndex, DOT_O));

        map[rowIndex][colIndex] = DOT_O;
    }

    private static boolean isCellValid(int rowIndex, int colIndex, char symbol) {
//        return isArrayIndexValid(rowIndex) && isArrayIndexValid(colIndex) && map[rowIndex][colIndex] == DOT_EMPTY;
        if (!isArrayIndexValid(rowIndex) || !isArrayIndexValid(colIndex)) {
            System.out.println("Индексы строки и колонки должны быть в диапазоне от 0 до " + SIZE);
            return false;
        }
        if (map[rowIndex][colIndex] != DOT_EMPTY) {
            if (isHumanTurn(symbol)) {
                System.out.println("Данная ячейка уже занята!");
            }
            return false;
        }

        return true;
    }

    private static boolean isHumanTurn(char symbol) {
        return symbol == DOT_X;
    }

    private static boolean isArrayIndexValid(int index) {
        return index >= 0 && index < SIZE;
    }

    private static void printMap() {
        printHeader();
        printMapState();
        System.out.println();
    }

    private static void printMapState() {
        for (int rowIndex = 0; rowIndex < SIZE; rowIndex++) {
            System.out.print((rowIndex + 1) + " ");

            for (int colIndex = 0; colIndex < SIZE; colIndex++) {
                System.out.print(map[rowIndex][colIndex] + " ");
            }

            System.out.println();
        }
    }

    private static void printHeader() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void initializeGame() {
        for (int rowIndex = 0; rowIndex < SIZE; rowIndex++) {
            for (int colIndex = 0; colIndex < SIZE; colIndex++) {
                map[rowIndex][colIndex] = DOT_EMPTY;
            }
        }
    }

}
