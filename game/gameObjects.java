public class gameObjects {
    // define instances
    private int number;
    private int x;
    private int y;
    private Direction dir;

    public gameObjects(int number) {
        this.number = number;
        this.positionAt(0, 0);
        this.dir = Direction.NORTH;
    }

    /**
     * @return icon used to display this player
     */
    public Integer getNumber() {
        return this.number;
    }

    /**
     * @return x coordinate of this object
     */
    public int getX() {
        return this.x;
    }

    /**
     * @return y coordinate of this object
     */
    public int getY() {
        return this.y;
    }

    /**
     * @return current direction in which object moves
     */
    public Direction getDirection() {
        return this.dir;
    }

    /**
     * This method positions this object at provided location.
     * 
     * @param x x coordinate at which it is to be located
     * @param y y coordinate at which it is to be located
     */
    public void positionAt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * This method changes the direction of all objects to specified value.
     */
    public void changeDirection(Direction dir) {
        this.dir = dir;
    }
}
