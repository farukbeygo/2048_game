import java.util.Scanner;
import java.util.Random;

public class my2048game {
    // define instances
    private static final int NO_OF_ROWS = 4;
    private static final int NO_OF_COLUMNS = 4;

    // game object and it's position
    private gameObjects object_1;
    private gameObjects object_2;
    private gameObjects object_3;
    private gameObjects object_4;
    private gameObjects object_5;
    private gameObjects object_6;
    private gameObjects object_7;
    private gameObjects object_8;
    private gameObjects object_9;
    private gameObjects object_10;
    private gameObjects object_11;
    private gameObjects object_12;
    private gameObjects object_13;
    private gameObjects object_14;
    private gameObjects object_15;
    private gameObjects object_16;

    Random position = new Random();

    /**
     * This method sets up the game by creating the game objects and
     * positioning them in initial positions (player in upper left corner,
     * monster in the lower right corner and bug in the middle of the room).
     */
    public void setupGame() {
        Integer position_x = position.nextInt(4);
        Integer position_y = position.nextInt(4);
        this.object_1 = new gameObjects(2);
        this.object_1.positionAt(position_x, position_y);
        this.object_2 = new gameObjects(2);
        this.object_2.positionAt(position_y, position_x);
    }

    /**
     * This method displays the room and the game objects in their current
     * locations.
     */
    public void displayBoard() {
        displayRowSeparator();
        for (int i = 0; i < NO_OF_ROWS; i++) {
            for (int j = 0; j < NO_OF_COLUMNS; j++) {
                System.out.print("|");
                if (j == object_1.getX() && i == object_1.getY()) {
                    System.out.print(" " + object_1.getNumber() + " ");
                } else if (j == object_2.getX() && i == object_2.getY()) {
                    System.out.print(" " + object_2.getNumber() + " ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.print("|");
            displayRowSeparator();
        }
    }

    /*
     * This method is used by displayBoard to print one line of separator between
     * successive rows.
     */
    private void displayRowSeparator() {
        System.out.print("\n-");
        for (int c = 0; c < NO_OF_COLUMNS; c++) {
            System.out.print("----");
        }
        System.out.print("\n");
    }

    /**
     * @return the player of this game
     */
    public gameObjects getObject() {
        return this.object_1;
    }

    public static void main(String[] args) {
        my2048game game = new my2048game();
        game.setupGame();

        game.displayBoard();
    }

}
